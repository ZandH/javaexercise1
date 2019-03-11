package com.soft1841.punch3;

import java.util.Scanner;

/**
 * 异常处理代码
 * @author 屏儿
 * 2019/03/11
 */
public class Tomato {
    public static void main(String[] args) {
        //创建控制台输入对象
        Scanner scanner = new Scanner(System.in);
        //控制台输出提示信息
        System.out.println("今天的西红柿单价（单价格式为“3.00”）：");
        //把控制台输入的西红柿单价赋值给变量dayPrice
        String dayPrice = scanner.next();
        //控制台输入的字符串长度为4时
        if (dayPrice.length() == 4){
            try {
                String message = "西红柿："+dayPrice+"元/500克";
                String[] stringArr = message.split(":");
                String unitPriceString = stringArr[2].substring(0,4);
                double weight = 650;
                double unitPriceDou = Double.parseDouble(unitPriceString);
                System.out.println(message+",顾客买了"+weight+"克的西红柿，" + "需支付"+(float)(weight/500*unitPriceDou)+"元");


        }catch (ArrayIndexOutOfBoundsException aiobe){
                aiobe.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                scanner.close();
                System.out.println("控制台输入对象被关闭");
            }
            }else {
            System.out.println("违规操作："+"输入西红柿单价时小数点后须保留两位有效数字(如3.00)！");

        }

    }

}
