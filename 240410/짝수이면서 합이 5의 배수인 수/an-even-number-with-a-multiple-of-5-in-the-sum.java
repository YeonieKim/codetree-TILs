import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Even_5(n);
    }

    public static void Even_5(int n){
        int front_num = n / 10;
        int back_num = n % 10;

        if(n % 2 == 0 && (front_num+back_num) %5==0){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}