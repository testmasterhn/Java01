import java.util.Scanner;

public class Lesson3_Test extends Lesson3 {
        public static void main(String args[]) {
            System.out.println("Nhap X: ");
            int n = new Scanner(System.in).nextInt();
            System.out.println("Các số nguyên tố: " + n);
            for(int j = 2; j<=n; j++){
                if(ktraSoNguyenTo(j)){
                    System.out.println(j);
                }
            }
        }
    }

