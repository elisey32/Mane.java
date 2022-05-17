package Home7;

public class Plate {
    private int volume;
    public int food;

    Plate(int volume, int food) {
        this.volume = volume;
        this.food = food;
    }

    public boolean decreaseFood(int portion) {
        if (food < portion) {

            return false;
        }
        food -= portion;
        return true;
    }

    public void add(int food) {
        if (this.food + food <= volume) {
            this.food += food;
        }
    }

    public String toString() {
        return "plate: " + food;
    }
}
