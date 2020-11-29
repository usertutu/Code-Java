package struct;

public class SwitchDemo {
/*
*switch 语句中的变量类型可以是
* byte，short，int或者char
* 从javaSE7开始
* switch 支持字符串String 类型
* 同时 case 标签必须是字符串常量或者字面量
*
*
* ps：反编译概念
* */
    public static void main(String[] args) {
char g='1';
//case 击透
switch (g){
    case '1':
        System.out.println('1');
        break;
    case '2':
        System.out.println('2');
        break;
    case '3':
        System.out.println('3');
        break;
        default:
            System.out.println("no");



}
    }
}
