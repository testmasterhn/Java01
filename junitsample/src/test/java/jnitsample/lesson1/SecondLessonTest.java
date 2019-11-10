package jnitsample.lesson1;


import junitsample.lesson1.SecondLesson;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;


public class SecondLessonTest {
    @Test
    public void checkArray() {
        int[] array = new int[]{1, 2, 4, 5, 2, 32, 5, 2, 52, 9};
        int[] arrayC = new int[]{2, 4, 2, 32, 2, 52};
        int[] arrayL = new int[]{1, 5, 5, 9};
        SecondLesson a = new SecondLesson(array);
        Assert.assertArrayEquals(arrayC, a.mangchan(array));
        Assert.assertArrayEquals(arrayL, a.mangle(array));
    }
}
