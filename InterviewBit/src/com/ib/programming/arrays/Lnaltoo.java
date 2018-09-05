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

        int large_idx = 0, i = 0, flag = 0, sim_large = 0;
        for (i = 0; i < nums.length; i += 1)
        {

            if (nums[i] == nums[large_idx])
            {

                sim_large += 1;

            }
            if (nums[i] > nums[large_idx])
            {

                large_idx = i;
                sim_large = 1;

            }

        }
        for (i = 0; i < nums.length; i += 1)
        {
            if (large_idx == i)
            {

                continue;

            }
            if (nums[large_idx] >= (2 * nums[i]))
            {

                flag++;

            }

        }
        //System.out.println(sim_large + " " + flag + " " + large_idx);
        if (flag == (nums.length - sim_large))
        {

            return (large_idx);

        }
        else
        {

            return (-1);

        }

    }

}
