package secondHomeWork;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        boolean sumBetween = sumBetweenNumbers10and20();
        positiveOrNegative(-1);
        boolean isPositive = isPositive(4);
        specifiedString("GOOD EVENING ALL", 24);


    }

    public static boolean sumBetweenNumbers10and20() {
        int x = 10;
        int y = 11;
        int sum = x + y;
        return 10 < sum && 20 >= sum;


    }

    public static void positiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("ПОЛОЖИТЕЛЬНОЕ ЧИСЛО");
        } else {
            System.out.println("ОТРИЦАТЕЛЬНОЕ ЧИСЛО");

        }

    }

    public static boolean isPositive(int number) {
        return number < 0;
    }

    public static void specifiedString(String message, int count) {
        for (int t = 0; t < count; t++) ;
        System.out.println(message);
    }

}











