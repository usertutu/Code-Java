package Basics;

public class Demo06 {
    //类变量
    static double salaty = 3988;

    //常量---修饰符，不存在先后顺序
    final  double BB=520;

    //属性：变量

    //实例变量：从属于对象： 如果不自动初始化，这个类型的默认
    String name;
    int age;

    //main 方法
    public static void main(String[] args) {
//局部变量：必须声明和初始值
        int i = 10;
        System.out.println('i' + i);

        Demo06 demo06 = new Demo06();
        System.out.println(demo06.name);
        System.out.println(demo06.age);
    }

    //其他方法
    public void add() {

        System.out.println(salaty);
    }
}
