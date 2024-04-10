import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_N = sc.nextInt();
        int num_M = sc.nextInt();
        Ractangle(num_N, num_M);
    }

    public static void Ractangle(int n, int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}