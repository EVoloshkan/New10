import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите колличество строк: ");
        int n = scanner.nextInt();
        System.out.print("Введите колличество столбцов: ");
        int m = scanner.nextInt();
        String result = "";
        int[][] massive = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Введите значение элемента [" + i + "][" + j + "]: ");
                massive[i][j] = scanner.nextInt();
                if (i == 0) {
                   result += massive[i][j] * 3 + " ";
                }
            }
        }
        System.out.println("Вариант №1: " + result);
        System.out.print("Вариант №2: ");
        for (int j = 0; j < m; j++){
            System.out.print(massive[0][j] * 3 + " ");
        }
    }
}
