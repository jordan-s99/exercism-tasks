public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method

    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int minsInOven){
      int minutesSpent = expectedMinutesInOven();
        return minutesSpent - minsInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int layers){

        return layers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int layers2, int minutesInOven){
        // sum of prep time + time spent in oven
        int prepTime = preparationTimeInMinutes(layers2);
        return prepTime + minutesInOven;
    }
}
