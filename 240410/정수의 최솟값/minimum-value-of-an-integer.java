import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(MinNum(a,b,c));
    }

    public static int MinNum(int a, int b, int c){
        int min = a;
        if (a>=b && b<=c){
            min = b;
        }else if(a >=c && b>=c){
            min =c;
        }
        return min;
    }

}