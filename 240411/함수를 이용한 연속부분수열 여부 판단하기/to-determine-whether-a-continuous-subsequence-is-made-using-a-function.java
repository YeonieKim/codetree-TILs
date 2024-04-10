import java.util.Scanner;

public class Main {
    public static boolean compareArr(int[] a, int[] b){
        for(int i = 0; i<a.length; i++){
            int num=0;
            if(a[i]==b[0]){
                for(int j = 1; j <b.length; j++){
                    if(a[i+j] == b[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i = 0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        if(compareArr(arr1, arr2)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }

    }
}