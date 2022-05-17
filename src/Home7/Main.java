package Home7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Брасик", 10),
                new Cat("Мурзик", 15),
                new Cat("Василий", 20)
        };
        Plate plate = new Plate(50, 30);
        System.out.println(plate);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
        plate.add(30);
        System.out.println(plate);
        for (Cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}