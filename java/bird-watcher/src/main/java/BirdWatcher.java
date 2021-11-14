import java.util.Arrays;
import java.util.stream.IntStream;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

  //  private int lastWeek[] = {0, 2, 5, 3, 7, 8, 4};
    // why ^ wasn't working properly in tests: note the int[] on line 4, working fine since using this!

// declared lastWeek[] outside the first function instead
    public int[] getLastWeek() {
        return birdsPerDay;
        //return lastWeek;
    }

   // int[] week = new int[]{0, 2, 5, 3, 7, 8, 4};
    public int getToday() {
        // 1st element = count of oldest day
        // last element = today's count
        // if array is empty!! try that for test3
        int test = 0;
        if (birdsPerDay.length > 0){
        test = birdsPerDay[birdsPerDay.length - 1];
        } else {
            test = 0;
        }
        return test;
    }

    public void incrementTodaysCount() {
       // lastWeek[6] = getToday() + 1;
        birdsPerDay[birdsPerDay.length-1]++;
        // length - 1 is beacuse index of array starts at 0 so will be one less than length of array
    }

    public boolean hasDayWithoutBirds() {
       // return true if there was a day where 0 birds visited the garden
      //  int[] week = new int[7];
        boolean mark = false;
        for (int day : birdsPerDay){
            if (day == 0) {
                mark = true;
            }
        }  return mark;
    }

    public int getCountForFirstDays(int numberOfDays) {
        // get first 4 days
       /* int[] test = new int[numberOfDays + 1];

        if (birdsPerDay.length < numberOfDays) {
            for (int i = 0; i <= numberOfDays; i++) {
                test[i] = i;
            }
            int b = IntStream.of(test).sum();
        } else if (numberOfDays < birdsPerDay.length){
            for (int i = 0; i <= numberOfDays ; i++) {
                test[i] = i;
            }
            int b = IntStream.of(test).sum();
        }
    return b;*/

        return numberOfDays > birdsPerDay.length ?
                Arrays.stream(birdsPerDay, 0, birdsPerDay.length).sum() :
                Arrays.stream(birdsPerDay, 0, numberOfDays).sum();
    }
    // 0 on lines 69/70 is startInclusive - increments 1, starting at 0


    public int getBusyDays() {
        // where 5 or more birds visited the garden
        // find the number of busy days

        //plans:
        int count = 0;
        // 1. find birdsPerDay[i] > 4
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] > 4){
                count++;
            }
        }
        // 2. add the day to an array
        // 3. find sum of number of elements in array
        return count;
    }
}
