import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt =0;
        for(int i =a; i<=b; i++){
            if(isMagicNumber(i) || multiple3(i) )
                cnt++;
        }
        System.out.print(cnt);
    }
    public static boolean isMagicNumber(int n){
        int frontNum = n / 10;
        int backNum = n % 10;
        return frontNum == 3 || frontNum == 6 || frontNum == 9 || backNum == 3 || backNum == 6 || backNum == 9;
    }
    public static boolean multiple3(int n){
        return n % 3 ==0 ;
    }
}