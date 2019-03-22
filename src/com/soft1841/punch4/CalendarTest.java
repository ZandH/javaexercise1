package com.soft1841.punch4;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar类
 *
 * @author 屏儿
 * 2019/03/22
 */
public class CalendarTest {
    public static void main(String[] args) {
        //创建Calendar对象
        Calendar c = Calendar.getInstance();
        //获取年
        int year = c.get(Calendar.YEAR);
        //获取日份。0表示一月份
        int month = c.get(Calendar.MONTH);
        //获取日期
        int day = c.get(Calendar.DAY_OF_MONTH);
        //获取小时
        int hour = c.get(Calendar.HOUR_OF_DAY);
        //获取分钟
        int minute = c.get(Calendar.MINUTE);
        //获取秒
        int second = c.get(Calendar.SECOND);
        System.out.println("当前时间：" + year + "-" + day + "" + hour + ":" + minute + ":" + second);
        //将Calendar对象转换成Date对象
        Date date = c.getTime();
        //获取当前毫秒
        Long time = c.getTimeInMillis();
        System.out.println("当前时间：" + date);
        System.out.println("当前毫秒：" + time);

    }
}
