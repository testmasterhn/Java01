import java.util.Scanner;

public class Lesson2 {
    public static void chanle(int arrayA[]){
        int c, l;
        c = l = 0;
        int arrayChan[] = new int [arrayA.length];
        int arrayLe[] = new int [arrayA.length];
        for(int i = 0; i < arrayA.length; i++){
            if(arrayA[i] % 2 == 0){
                arrayChan[c] = arrayA[i];
                c++;
            } else {
                arrayLe[l] = arrayA[i];
                l++;
            }
        }
        System.out.println("Các phần tử của mảng chẵn là: ");
        for (int i = 0; i < c; i++) {
            System.out.print(arrayChan[i] + "\t");
        }

        System.out.println("\nCác phần tử của mảng lẻ là: ");
        for (int i = 0; i < l; i++) {
            System.out.print(arrayLe[i] + "\t");
        }
    }
}
