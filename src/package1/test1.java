package package1;
import java.util.Scanner;
public class test1 extends fistprograme {
    public static void main(String[] args){
        Scanner ss=new Scanner(System.in);
        System.out.print("nhap so X can tim ");
        int x =ss.nextInt();
        int[] array= inputArray();
        int count=fistprograme.count(array,5);
        System.out.println("so luong phan tu bang " + x +" la " + count);
    }
}
