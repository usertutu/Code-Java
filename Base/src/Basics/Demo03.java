package Basics;

public class Demo03 {
    public static void main(String[] args) {
        //整数扩展  进制

        int i=10;
        int i2=010;//八进制
        int i3=0x10 ;//十六进制0x 0~9 A~F

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);


        // 浮点数扩展
        //float 有限 离散 舍入误差  大约  接近但不等于
        //double

        float f=0.f;//0.1
        double d=1.0/10;//0.1

        System.out.println(f==d);//false


        float d1=212212121311f;
        float d2=d1+1;
        System.out.println(d1==d2);//true



        //字符扩展----------所有的字符本质还是数字
        char c1='a';
        char c2='蛤';

        System.out.println(c1);
        System.out.println((int)c1);//强转
        System.out.println(c2);
        System.out.println((int)c2);//强转

//转义字符
        // \t 制表符
        // \n 换行
        System.out.println("============================");
        String sa=new String("hello");
        String sb=new String("hello");
        System.out.println(sa==sb); //false
        String sc="hello";
        String sd="hello";
        System.out.println(sc==sd);//true
    }
}
