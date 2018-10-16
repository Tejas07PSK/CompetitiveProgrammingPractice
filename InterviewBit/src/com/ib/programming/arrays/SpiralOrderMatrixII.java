/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 16 Oct, 2018, 8:02 AM,
        @File-Name : SpiralOrderMatrixII.java

 */

package com.ib.programming.arrays;

public class SpiralOrderMatrixII
{

    public int [] [] generateMatrix(final int A)
    {

        int lr = 0, ur = A, lc = 0, uc = A;
        int arr [] [] = new int [A] [A];
        int count = 1, t = 0, x = 0, y = 0;
        int offset [] = {0, 1};
        while (count <= (A * A))
        {

            if (((y + offset[1]) == uc) || ((x + offset[0]) == ur) || ((y + offset[1]) < lc) || ((x + offset[0]) < lr))
            {

                if (((y + offset[1]) == uc))
                {

                    lr += 1;

                }
                else if (((x + offset[0]) == ur))
                {

                    uc -= 1;

                }
                else if (((y + offset[1]) < lc))
                {

                    ur -= 1;

                }
                else if (((x + offset[0]) < lr))
                {

                    lc += 1;

                }
                t = offset[0];
                offset[0] = offset[1];
                offset[1] = -t;

            }
            arr[x][y] = count;
            x += offset[0];
            y += offset[1];
            count += 1;

        }
        return (arr);

    }

}
