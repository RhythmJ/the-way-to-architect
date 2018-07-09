package com.way.architect.datastructure.queue;

import com.way.architect.common.util.Print;

import java.util.HashSet;
import java.util.Set;

/**
 * @author majunjie
 * @date 2018/7/9 14:27
 */
public class SetTest {


    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        Print.info(set.add("hello world!"));
        Print.info(set.add("hello world!!"));

    }

}
