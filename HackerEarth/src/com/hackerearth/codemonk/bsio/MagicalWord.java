/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 10 Jul, 2018, 9:58 PM,
        @File-Name : MagicalWord.java

 */

package com.hackerearth.codemonk.bsio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MagicalWord
{

        public static void main(String [] args) throws Exception
        {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            short T = Short.parseShort(br.readLine());
            short L = 0;
            short low = 0;
            short high = 0;
            short mid = 0;
            char str [] = null;
            short b [] = {67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113};
            for (short i = 0; i < T; i += 1)
            {

                L = Short.parseShort(br.readLine());
                str = (br.readLine()).toCharArray();
                for (short j = 0; j < str.length; j += 1)
                {

                    low = 0;
                    high = (short)(b.length - 1);
                    if ((short)str[j] < (short)65)
                        str[j] = 'A';
                    else if (((short)str[j] > (short)90) && ((short)str[j] < (short)97))
                        str[j] = (((short) str[j] - 90) < (97 - (short) str[j])) ? 'Z' : 'a';
                    else if ((short)str[j] > (short)122)
                        str[j] = 'z';
                    else
                        ;
                    while (low <= high)
                    {

                        mid = (short)((low + ((high - low)) / 2));
                        if ((short)str[j] == b[mid])
                            break;
                        else if ((short)str[j] > b[mid])
                            low = (short)(mid + 1);
                        else
                            high = (short)(mid - 1);

                    }
                    if ((short)str[j] < b[mid])
                    {

                        if ((mid - 1) >= 0)
                            str[j] = (Math.abs((short) str[j] - b[mid - 1]) < Math.abs((short) str[j] - b[mid])) ? (char) b[mid - 1] : ((Math.abs((short) str[j] - b[mid - 1]) == Math.abs((short) str[j] - b[mid])) ? ((b[mid - 1] < b[mid]) ? (char) b[mid - 1] : (char) b[mid]) : (char) b[mid]);
                        else
                            str[j] = (char)b[mid];

                    }
                    else if ((short)str[j] > b[mid])
                    {

                        if ((mid + 1) <= 11)
                            str[j] = (Math.abs((short) str[j] - b[mid + 1]) < Math.abs((short) str[j] - b[mid])) ? (char) b[mid + 1] : ((Math.abs((short) str[j] - b[mid + 1]) == Math.abs((short) str[j] - b[mid])) ? ((b[mid + 1] < b[mid]) ? (char) b[mid + 1] : (char) b[mid]) : (char) b[mid]);
                        else
                            str[j] = (char)b[mid];

                    }
                    else
                        str[j] = (char)b[mid];

                }
                System.out.println(new String(str));

            }
            br.close();

        }

}
