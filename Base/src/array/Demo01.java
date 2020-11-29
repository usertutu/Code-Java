package array;

public class Demo01 {
    //变量的类型 变量的名字 = 变量的值
    //数组类型

    public static void main(String[] args) {

        int[] nums;
        nums = new int[10];//这里面可以存放10个int类型的数字

        nums[0] = 1;
        nums[0] = 1;
        nums[0] = 1;
        nums[0] = 1;
        nums[0] = 1;
        nums[0] = 1;

        //计算所有元素的和
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

        }
        System.out.println(sum);

        /*
        * 数组的四个基本特点：
        *  ·其长度是确定的，一旦被创建，其大小是不可改变的
        *  ·其数组必须是相同类型，不允许出现混合类型
        *  ·数组中的元素可以是任意数据类型，包括基本和应用类型
        *  ·数组变量属于应用类型，数组也可以看成对象，数组中的每个元素相当于该对象的成员变量
        *  ·数组本身就是对象，java中对象是在堆中，因此数组无论如何保存原始类型还是其他对象类型，数组对象本身在堆中
        *
        * */

    }
}
