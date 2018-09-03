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

            int sr = 0, er = A.length - 1, sc = 0, ec = A[0].length - 1;
            int arr [] = new int [A.length * A[0].length];
            int count = 0;
            int arrow = 0;
            while ((sr <= er) && (sc <= ec))
            {

                if (arrow == 0)
                {

                    for (int i = sc; i<=ec; i += 1)
                    {

                        arr [count] = A[sr][i];
                        count += 1;

                    }
                    sr += 1;

                }
                else if (arrow == 1)
                {

                    for (int i = sr; i<=er; i += 1)
                    {

                        arr [count] = A[i][ec];
                        count += 1;

                    }
                    ec -= 1;

                }
                else if (arrow == 2)
                {

                    for (int i = ec; i>=sc; i -= 1)
                    {

                        arr [count] = A[er][i];
                        count += 1;

                    }
                    er -= 1;

                }
                else if (arrow == 3)
                {

                    for (int i = er; i>=sr; i -= 1)
                    {

                        arr [count] = A[i][sc];
                        count += 1;

                    }
                    sc += 1;

                }
                arrow = (arrow + 1) % 4;

            }
            return (arr);

        }

}
