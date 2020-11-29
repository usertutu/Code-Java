package struct;

public class ForDemo02 {
    public static void main(String[] args) {
        //联系2： 循环输出1-100之间被5整除，且每行输出三个

        for (int n=0;n<100;n++){
            if(n%5==0){
                System.out.print(n+"\t");
            }if (n%(5*3)==0){
                System.out.println();

            }
        }
    }
}
