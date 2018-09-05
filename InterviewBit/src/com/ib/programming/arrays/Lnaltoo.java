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

        int large = Integer.MIN_VALUE, seclarge = Integer.MIN_VALUE, i = 0, index = 0;
        for (i = 0; i < nums.length; i++)
        {

            if (nums[i] > large)
            {

                seclarge = large;
                large = nums[i];
                index = i;

            }
            else if (nums[i] > seclarge)
            {

                seclarge = nums[i];

            }

        }
        return ((large < (2 * seclarge)) ? -1 : index);

    }

}
