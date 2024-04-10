import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(SumNum_Divide10(n));
    }

    public static int SumNum_Divide10(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        sum /= 10;
        return sum;
    }
}