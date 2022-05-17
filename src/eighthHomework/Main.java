package eighthHomework;

public class Main {
    public static void main(String[] args) {
        int a = 6;

        switch (a) {
            case 5:
                System.out.println("пятерка!");
                break; // коду говорит что не будет выполняться все что ниже
            case 6:
                System.out.println("шестерка!");
                break;
            default: // выводиться если ни один кейс сверху не выполнен либо над ним нет оператора break ставиться в конец или начало
                System.out.println(" по умолчанию ");

        }
    }
    // switch (переременная) {- где переменная это строка или число по типу данных
    // в теле switch прописываются
    // case значение: идет сравнение с тем что указанов круглых скобках switch
    // тело case может быть сколько угодно }
}
