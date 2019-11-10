package package1;
import java.util.Scanner;
public class fistprograme {
    public static void main( String[] args )
    {
        Scanner ss=new Scanner(System.in);
        System.out.print("nhap so X can tim ");
        int x =ss.nextInt();
        int[] array= inputArray();
        int count=count(array,x);
        System.out.println("so luong phan tu bang " + x +" la " + count);
        ss.close();
        int[] arrayC=new int[mangChan(array).length];
        arrayC=mangChan(array);
        int[] arrayL=new int[mangLe(array).length];
        arrayL=mangLe(array);
        System.out.println("phan tu chan cua mang la \n");
        outputArray(arrayC);
        System.out.println("phan tu le cua mang la \n");
        outputArray(arrayL);
        checkSntlessX(array, x);
    }
    public static int count(int[] args, int x)
    {
        int countX=0;
        for(int temp=0; temp < args.length; temp++)
        {
            if(args[temp]==x)
            {
                countX++;
            }
        }
        return  countX;
    }
    public static int[] inputArray()
    {
        System.out.print(" nhap so luong phan tu cua mang");
        Scanner sc  =new Scanner(System.in);
        int n=sc.nextInt();
        int[] array= new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            array[i]=sc.nextInt();
        }
        sc.close();
        return array;
    }
    public static void outputArray(int[] args)
    {
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i] + "\t");
        }
    }
    public static int[] mangChan(int[] args)
    {
        int tempC=0;
        int[] arrayC=new int[args.length];
        for(int i=0; i< args.length;i++)
        {
            if(args[i]%2==0)
            {
                arrayC[tempC]=args[i];
                tempC++;
            }
        }
        return arrayC;
    }
    public static int[] mangLe(int[] args)
    {
        int tempL=0;
        int[] arrayL=new int[args.length];
        for(int i=0; i< args.length;i++)
        {
            if(args[i]%2!=0)
            {
                arrayL[tempL]=args[i];
                tempL++;
            }
        }
        return arrayL;
    }
    public static boolean SNT(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void checkSntlessX(int[] agrs,int x)
    {
        int count=0;
        for(int j=0; j<agrs.length;j++)
        {
            if(SNT(agrs[j])==true && agrs[j]<x)
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("khong co so nguyen to nho hon "+ x +" trong mang" );
        }else {
            System.out.println("so nguyen to nho hon "+ x +" trong mang la " );
            for(int i=0; i<agrs.length;i++)
            {
                if(SNT(agrs[i])==true && agrs[i]<x)
                {
                    System.out.println(agrs[i]);
                }
            }
        }

    }
}
