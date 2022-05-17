package sixthHomework;

public class Bird extends Animal{

    int height;

    Bird(String name, String color, int age, int height) {
        super(name, color, age);// реализация  из классов наследников обращаться к реализации кода в классах родителя
        this.height = height;
    }


    public void walk() {
        System.out.println(name + " Чирикает!");
    }
    public void voice() {

        System.out.println(name + " Ходит на лапках");
    }
}

