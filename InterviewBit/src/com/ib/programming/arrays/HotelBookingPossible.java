/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 17 Sep, 2018, 8:05 PM,
        @File-Name : HotelBookingPossible.java

 */

package com.ib.programming.arrays;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class HotelBookingPossible
{

    private static int part1 = 0, part2 = 0;
    public boolean hotel(final ArrayList <Integer> A, final ArrayList <Integer> D, final int K)
    {

        specialQuickSort(A, 0, A.size() - 1);
        specialQuickSort(D, 0, D.size() - 1);
        int rms = 0, i = 0, j = 0;
        while ((i < A.size()) && (j < D.size()) && (rms <= K))
        {

            if (A.get(i) < D.get(j))
            {

                rms += 1;
                i += 1;

            }
            else
            {

                rms -= 1;
                j += 1;

            }

        }
        if (rms <= K)
        {

            return (true);

        }
        else
        {

            return (false);

        }

    }
    private static void specialQuickSort(final ArrayList <Integer> A, final int low, final int high)
    {

        if (low < high)
        {

            partition(A, low, high);
            specialQuickSort(A, low, part1);
            specialQuickSort(A, part2, high);

        }

    }

    private static void partition(final ArrayList <Integer> A, int low, int high)
    {

        Random r = new Random();
        int iterator = low;
        int random_index = low + (r.nextInt(A.size()) % (high - low + 1));
        swap(A, low, random_index);
        int pivot = A.get(low);
        while (iterator <= high)
        {

            if (A.get(iterator) < pivot)
            {

                swap(A, low, iterator);
                iterator += 1;
                low += 1;

            }
            else if (A.get(iterator) > pivot)
            {

                swap(A, high, iterator);
                high -= 1;

            }
            else
            {

                iterator += 1;

            }

        }
        part1 = low - 1;
        part2 = high + 1;

    }

    private static void swap(final ArrayList <Integer> A, final int index1, final int index2)
    {

        if (!((A.get(index1)).equals(A.get(index2))))
        {

            A.set(index1, (A.get(index1) ^ A.get(index2)));
            A.set(index2, (A.get(index1) ^ A.get(index2)));
            A.set(index1, (A.get(index1) ^ A.get(index2)));

        }

    }

}
