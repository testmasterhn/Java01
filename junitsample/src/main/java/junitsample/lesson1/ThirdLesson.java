package junitsample.lesson1;

public class ThirdLesson {
    int[] array;
    int x;
    public ThirdLesson(int[] args, int i){
        this.array=args;
        this.x=i;
    }
    public  boolean SNT(int n) {
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
    public int[] SntLessX(int[] array,int x){
        int[] arraySnt=new int[array.length];
        int z=0;
        for (int t=0;t<this.array.length;t++){
            if(SNT(this.array[t])==true&&this.array[t]<x){
              arraySnt[z]=  this.array[t];
              z++;
            }
        }
        int[] arrayResult= new int[z];
        for(int y=0;y<z;y++)    {
            arrayResult[y]=arraySnt[y];
        }
        return arrayResult;
    }



    }
