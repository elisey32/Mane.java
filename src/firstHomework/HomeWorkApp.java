package firstHomework;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();


    }


    public static void printThreeWords() {
        System.out.println("Orange ");
        System.out.println("Banana ");
        System.out.println("Apple ");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = 0;
        int c = a + b;
        if (c >= 0)
            System.out.println("Сумма положительная " + c);
        if (c <= 0)
            System.out.println("Сумма отрицательная " + c);


    }

    public static void printColor() {
        int value = 102;
        if (value <= 0) {
            System.out.println("КРАСНЫЙ");

        } else if (value <= 100) {
            System.out.println("ЖЕЛТЫЙ");


        } else if (value > 101)
            System.out.println("Зеленый");


    }

    public static void compareNumbers() {
        int a = 1;
        int b = 3;
        if (a > b) {
            System.out.println("a >= b");


        } else if (a < b)
            System.out.println("a < b");


    }


}









