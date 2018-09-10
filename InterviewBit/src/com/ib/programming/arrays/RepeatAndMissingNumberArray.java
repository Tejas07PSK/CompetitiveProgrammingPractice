/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 09 Sep, 2018, 11:32 PM,
        @File-Name : RepeatAndMissingNumberArray.java

 */

package com.ib.programming.arrays;

public class RepeatAndMissingNumberArray
{

    public int[] repeatedNumber(final int [] arr)
    {

        int[] result = new int[2];
        int n = arr.length, i = 0;
        for(i = 0; i < n; i += 1)
        {

            if(arr[Math.abs(arr[i]) - 1] > 0)
            {

                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];

            }
            else
            {

                result[0] = Math.abs(arr[i]);

            }

        }
        for(i = 0; i < n; i += 1)
        {

            if(arr[i] > 0)
            {

                result[1] = i + 1;
                break;

            }

        }
        return (result);

    }

}
