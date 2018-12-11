/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sysmanager.tests;

import com.mycompany.sysmanager.ArrayCounter;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author DiegoFernando
 */
public class ArrayCounterTest {
    
    @Test
    public void testCounting() {
        int[] scrambledArray1 = new int[] {1,3,5,7};
        int[] orderedArray1 = new int[] {1,3,5,7};
        int amountOfLesser1 = ArrayCounter.CountNumbers(scrambledArray1, 4);
        assertEquals(2, amountOfLesser1);
        Assert.assertArrayEquals(scrambledArray1, orderedArray1);
        int[] scrambledArray2 = new int[] {8,5,1,7};
        int[] orderedArray2 = new int[] {1,5,7,8};
        int amountOfLesser2 = ArrayCounter.CountNumbers(scrambledArray2, 3);
        assertEquals(1, amountOfLesser2);
        Assert.assertArrayEquals(scrambledArray2, orderedArray2);
    }
    
}
