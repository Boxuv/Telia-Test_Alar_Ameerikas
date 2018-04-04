package Main;

public class Main {

    public static void main(String[] args) {
        int hour = Integer.parseInt(args[0]);
        int minutes = Integer.parseInt(args[1]);

        int degree = find_degree(hour,minutes);

        System.out.println(degree);

        // To call out the handmade test
        /*
        test();
        */
    }

    private static int find_degree(int hour, int minutes){
        int minimum_minutes = minutes%60;
        int minimum_hour = hour%12;

        int hour_to_min  = minimum_hour * 5;
        int degree;

        degree = Math.abs(hour_to_min-minimum_minutes)*6;

        return degree;
    };

    /* Hand made scrubby test */
    private static void test(){
        int success = 0;
        if (find_degree(0,10) == 60){
            System.out.println("60 degrees successful");
        }
        if (find_degree(3,10) == 30){
            System.out.println("30 degrees successful");
        }
        if (find_degree(0,30) == 180){
            System.out.println("180 degrees successful");
        }
        if (find_degree(6,0) == 180){
            System.out.println("180 degrees successful");
        }
        if (find_degree(19,50) == 90){
            System.out.println("90 degrees successful");
        }
        if (find_degree(0,1) == 6){
            System.out.println("6 degrees successful");
        }
        if (find_degree(12,2) == 12){
            System.out.println("12 degrees successful");
            success = 1;
        }


        if (success==1){
            System.out.println("Test was successful");
        } else {
            System.out.println("Test was a failure");
        }

    };
}
