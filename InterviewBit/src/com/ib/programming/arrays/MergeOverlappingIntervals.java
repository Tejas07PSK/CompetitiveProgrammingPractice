/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 10 Oct, 2018, 1:09 AM,
        @File-Name : MergeOverlappingIntervals.java

 */

package com.ib.programming.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingIntervals
{

    public List <Interval> merge(final List<Interval> intervals)
    {

        List <Interval> lst = new ArrayList <Interval> ();
        Collections.sort(intervals, new Comparator <Interval> ()
                                    {
                                        @Override
                                        public int compare(Interval i1, Interval i2)
                                        {

                                            return ((i1.start <= i2.start) ? -1 : 1);

                                        }
                                    }
                         );
        for (Interval i : intervals)
        {


            if ((lst.isEmpty()) || (i.start > (lst.get(lst.size() - 1)).end))
            {

                lst.add(i);

            }
            else
            {

                (lst.get(lst.size() - 1)).end = Math.max(i.end, (lst.get(lst.size() - 1)).end);

            }

        }
        return (lst);

    }

}
