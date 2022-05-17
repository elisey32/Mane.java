package fifthHomework;

public class Cat {
    // this ключевое слово; поле в которое записывается адрес обьекта при его создании; можно использовать только в контексте обьекта;

    String name; // ссылочный тип данных string;
    String color;
    int age; // обьявление полей;

    Cat(String name, String color, int age) { // прописывать имя цвет и возраст, в (), добовлять в метод!
        this.name = name;
        this.color = color;
        this.age = age;

        System.out.println("Кошки");

    }


    void voice(String meow) {

        System.out.println(name + " " + meow);
    }

    void jump() {
        System.out.println(name + " jumps"); // sout - СЖАТЫЙ SYSTEM;
        print();

    }
    public static void print() {
        System.out.println("name");
    }
}
