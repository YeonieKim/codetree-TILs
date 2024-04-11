import java.util.Scanner;

public class Main {
    public static int m,d;

    public static boolean isMonth(){
        if(m>12)
            return false;
        return true;
    }

    public static boolean isDate(){
        if(d >31){
            return false;
        }
        if(m == 4|| m == 6|| m == 9|| m ==11){
            if(d>30)
                return false;
        }else if(d > 28 && m == 2){
            return false;
        }
        // if(d <= 31 && m == 1|| m == 3|| m == 5|| m == 7|| m == 8 ||m == 10||m==12)
        //     return true;
        // if(d <= 30 && m == 4|| m == 6|| m == 9|| m ==11)
        //     return true;
        // if(d <= 28 && m == 2)
        //     return true;
        return true;
    }

    public static boolean isExsist(){
        if(isMonth() && isDate()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        d = sc.nextInt();

        if(isExsist()){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }

    }
}