import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nNum = sc.nextInt();
        int mNum = sc.nextInt();

        int gcd = GCD(nNum, mNum);
        int lcm = (nNum * mNum) / gcd;

        System.out.print(lcm);
    }
    public static int GCD(int n, int m){
        int gcd = 1;

        for(int i=1; i<=Math.min(n,m); i++){
            if(n % i ==0 && m % i ==0){
                gcd = i;
            }
        }
        return gcd;
    }
}