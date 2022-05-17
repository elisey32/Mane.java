package eighthHomework;

public class Main2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //System.out.println(i);// цикл
            if (i == 5) {
                continue;
                //System.out.println("Произошел выброс");
               // break; // вытаскивает из цикла где данный break был обьявлен, если будет несколько циклов, будет выкидывать из вложенных;
            }
            System.out.println(i);
            // выполняться на итерации не будет

        }
    }
}
