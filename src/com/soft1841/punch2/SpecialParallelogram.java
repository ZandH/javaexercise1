package com.soft1841.punch2;

/**
 * 使用接口的相关知识绘制出特殊的平行四边形
 * @author 屏儿
 * 2019/03/10
 */
interface DrawImage {
    //定义抽象方法“画”
    public void draw();
}
//矩形类实现了drawTest接口
class Rectangle implements DrawImage{


    @Override
    //矩形类中实现draw（）方法
    public void draw() {
        System.out.println("画矩形");

    }
}
//正方形类实现了drawTest接口
class Square implements DrawImage{
    @Override
    //正方形类中实现draw（）方法
    public void draw() {
        System.out.println("画正方形");

    }
}
//菱形类实现了drawTest接口
class Diamond implements DrawImage{
    @Override
    public void draw() {
        System.out.println("画菱形");
    }
}
public class SpecialParallelogram{
    public static void main(String[] args) {
        //接口也可以进行向上转型操作
        DrawImage[] images = {new Rectangle(), new Square(), new Diamond()};
        //遍历"画图形"接口类型的数组
        for (int i = 0; i< images.length;i++) {
            images[i].draw();
        }
    }
}
