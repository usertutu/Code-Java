package Basics;

public class Demo02 {
    /**
     * 1bit 表示1位
     * 1Byte 表示一个字节 1B=8b
     * 1024B=1kb
     * 1024kb=1m
     * 1024m=1g
     *
     */



    public static void main(String[] args) {
        //八大数据类型

        //整数
        int num1 = 10;//占4个字节
        byte num2 = 20; //占一个字节范围：-128-127
        short num3 = 30;//2个字节
        long num4 = 40L; //占8个字节 Long类型要在数字后面加个L

        //小数：浮点数
        float num5 = 89.2F;
        double num6 = 3.122323232323;

        //字符
        char name = '和';

        //布尔值：是非
        boolean flag = true;
    }

}
