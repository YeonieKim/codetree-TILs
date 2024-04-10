import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nNum = sc.nextInt();
        int mNum = sc.nextInt();

        LCD(nNum, mNum);
    }
    public static void LCD(int n, int m){
        int max = 1;
        for(int i=1; i<n && i<m; i++){
            if(n % i == 0 && m % i ==0){
                max = i;
            }
        }
        int min = (n * m) / max;
        System.out.print(min);
    }
}