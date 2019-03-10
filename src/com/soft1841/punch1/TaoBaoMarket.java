package com.soft1841.punch1;

/**
 * 继承Market抽象类
 * @author 屏儿
 * 2019/3/10
 */
public class TaoBaoMarket extends Market{
    @Override
    public void shop() {
        System.out.println(name + "网购" + goods);
    }
}
