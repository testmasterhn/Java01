import java.util.Scanner;

public class Lesson1 {

    public static void countNum(int x, int arrayA[]){
        int count = 0;
        for(int i = 0; i < arrayA.length; i++){
            if(x == arrayA[i]){
                count++;
            }
        }
        System.out.println("Giá trị " + x + " xuất hiện: " + count);
    }

}
