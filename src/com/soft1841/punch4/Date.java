package com.soft1841.punch4;

/**
 * Date枚举类型的练习
 *
 * @author 屏儿
 * 2019/03/21
 */
enum Date {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五");
    String dateName;

    Date(String dateName) {
        this.dateName = dateName;
    }

    public String getDateName() {
        return dateName;
    }

    //定义一个静态方法，根据一个简称得到完整的日期名称
    public static Date getResult(String input) {
        switch (input) {
            case "mon":
                return Date.MONDAY;
            case "tue":
                return Date.TUESDAY;
            case "wed":
                return Date.WEDNESDAY;
            case "teu":
                return Date.THURSDAY;
            default:
                return Date.FRIDAY;
        }
    }
}

class EnumTest {
    public static void main(String[] args) {
        Date date = Date.getResult("sum");
        System.out.println(date + "--" + date.getDateName());

    }
}



