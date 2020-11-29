package Scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        //我们可以输入多个数字，并求其总和与平均数
        //每输入一个数字用回车确认，输入给数字来结束输入并输出执行结果

        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int m = 0;
        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            m = m + 1;
            sum += x;
        }
        System.out.println(m + "个数的和为：" + sum);
        System.out.println(m + "个数的平均值是：" + (sum / m));
        scanner.close();
    }
}
