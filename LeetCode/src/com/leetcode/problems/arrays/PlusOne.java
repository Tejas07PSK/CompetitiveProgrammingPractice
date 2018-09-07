/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 06 Sep, 2018, 12:14 AM,
        @File-Name : PlusOne.java

 */

package com.leetcode.problems.arrays;

import java.util.ArrayList;

public class PlusOne
{

    public int[] plusOne(int[] digits)
    {

        ArrayList <Integer> arr_temp = new ArrayList <Integer> ();
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i -= 1)
        {

            arr_temp.add(0, ((digits[i] + carry) % 10));
            carry =  ((digits[i] + carry) / 10);

        }
        if (carry != 0)
        {

            arr_temp.add(0, carry);

        }
        int arr [] = new int [arr_temp.size()];
        for(int i = 0; i < arr_temp.size(); i += 1)
        {

            arr[i] = arr_temp.get(i);

        }
        return (arr);

    }

}
