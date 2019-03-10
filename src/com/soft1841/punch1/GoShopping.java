package com.soft1841.punch1;

/**
 * 调用shop（）方法分别输出结果
 * @author 屏儿
 * 2019/03/10
 */
public class GoShopping {
    public static void main(String[] args) {
        //使用派生类对象创建抽象类对象
        Market market = new WallMarket();
        market.name = "沃尔玛";
        market.goods = "七匹狼西服";
        market.shop();
        //使用派生类对象创建抽象类对象
        market = new TaoBaoMarket();
        market.name = "淘宝";
        market.goods = "韩都衣舍花裙";
        market.shop();
    }
}
