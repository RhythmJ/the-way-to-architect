package com.way.architect.datastructure.queue;

import java.util.Stack;

/**
 * @author majunjie
 * @date 2018/7/9 14:27
 */
public class SetTest {

    public static String isValid(String expstr) {
        //创建栈
        Stack<String> stack = new Stack<>();

        int i = 0;
        while (i < expstr.length()) {
            char ch = expstr.charAt(i);
            i++;
            switch (ch) {
                case '(':
                    stack.push(ch + "");//左括号直接入栈
                    break;
                case ')':
                    if (stack.isEmpty() || !stack.pop().equals("(")) //遇见右括号左括号直接出栈
                        return "(";
            }
        }
        //最后检测是否为空,为空则检测通过
        if (stack.isEmpty())
            return "check pass!";
        else
            return "check exception!";
    }

    public static void main(String args[]) {
        String expstr = "((5-3)*8-2)";
        System.out.println(expstr + "  " + isValid(expstr));
    }

}
