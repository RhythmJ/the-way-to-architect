package com.way.architect.datastructure.queue;

import com.way.architect.common.util.Print;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * 装苹果的篮子
 *
 * @author majunjie
 * @date 2018/7/6 18:25
 */
@Slf4j
public class Basket {

    /**
     * 只能装3个苹果的篮子
     */
    private BlockingQueue<String> basket = new ArrayBlockingQueue<>(3);

    public void produce() throws InterruptedException {
        basket.put("produce an apple");
    }

    public String consume() throws InterruptedException {
        return basket.take();
    }

    public int getAppleNumber() {
        return basket.size();
    }

    public static void testBasket() {
        Basket basket = new Basket();

        ExecutorService service = new ThreadPoolExecutor(3, 3, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3));
        Producer producer = basket.new Producer();
        Consumer consumer = basket.new Consumer();
        service.submit(producer);
        service.submit(consumer);

        // 程序运行10s后，所有任务停止
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        service.shutdownNow();
    }

    public class Producer implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    // 生产苹果
                    Print.info("生产者准备生产苹果");
                    produce();
                    Print.info("生产者生产苹果完毕");
                    Print.info("生产完后有苹果："+getAppleNumber()+"个");
                    // 休眠300ms
                    Thread.sleep(300);
                }
            } catch (InterruptedException ex) {
            }
        }
    }

    public class Consumer implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    // 消费苹果
                    Print.info("消费者准备消费苹果");
                    consume();
                    Print.info("消费者消费苹果完毕");
                    Print.info("消费完后有苹果："+getAppleNumber()+"个");
                    // 休眠1000ms
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ex) {
            }
        }
    }


    public static void main(String[] args) {
        testBasket();
    }



}
