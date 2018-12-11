/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sysmanager;

import java.util.Arrays;

/**
 *
 * @author DiegoFernando
 */
public class ArrayCounter {
    
    public static int CountNumbers(int[] numbers, int lesserThan) {
        Arrays.sort(numbers);
        int lessers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < lesserThan) {
                lessers++;
            } else {
                break;
            }
        }
        return lessers;
    }
    
}
