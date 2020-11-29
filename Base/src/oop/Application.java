package oop;

public class Application {
    public static void main(String[] args) {
Student xiaoming =new Student();
Student xh=new Student();


xiaoming.name="小明";
xiaoming.age=4;

        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);


        xh.name="小红";
        xh.age=1;
        System.out.println(xh.name);
        System.out.println(xh.age);
    }
}
