package array;

import java.util.Arrays;

public class Demo03 {
    //稀疏数组概念
    public static void main(String[] args) {
        //冒泡排序
        //1.比较数组中，两个相邻的元素，如果第一个数比第二个数大，则交换位置
        //2.每一次比较，都会产生一个最大或者最小的数字
        //3.下一轮则可以少一次排序！
        //4.依次循环，直到结束
        int[] a = {1, 2, 343, 112, 23, 345, 63};
       int [] sort1=sort(a);

        System.out.println(Arrays.toString(sort1));

    }

    public static int[] sort(int[] array) {

        int temp = 0;

        for (int i = 0; i < array.length-1; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] <array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        return array;
    }

}
