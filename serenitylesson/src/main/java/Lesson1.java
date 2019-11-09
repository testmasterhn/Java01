import java.util.Scanner;

public class Lesson1 {

    public static void countNum(int x){
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int arrayA[] = new int [n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arrayA[i] = scanner.nextInt();
        }

        int count = 0;
        for(int i = 0; i < arrayA.length; i++){
            if(x == arrayA[i]){
                count++;
            }
        }
        System.out.println("Giá trị " + x + " xuất hiện: " + count);
    }

}
