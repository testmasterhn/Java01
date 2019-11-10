package vn.testmaster.autotest;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import vn.testmaster.autotest.Sesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class Sesson1Test
{
    /**
     * Test method for CountNumberExist method
     */
    @Test
    public void Test_CountNumberExist()
    {
        //Given
        int[] arrNumber = {1,2,3,4,5,6,7,8,3,4,5,6};
        int x = 6;
        //When
        Sesson1 s1 = new Sesson1();
        int result = s1.CountNumberExist(arrNumber, x);

        //Then
        Assert.assertEquals(2, x);
    }

    /*
        Test method for SeparateEvenNumberArray method
     */
    @Test
    public void Test_SeparateEvenNumberArray()
    {
        //Given
        int[] arrNumber = {1,2,3,4,5,6,7,8};
        int[] expectedNumber = {2,4,6,8};

        //When
        Sesson1 s1 = new Sesson1();
        List<Integer> actualNumber = s1.SeparateEvenNumberArray(arrNumber);

        //Then
        //Compare 2 mang bang cach chuyen het sang string va compare 2 chuoi string nay
        Assert.assertEquals(Arrays.toString(expectedNumber), Arrays.toString(actualNumber.toArray()));
    }

    @Test
    public void Test_GetPrimeNumbers()
    {
        //Given
        int[] arrNumber = {1,2,3,4,5,6,7,8};
        int[] expectedNumber = {1,2,3,5,7};

        //When
        Sesson1 s1 = new Sesson1();
        List<Integer> actualNumber = s1.GetPrimeNumbers(arrNumber);

        //Then
        //Compare 2 mang bang cach chuyen het sang string va compare 2 chuoi string nay
        Assert.assertEquals(Arrays.toString(expectedNumber), Arrays.toString(actualNumber.toArray()));
    }
}
