package HOME6;

public class Cat extends Animal {
    Cat(int runLimit) {
        super(runLimit, 0);
    }
    public String swim(int distance) {
        return getClassName() + " Не умеет плавать ";
    }


}

