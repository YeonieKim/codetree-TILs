import java.util.Scanner;

public class Main {
    public static boolean ongeonsu(int o){
        if(o % 2 == 0){
            return false;
        }
        if(o % 10 == 5){
            return false;
        }
        if(o %3 == 0 && o % 9!=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt =0;
        for (int i =a; i<=b; i++){
            if(ongeonsu(i)){
                cnt ++;
            }
        
        }
        System.out.print(cnt);
    }
}