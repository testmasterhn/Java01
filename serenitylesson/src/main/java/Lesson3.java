import java.util.Scanner;

public class Lesson3 {
    public static boolean ktraSoNguyenTo(int j) {
        for(int i=2; i<j; i++){
            if(j%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void showSoNT(int n){
        System.out.println("Các số nguyên tố: " + n);
        for(int j = 2; j<=n; j++){
            if(ktraSoNguyenTo(j)){
                System.out.println(j);
            }
        }
    }

}



