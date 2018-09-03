/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 03 Sep, 2018, 3:45 PM,
        @File-Name : Spiral1.java

 */

package com.ib.programming.arrays;

public class Spiral1
{
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public int[] spiralOrder(final int[][] A)
        {

            int lr = 0, ur = A.length - 1, lc = 0, uc = A[0].length - 1;
            int arr [] = new int [(A.length * A[0].length)];
            int count = 0, temp = 0, x = 0, y = 0;
            int offset [] = {0, 1};
            while (count < (A.length * A[0].length))
            {

                if (((y + offset[1]) > uc) || ((x + offset[0]) > ur) || ((y + offset[1]) < lc) || ((x + offset[0]) < lr))
                {

                    if (((y + offset[1]) > uc))
                    {

                        lr += 1;

                    }
                    if (((x + offset[0]) > ur))
                    {

                        uc -= 1;

                    }
                    if (((y + offset[1]) < lc))
                    {

                        ur -= 1;

                    }
                    if (((x + offset[0]) < lr))
                    {

                        lc += 1;

                    }
                    temp = offset[0];
                    offset[0] = offset[1];
                    offset[1] = -temp;

                }
                arr [count] = A[x][y];
                x += offset[0];
                y += offset[1];
                count += 1;

            }
            return (arr);

        }

}
