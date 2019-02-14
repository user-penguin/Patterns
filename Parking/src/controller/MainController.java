package controller;

import model.Garage;
import model.builder.FWDSedanBuilder;
import model.builder.RWDSedanBuilder;
import model.builder.SUVBuilder;
import view.TUI;

public class MainController {
    // управление уровнями и отрисовкой
    public static Stage menuHandler(Stage stage, Garage garage) {
        switch (stage) {
            case MainMenu: {
                TUI.printMainMenu();
                int variant = TUI.getInputValue();
                switch (variant) {
                    case 1: {
                        return Stage.CarList;
                    }
                    case 2: {
                        return Stage.AddingCar;
                    }
                    case 3: {
                        return Stage.SelectCar;
                    }
                    case 0: {
                        return Stage.EndOfWork;
                    }
                }
                return Stage.MainMenu;
            }
            case AddingCar: {
                TUI.printCreatorMenu();
                int variant = TUI.getInputValue();
                switch (variant) {
                    case 1: {
                        garage.cars.add(new SUVBuilder().getResult());
                        TUI.printSuccessful();
                        return Stage.MainMenu;
                    }
                    case 2: {
                        garage.cars.add(new FWDSedanBuilder().getResult());
                        TUI.printSuccessful();
                        return Stage.MainMenu;
                    }
                    case 3: {
                        garage.cars.add(new RWDSedanBuilder().getResult());
                        TUI.printSuccessful();
                        return Stage.MainMenu;
                    }
                    case 0: {
                        return Stage.MainMenu;
                    }
                }
                return Stage.MainMenu;
            }
            case CarList: {
                return Stage.MainMenu;
            }
        }
        return Stage.EndOfWork;
    }

    // Точка входа. Хранение стейтов
    public static void main(String[] args) {
        Garage garage = Garage.getInstance();
        Stage stage = Stage.MainMenu;
        do {
            stage = menuHandler(stage, garage);
        } while (stage != Stage.EndOfWork);
    }
}
