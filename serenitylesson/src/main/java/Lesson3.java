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

}



