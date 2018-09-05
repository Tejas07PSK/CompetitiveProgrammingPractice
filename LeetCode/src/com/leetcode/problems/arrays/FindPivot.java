/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 05 Sep, 2018, 1:02 PM,
        @File-Name : FindPivot.java

 */

package com.leetcode.problems.arrays;

public class FindPivot
{

    public int pivotIndex(int[] nums)
    {

        int tot = 0, sum_lft = 0, index = 0;
        for (int num : nums)
        {

            tot += num;

        }
        for (index = 0; index < nums.length; index += 1)
        {

            if (sum_lft == (tot - (sum_lft + nums[index])))
            {

                return (index);

            }
            sum_lft += nums[index];

        }
        return (-1);

    }

}
