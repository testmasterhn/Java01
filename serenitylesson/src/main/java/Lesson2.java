import java.util.Scanner;

public class Lesson2 {
    public static void chanle(){
        int n, c, l;
        c = l = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int arrayA[] = new int[n];
        int arrayChan[] = new int[n];
        int arrayLe[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arrayA[i] = scanner.nextInt();
        }

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
