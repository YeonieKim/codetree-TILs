import java.util.Scanner;

public class Main {
    public static int y,m,d;

    public static boolean yoondal(){
        if(y % 4 != 0)
            return false;
        if(y%100 == 0 && y%400 != 0)
            return false;
        return true;
    }
    public static int isDate(){
        if(m == 1|| m==3||m==5||m==7||m==8||m==10||m==12)
            return 31;
        if(yoondal() && m == 2)
            return 29;
        else if(m == 2)
            return 28;
        if(m == 4|| m == 6|| m == 9|| m ==11)
            return 30;
        return 100;
    }

    public static boolean isExsist(){
        if(isDate() < d)
            return false;
        return true;
    }

    public static void weather(){
        if(m>=3 && m <=5)
            System.out.print("Spring");
        else if(m>=6 && m<=8)
            System.out.print("Summer");
        else if(m>=9 && m<=11)
            System.out.print("Fall");
        else
            System.out.print("Winter");
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        m = sc.nextInt();
        d = sc.nextInt();

        if (isExsist())
            weather();
        else
            System.out.print(-1);
    }       
}