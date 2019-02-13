package controller;

import model.Garage;
import view.TUI;

import java.util.Scanner;

public class MainController {
    // управление уровнями и отрисовкой
    public static void menuHandler(Stage stage) {
        switch (stage) {
            case MainMenu: {
                TUI.printMainMenu();
                int variant = TUI.getInputValue();
                switch (variant) {
                    case 1: {
                        stage = Stage.CarList;
                        break;
                    }
                    case 2: {
                        stage = Stage.AddingCar;
                        break;
                    }
                    case 3: {
                        stage = Stage.SelectCar;
                        break;
                    }
                }
                break;
            }
            case CarList: {
                break;
            }
        }
    }

    // Точка входа. Хранение стейтов
    public static void main(String[] args) {
        Garage garage;
        Stage stage = Stage.MainMenu;
        TUI.printMainMenu();
    }
}
