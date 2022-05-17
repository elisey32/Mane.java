package Lesson7;

public class Cat {
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public  void eat(Plat plat) {
        plat.decreaseFood(appetite);

    }



    public boolean equals(Object obj) {
       // super.equals(obj); // вызов реализации метода через супер классы;
    if (this == obj) {
        return true;
    }
    else if (obj instanceof Cat) {
        Cat anotherCat = (Cat) obj;
        return  anotherCat.name.equals(name); // сравнение не адресов,а самих строк;
    }
    return false;
   }
   public String toString()    // механизм языка
   {
        return  " Кошка по имени: " + name;
   }
    // инкапсуляция - это объединение данных и методов работы с этими данными в одной упаковке («капсуле»).

}
