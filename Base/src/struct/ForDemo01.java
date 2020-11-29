package struct;

public class ForDemo01 {
    public static void main(String[] args) {
        //计算0-100之间所有奇数和偶数的和
        int oddSum = 0;
        int evenSum = 0;
        for (int n = 0; n <=100; n++) {
            if (n % 2 != 0) {
                oddSum += n;
            } else {
                evenSum += n;
            }

        }
        System.out.println("奇数的和："+oddSum);
        System.out.println("偶数的和："+evenSum);
    }
}
