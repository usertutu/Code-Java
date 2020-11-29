package Basics;

public class Demo05 {
    public static void main(String[] args) {
        /*
         * 低---------》高
         * byte,short,char -->int-->long-->float-->double
         * */
        int i = 128;
        byte b = (byte) i;//内存溢出
        double d = i;

        //强制转换 （类型）变量名  高--->低

        //自动转换  低--》高
        System.out.println(i);
        System.out.println(b);
        System.out.println(d);

        /**
         * 注意点：
         *  1.不能对布尔值进行转换
         *  2.不能把对象类型转换不相干类型
         *  3.在把高容量转换到低容量的时候，强制转换
         *  4.转换的时候可能存在内存溢出，或者精度问题
         */


        //JDK 7新特性  数字之间可以用下划线分割
        int money=10_0000_0000;
        int years=20;
        int total=money*years;// -1474836480
        long total2=money*years; //默认是int，转换之前已存在问题？
        long total3=money*((long)years);//先把一个数转换为long
        System.out.println(total);

    }
}
