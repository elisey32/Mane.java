package Home7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    public void setFullness(boolean status) {
        fullness = status;
    }

    public void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }

    public String toString() {
        return "(name - " + name + ", appetite - " + appetite + ", fullness - " + fullness + " )";
    }


}
