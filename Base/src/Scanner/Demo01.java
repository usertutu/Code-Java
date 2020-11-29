package Scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
//创建一个扫描器对象，勇于接受键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收：");

        if (scanner.hasNext()) {
            /*
             * next():
             * 1:一定要读取到有效字符后才可以结束输入
             * 2：对输入有效字符之前遇到的空白，next（）方法会自动将其去掉
             * 3：只有输入有效字符后才能将其后面输入的空白作为分隔符或者结束符
             * 4：next（） 不能带有空格的字符串
             *
             * nextline（）：
             * 1：以Enter为结束符，
             * 2：可以获得空白
             *
             *
             * */

            String str = scanner.nextLine();
            System.out.println("输出的内容为：" + str);
        }
        //但凡属于io流的类如果不关闭就会一直占用资源，要养成好习惯用完就关闭
        scanner.close();
    }
}
