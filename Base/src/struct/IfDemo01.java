package struct;

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入内容：");
       int  s=scanner.nextInt();

        if (s>60){
            System.out.println("yes");
        } else if(s==80){
            System.out.println("good");
        }else{
            System.out.println("no");
        }

        scanner.close();
    }
}
