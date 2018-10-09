/*

        @Author : Tejas07PSK (Palash Sarkar),
        @CreatedON : 09 Oct, 2018, 9:28 PM,
        @File-Name : MergeIntervals.java

 */

package com.ib.programming.arrays;

import java.util.ArrayList;
import java.util.List;

class Interval
{

    public int start;
    public int end;

    Interval()
    {

        start = 0;
        end = 0;

    }
    Interval(int s, int e)
    {

        start = s;
        end = e;

    }

}

public class MergeIntervals
{

    public ArrayList <Interval> insert(final List <Interval> intervals, final Interval newInterval)
    {

        final ArrayList <Interval> lst = new ArrayList <Interval> ();
        int c = 0;
        // put all intervals ending before newInterval
        while ((c < intervals.size()) && ((intervals.get(c)).end < newInterval.start))
        {

            lst.add(intervals.get(c++));

        }
        // combine all overlapping intervals
        while ((c < intervals.size()) && ((intervals.get(c)).start <= newInterval.end))
        {

            newInterval.start = Math.min((intervals.get(c)).start, newInterval.start);
            newInterval.end = Math.max((intervals.get(c)).end, newInterval.end);
            c += 1;

        }
        lst.add(newInterval); // add the resultant combined interval
        // add all the remaining intervals
        while(c < intervals.size())
        {

            lst.add((intervals.get(c++)));

        }
        return (lst);

    }

}
