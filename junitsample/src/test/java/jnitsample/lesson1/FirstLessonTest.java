package jnitsample.lesson1;

import junitsample.lesson1.FirstLesson;
import org.junit.Assert;
import org.junit.Test;

public class FirstLessonTest {

    @Test
    public void testCount(){
        int[] array=new int[] {1,3,5,6,3,4,3};
        int x = 0x3;
        FirstLessonTest ls= new FirstLessonTest();
        Assert.assertEquals(3 , FirstLesson.countNumber(array,x));

}
}


