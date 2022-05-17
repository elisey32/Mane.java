package Lesson7;

public class Plat {
    private int food;
    public Plat(int food) {
        this.food = food; // пример инициализации;
    }

    public void decreaseFood(int appetite) {
        food = food - appetite;
    }



    public  void showInfo() {
        System.out.println(" Количество еды в тарелке: " + food);
    }
}
