package com.soft1841.punch3;

/**
 * String StringBuffer StringBuilder的比较
 *
 * @author 屏儿
 * 2019/03/16
 */

public class StringTest {
    //定义循环次数
    private static int time = 10000;

    public static void main(String[] args) {
        testString();
        testStringBuffer();
        teatStringBuilder();
    }

    private static void teatStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            stringBuilder.append("java");
        }
        long over = System.currentTimeMillis();
        System.out.println("操作StringBuilder类型使用的时间为：" + (over - begin) +
                "毫秒");
    }

    private static void testStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            stringBuffer.append("java");
        }
        long over = System.currentTimeMillis();
        System.out.println("操作StringBuffer类型使用的时间为：" + (over - begin) +
                "毫秒");
    }

    private static void testString() {
        String s = "";
        //获取以毫秒为单位的当前开始时间
        long begin = System.currentTimeMillis();
        //调用10000的String的拼接操作，每次都会生成新的String对象
        for (int i = 0; i < time; i++) {
            s += "java";
        }
        long over = System.currentTimeMillis();
        System.out.println("操作String类型使用的时间为：" + (over - begin) +
                "毫秒");
    }
}
