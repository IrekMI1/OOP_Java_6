package Core;

import Model.AllNumbers.Numbers;
import Model.AllNumbers.RealNumber;
import Model.Operations.*;
import UI.Console;

/**
 * Класс Калькулятор, реализующий различные математичекие операции с действительными, комплексными числами
 */
public class Calculator {
    /**
     * Метод запускает программу в цикле до ввода "q"
     */
    public static void start() {
        Console console = new Console();
        String button = console.Menu();

        while (!button.equals("q")) {
            Numbers num1 = console.getNumber("Введите первый аргумент:\n");
            Numbers num2 = console.getNumber("Введите второй аргумент:");

            switch (button) {
                case "0":
                    console.printResult("Результат сложения:\t", num1.sum(num2));
                    break;
                case "1":
                    console.printResult("Результат вычитания:\n", num1.sub(num2));
                    break;
                case "2":
                    console.printResult("Результат умножения:\n", num1.mult(num2));
                    break;
                case "3":
                    console.printResult("Результат деления:\n", num1.div(num2));
                    break;
            }
            button = console.Menu();
        }
    }
}
