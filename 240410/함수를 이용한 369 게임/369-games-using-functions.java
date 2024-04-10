import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt =0;
        for(int i = a; i<=b; i++){
            if(isMagicNumber(i))
                cnt++;
        }
        System.out.print(cnt);
    }
    public static boolean contain369(int n){
        while(n > 0){
            if(n %10 == 3 || n % 10 ==6 || n % 10 ==9)
                return true;
            n /= 10;
        }
        return false;
    }
    public static boolean isMagicNumber(int n){
        int frontNum = n / 10;
        int backNum = n % 10;
        return  (n % 3 ==0) || contain369(n);
    }
}