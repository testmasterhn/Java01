package lesson;

public class lesson1 {
    int[] array=new int[] {1,3,5,6,3,4,3};
    public static  int countNumber(int[] array,int x){
        int count=0;
        for (int i=0;i<array.length;i++){
            if (array[i]==x){
                count++;}
        }
            return  count;
    }

}
