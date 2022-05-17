package thirdHomework;

public class Lesson3 {
    public static void main(String[] args) {
        int[] myIntArray;
        myIntArray = new int[100];
        // если ячеек мало заполнить можно вручную обратившись к каждому массиву
        // если их больше для удобства прописываются циклы for
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i + 1;
        }
        for (int i = 0; i < myIntArray.length; i++) {
            int element = myIntArray[i];
            System.out.print(element + " ");

        }
        System.out.println();
        for (int element : myIntArray) {
            System.out.print(element + " ");
        }
        // для каждого for (тип данных имя переменной : источник) {тело for}
        int[][] doubledArray = new int[2][]; // создается по сути таблица 5 строк и 5 столбцов
        doubledArray[0] = new  int[10]; // помещение числа в самую первую ячейку обращаемся к нулевой строке и столбцу по имени переменной
        // первый индикатор - строка
        // второй всегда столбец
        doubledArray[1] = new int[5];
        for (int i = 0; i < doubledArray.length; i++) {
            for (int j = 0; j< doubledArray[i].length; j++) {
                System.out.print(doubledArray[i][j]);
            }
            System.out.println();
        }



    }
    // массивы - скопление элементов с одинаковым типом данных.не примитивнный тип данных
    // прорисывается тип данных [] имя переменной;
    // имя переменной = new тип данных [размер нашего массива]
    // все это  одномерные массивы
    // многомерные масивы ( двумерные) синтаксис не отличается

}
