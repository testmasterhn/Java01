package junitsample.lesson1;



public class SecondLesson {
    int[] array;
    public SecondLesson(int[] args){
        this.array=args;
  }
    public int[] mangchan(int[] array){
        int x=0;
        int[] arrayChan=new int[array.length];
        for(int i=0;i<array.length;i++){
            if(this.array[i]%2==0){
                arrayChan[x]=array[i];
                x++;
            }
        }
        int[] arrayResult= new int[x];
        for(int y=0;y<x;y++)    {
            arrayResult[y]=arrayChan[y];
        }
        return arrayResult;
    }
    public int[] mangle(int[] array){
        int z=0;
        int[] arrayLe=new int[array.length];
        for(int i=0;i<array.length;i++){
            if(this.array[i]%2!=0){
                arrayLe[z]=array[i];
                z++;
            }
        }
        int[] arrayResult= new int[z];
        for(int y=0;y<z;y++)    {
            arrayResult[y]=arrayLe[y];
        }
        return arrayResult;
    }
}


