import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_num = sc.nextInt();
        int m_num = sc.nextInt();

        GCD(n_num, m_num);
    }
    public static void GCD(int n, int m){
        int max = 1;
        for(int i=1; i<n && i<m; i++){
            if(n % i == 0 && m % i == 0){
                max = i;
            }
        }
        System.out.print(max);
    }
}