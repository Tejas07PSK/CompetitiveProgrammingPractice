/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 05 Sep, 2018, 5:00 PM,
        @File-Name : Lnaltoo.java

 */

package com.ib.programming.arrays;

public class Lnaltoo
{

    public int dominantIndex(int[] nums)
    {

        int large_idx = 0, i = 0;
        for (i = 0; i < nums.length; i++)
        {

            if (nums[i] > nums[large_idx])
            {

                large_idx = i;

            }

        }
        for (i = 0; i < nums.length; i++)
        {

            if ((i != large_idx) && (nums[large_idx] < (2 * nums[i])))
                return (-1);

        }
        return (large_idx);

    }

}
