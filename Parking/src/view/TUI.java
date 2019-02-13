package view;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Runtime.getRuntime;

public class TUI {
    public static int getInputValue() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            number = scanner.nextInt();
        } while (number < 0 || number > 10);
        return number;
    }

    public static void printMainMenu() {
        Runtime runtime = getRuntime();
        try {
            Process process = runtime.exec("clear");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(
                "Здравствуйте! Вы находитесь в модели паркинга.\n" +
                        "Здесь вы можете создавать автомобили и как-то с ними взаимодействовать.\n" +
                        "Выберите из списка, что вы хотите сделать:\n" +
                        "1. Посмотерть список машин на стоянке\n" +
                        "2. Добавить новую машину\n" +
                        "3. Выбрать автомобиль для управления\n" +
                        "0. Завершить работу программы."
        );
    }
}
