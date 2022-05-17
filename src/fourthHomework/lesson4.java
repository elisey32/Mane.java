package fourthHomework;

import java.util.Random;
import java.util.Scanner;

public class lesson4 {
    public static char[][] map;
    public static final int SIZE = 3; // константа которую нельзя изменить;
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static final char DOT_EMPTY = '.';
    public static final int DOTS_TO_WIN = 3;


    public static void main(String[] args) {
        initMap();
        showMap();
        while (true) {


            humanTurn();
            showMap();
            if (isWinner(DOT_X)) {
                System.out.println("Победил человек");
                break; // прервать цикл
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            showMap();
            if (isWinner(DOT_0)) {
                System.out.println("Победил компьютер!");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья");

            }
        }


    }

    //1. Инициализвция игрового поля.
    public static void initMap() {
        map = new char[SIZE][SIZE]; // место в памяти под игровое поле;
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                map[row][column] = DOT_EMPTY; // двойной цикл заполнения точками поля;
            }
        }
    }

    // 2.Вывод игрового поля в консоль
    public static void showMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " "); // прописываем метод в одну строчку
        }
        System.out.println();// переход на другую строчку
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println(); // классовая функция

        }


    }

    // Ход человека;
    public static void humanTurn() {
        Scanner scanner = new Scanner(System.in); // обьявление обьекта по чтению данных из консоли;
        int x; // исправлять на -1 для массива
        int y;
        do {
            System.out.println("Введите координаты в формате X и Y");
            x = scanner.nextInt() - 1; // исправлять на -1 для массива
            y = scanner.nextInt() - 1;

        } while (!isCellValid(x, y)); // логическое отрицание;
        map[x][y] = DOT_X;


    }

    // 5. Ход компьютера
    public static void aiTurn() {
        Random random = new Random();
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);

        } while (!isCellValid(x, y)); // логическое отрицание;
        System.out.println("Компьютер сходил в координаты: X: " + (x + 1) + " Y: " + (y + 1));

        map[y][x] = DOT_0;


    }


    // 4. Проверка ячейки
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static boolean isWinner(char symb) {
        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return
                true;
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return
                true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return
                true;
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return
                true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return
                true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return
                true;
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return
                true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return
                true;
        return false;
    }


    public static boolean isMapFull() {
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                if (map[row][column] == DOT_EMPTY) {
                    return false;
                }

            }
        }
        return true;


    }

    public static boolean isLinesFilledWith(char symb, char[][] subMap) {
        for (int row = 0; row < subMap.length; row++) {
            int horizontalWinCounter = 0;
            int verticalWinCounter = 0;
            for (int column = 0; column < subMap.length; column++) {
                if (subMap[row][column] == symb) {
                    horizontalWinCounter++;
                }
                if (subMap[column][row] == symb) {
                    verticalWinCounter++;
                }
            }
            if (horizontalWinCounter == DOTS_TO_WIN || verticalWinCounter == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;

    }

    static boolean isDiagonalsFilledWith(char symb, char[][] subMap) {
        int mainDiagonalCounter = 0;
        int sideDiagonalCounter = 0;
        for (int row = 0; row < DOTS_TO_WIN; row++) {
            if (subMap[row][row] == symb) {
                mainDiagonalCounter++;
            }
            if (subMap[row ][DOTS_TO_WIN - 1 - row] == symb){
                sideDiagonalCounter++;
            }
        }
        return(mainDiagonalCounter == DOTS_TO_WIN) || (sideDiagonalCounter == DOTS_TO_WIN);
    }
}