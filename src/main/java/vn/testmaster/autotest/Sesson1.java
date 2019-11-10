package vn.testmaster.autotest;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Sesson1
{
    //Lesson 1:
    /*
        Giai thuật: Lặp từ đầu tới cuối các phần tử của mảng A, mỗi lần lặp kiểm tra phần tử ở vị trí hiện tại với
        phần tử X, nếu chúng bằng nhau sẽ tăng biến đếm lên 1. Cuối mảng sẽ trả về giá trị của biến đếm, chính là
        số lần xuất hiện phần tử X trong mảng.
     */
    public int CountNumberExist(int[] A, int X)
    {
        int counter = 0;
        for(int number: A)
        {
            if(number==X)
            {
                counter++;
            }
        }
        return counter;
    }

    //Lesson 2:
    /*
        Mục đích của bài này là biết cách sử dụng mảng động. ArrayList, List
        Giải thuật:
        - Vì không biết mảng đã cho có bao nhiêu số chẵn do đó đầu ra sẽ phải lưu vào một mảng động (LIST).
        - Lặp từ đầu tới cuối mảng, mỗi lần lặp sẽ so sánh số tại vị trí lặp có chia hết cho 2 hay không?
        Nếu chia hết sẽ add vào List để trả ra cho method.
     */
    public List<Integer> SeparateEvenNumberArray(int[] A)
    {
        //Khai báo một list để lưu trữ các số chẵn tìm được
        List<Integer> lstResult = new ArrayList<Integer>();

        //Lặp để tìm số chẵn
        for(int number:A)
        {
            if(number %2==0)
            {
                lstResult.add(number);
            }
        }
        return lstResult;
    }

    //Làm tương tự cho số lẻ.

    //Lesson 3:
    /*
        Tương tự bài 2, bài này cũng có mục đích để biết cách sử dụng mảng động: List hoặc ArrayList
        Giải thuật:
            - Vì không biết mảng đã chó có bao nhiêu số nguyên tố nên đầu ra của method sẽ là 1 ArrayList hoặc List
            - Lặp từ đầu tới cuối mảng, tại mỗi vị trí sẽ kiểm tra xem có tồn tại một số từ 2 tới i/2 mà số đó chia hết
                 hay không? Nếu tồn tại số này thì không phải là số nguyên tố vì số nguyên tố chỉ chia hết cho 1 và chính
                 nó */
    public List<Integer> GetPrimeNumbers(int[] A)
    {
        //Khai báo một ArrayList để lưu trữ kết quả
        List<Integer> lstPrime = new ArrayList<>();
        //Lặp để tìm số nguen to
        for(int number:A)
        {
            //Gia thiet so number la snt
            boolean isPrime = true;
            for (int i=2; i<= number/2; i++)
            {
                if(number%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
            //Kiem tra neu isPrime van = true nghia la ko ton tai uoc thu 3
            if(isPrime)
            {
                lstPrime.add(number);
            }
        }
        return lstPrime;
    }
}
