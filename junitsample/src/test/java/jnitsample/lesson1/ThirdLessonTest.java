package jnitsample.lesson1;

import junitsample.lesson1.ThirdLesson;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ThirdLessonTest {
    @Test
    public void checkArraySnt() {
         int[] array = {1, 2, 4, 5, 2, 32, 5, 2, 52, 9};
         int[] arraySnt = {2,2,2};
         ThirdLesson rd = new ThirdLesson(array, 0x5);
        Assert.assertArrayEquals(arraySnt, rd.SntLessX(array, 5));

}
}
