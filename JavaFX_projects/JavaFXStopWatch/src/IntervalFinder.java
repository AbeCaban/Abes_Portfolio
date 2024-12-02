import java.util.List;

/**
 * An interval is a range of values with a beginning and an end.  For our purpose we'll treat every interval as being inclusive.
 *
 * Example: The interval [0-10] contains all of the values 5, 7, 9, among others.
 *
 *
 * 1) Write an Interval class that represents such a range of values.
 *
 * 2) Write an IntervalFinder class that has a method that:
 *    - Takes as inputs a Collection of Intervals, and a data point (of the same type as the Interval's beginning and end points),
 *    - Outputs a Collection of Intervals that contain the data point.
 *
 *   Example: Of the ranges [0-5], [2-6], and [7-10]; the value 5 is contained in [0-5] and [2-6].
 */

 public Interval(int start, int end) {
   if (start > end) {
       throw new IllegalArgumentException("Start value cannot be greater than end value.");
   }
   this.start = start;
   this.end = end;
}

// Getter methods
public int getStart() {
   return start;
}

public int getEnd() {
   return end;
}

// Method to check if a value is contained within the interval
public boolean contains(int value) {
   return value >= start && value <= end;
}

// Overriding toString method for display
@Override
public String toString() {
   return "[" + start + "-" + end + "]";
}

public class IntervalFinder {
   // Method to find intervals that contain the given data point
   public Collection<Interval> findContainingIntervals(Collection<Interval> intervals, int value) {
       Collection<Interval> result = new ArrayList<>();

       for (Interval interval : intervals) {
           if (interval.contains(value)) {
               result.add(interval);
           }
       }

       return result;
   }
}
public class Main {
    public static void main(String[] args) {
        // Create a collection of intervals
        Collection<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(0, 5));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(7, 10));

        // Create an instance of IntervalFinder
        IntervalFinder finder = new IntervalFinder();

        // Find intervals that contain the value 5
        Collection<Interval> containingIntervals = finder.findContainingIntervals(intervals, 5);

        // Print the result
        System.out.println("Intervals containing the value 5: " + containingIntervals);
    }
}