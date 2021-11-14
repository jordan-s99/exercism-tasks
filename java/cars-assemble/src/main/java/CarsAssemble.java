import java.text.DecimalFormat;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double perHour = 0;
        double test = speed;
        if (test < 5) {
             perHour = test * 221;
           // return perHour;
        } else if (test <= 8) {
             perHour = test * 198.9;
           // return perHour;
        } else if (test == 9) {
            perHour = test * 176.8;
            //
        } else if (test == 10) {
            double trial = test * 170.17;
            perHour = Math.round(trial*100.0)/100.0;
           // return perHour;

        }
        return perHour;
    }



    public int workingItemsPerMinute(int speed) {
      // how many working cars are produced per minute

       // int IntValue = (int) DoubleValue;
        // ^ to convert from a double to an int

        int perMinute = 0;
        int test = 0;
        double red = 0;
        if (speed < 5 ) {
            test = speed * 221;
            perMinute  = test / 60;
            return perMinute;
        } else if (speed <= 8) {
            red = speed * 198.9;
            double redMinute = red / 60;
            perMinute  = (int) redMinute;
            return perMinute;
        } else if (speed == 9) {
            red = speed * 176.8;
            double redMinute = red / 60;
            perMinute = (int) redMinute;
            return perMinute;
        } else if (speed == 10) {
            red = speed * 170.17;
           // double redMinute = Math.round(red*100.0)/100.0;
           // double red3 = redMinute / 60;
            double red3 = red / 60;
            perMinute = (int) red3;
            return perMinute;
        }

        return perMinute;
    }
}
