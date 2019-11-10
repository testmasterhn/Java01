package junitsample.lesson1;

import com.sun.jndi.url.ldap.ldapURLContextFactory;

public class SecondLesson {
    int[] array;
    int[] arrayChan;
    int[] arrayLe;
  public SecondLesson(int[] args){
        this.array=args;
  }
    public int[] mangchan(int[] array)
    {
        int x=0,y=0;
        for(int i=0;i<=array.length;i++){
            if(this.array[i]%2==0){
                this.arrayChan[x]=array[i];
                x++;
            }
        }
        return this.arrayChan;
    }
    public int[] mangle(int[] array)
    {
        int x=0,y=0;
        for(int i=0;i<=array.length;i++){
            if(this.array[i]%2!=0){
                this.arrayLe[y]=array[i];
                x++;
            }
        }
        return this.arrayLe;
    }
}


