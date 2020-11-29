package method;

public class Demo03 {
    public static void main(String[] args) {
printMax(12,23,342,422,3,122,2,323);
printMax(new double[]{1,2,3});

    }

    public  static  void  printMax(double...numbers){
        if (numbers.length==0){
            System.out.println("no agrument passed");
        return;
        }
        double result =numbers[0];

        //排序
        for (int i=1;i<numbers.length;i++){
            if (numbers[i]>result){
                result=numbers[i];
            }
        }
        System.out.println("the max value"+result);

    }
}
