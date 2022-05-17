package fifthHomework; // обьектно-ориентированное приложение (ООП)

public class Lesson5 {
    public static void main(String[] args) {


        Cat firstCat = new Cat("Царапкин", "Белый", 5); // адрес места памяти расположения обьекта;
        firstCat.name = "Дуся";
        firstCat.color = "Серая"; // для обращения прописывается сначало имя того к кому обращаемся;
        firstCat.age = 5; // дот натация - обращение к полям через символ "." ;

        firstCat.name = "Мурзик";


        Cat secondCat = new Cat("Сосискин", "Черный", 10); // каждый обьект знает от какого класса был создан;
        secondCat.name = "Мышкин";
        secondCat.color = "Белый";
        secondCat.age = 10;
        secondCat = firstCat;
        secondCat.name = "Барсик";
        System.out.println("Первая кошка: " + firstCat.name + " " + firstCat.color + " " + firstCat.age);
        System.out.println("Вторая кошка: " + secondCat.name + " " + secondCat.color + " " + secondCat.age);

        firstCat.voice("meow");
        firstCat.jump();

        secondCat.voice("mew");
        secondCat.jump();

    }
}
