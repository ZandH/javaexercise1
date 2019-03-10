package com.soft1841.punch1;

/**
 * 模拟“去商场买衣服”场景
 * @author 屏儿
 * 2019/3/10
 */
public abstract class Market {
    //商场名称
    public String name;
    //商品名称
    public String goods;
    //抽象方法，用来输出信息
    public abstract void shop();
}
