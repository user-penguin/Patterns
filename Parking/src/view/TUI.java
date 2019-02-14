package view;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Runtime.getRuntime;

public class TUI {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
    }

    // считывание чисел из консоли
    public static int getInputValue() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            number = scanner.nextInt();
        } while (number < 0 || number > 10);
        return number;
    }

    // экран главного меню
    public static void printMainMenu() {
        clearScreen();
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

    // экран создания нового автомобиля
    public static void printCreatorMenu() {
        clearScreen();
        System.out.println(
                "Какой автомобиль вы бы хотели создать?\n" +
                        "1. Внедорожник\n" +
                        "2. Переднеприводынй седан\n" +
                        "3. Заднеприводный седан\n" +
                        "0. Назад"
        );
    }

    // сообщение об успешном завершении операции
    public static void printSuccessful() {
        clearScreen();
        System.out.println("Операция прошла успешно");
    }
}
