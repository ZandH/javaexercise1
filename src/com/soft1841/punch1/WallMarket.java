package com.soft1841.punch1;

/**
 * 继承Market抽象类
 * @author 屏儿
 * 2019/03/10
 */
public class WallMarket extends Market{

    @Override
    public void shop() {
        System.out.println(name + "实体店购买" +goods);
    }
}
