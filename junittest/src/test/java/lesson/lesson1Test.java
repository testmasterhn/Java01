package lesson;


import org.junit.Assert;
import org.junit.Test;

public class lesson1Test {

    @Test
    public void testCount(){
        int[] array=new int[] {1,3,5,6,3,4,3};
        int x=8;
        lesson1 ls= new lesson1();
        Assert.assertEquals("0",lesson1.countNumber(array,x));

    }

}
