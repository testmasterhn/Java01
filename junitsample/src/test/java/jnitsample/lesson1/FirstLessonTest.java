package jnitsample.lesson1;

import org.junit.Test;

public class FirstLessonTest {
    @Test
    public void testCount(){
        int[] array=new int[] {1,3,5,6,3,4,3};
        int x=7;
        FirstLessonTest ls= new FirstLessonTest();
        Assert.assertEquals("0",FirstLessonTest.countNumber(array,x));

    }
}
