/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 22 Oct, 2018, 1:00 AM,
        @File-Name : ExcelColumnNumber.java

 */

package com.ib.programming.math;

public class ExcelColumnNumber
{

    private static final int base = 26;
    public int titleToNumber(final String col_id)
    {

        int up = col_id.length() - 1;
        int sum = 0;
        for (int i = 0; i <= up; i += 1)
        {

            sum += ((int)Math.pow(base, (up - i)) * ((int)col_id.charAt(i) - 64));

        }
        return (sum);

    }

}
