package sixthHomework;

public class Dog extends Animal {
    Dog(String name, String color, int age) {
        super(name, color, age);
    } // наследование ключивое слово extends и прописывается группа наследования animal;
    //  можно указать только один класс для наследования;

    public void walk() {
        System.out.println(name + " Гав!");
    }

    public void voice() {

        System.out.println(name + " Ходит на лапках!");
    }
}


