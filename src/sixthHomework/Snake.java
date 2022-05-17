package sixthHomework;

public class Snake  extends Animal {
    Snake(String name, String color, int age) {
        super(name, color, age);
    }
    public void voice() {
        System.out.println(name + " ползет!");

    }
}



