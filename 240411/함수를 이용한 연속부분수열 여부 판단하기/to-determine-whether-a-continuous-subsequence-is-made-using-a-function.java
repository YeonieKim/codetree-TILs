import java.util.Scanner;

public class Main {
    public static int maxN = 100;
    public static int n1;
    public static int n2;
    public static int[] a = new int[maxN];
    public static int[] b = new int[maxN];

    public static boolean compareArr(int n){
        for(int i = 0; i<n2; i++){
            if(a[i+n]!=b[i])
                return false;
        }
        return true;
    }
    public static boolean isSubsequence(){
        for(int i = 0; i <= n1-n2; i++){
            if(compareArr(i))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for(int i = 0; i<n1; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<n2; i++){
            b[i] = sc.nextInt();
        }

        if(isSubsequence()){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }

    }
}