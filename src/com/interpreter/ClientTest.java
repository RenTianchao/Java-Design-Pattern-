package com.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ClientTest {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String,Integer>var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果："+expStr+"="+calculator.run(var));
    }

    private static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String,Integer>map = new HashMap<>();
        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.print("请输入" + String.valueOf(ch) + "的值: ");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }

        return map;

    }

    private static String getExpStr() throws IOException {
        System.out.println("输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }
}
