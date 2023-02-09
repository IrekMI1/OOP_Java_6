package UI;

import Model.AllNumbers.ComplexNumber;
import Model.AllNumbers.Numbers;
import Model.AllNumbers.RationalNumber;
import Model.AllNumbers.RealNumber;

import java.util.Objects;
import java.util.Scanner;

/**
 * Класс, который реализует взаимодествие пользователя с программой через консоль
 */
public class Console {
    /**
     * Метод, который парсит строку и возвращает число
     *
     * @param msg выводимый на консоль текст
     * @return возвращает число
     */
    public Numbers getNumber(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.contains("i")) {
            if (input.contains("+")) {
                input = input.replace("+", "//");
                String[] nums = input.split("//");
                return new ComplexNumber(
                        Double.parseDouble(nums[0].trim()),
                        Double.parseDouble(nums[1].substring(0, nums[1].length() - 1).trim())
                );
            } else {
                String[] nums = input.split("-");
                if (Objects.equals(nums[0], "")) {
                    return new ComplexNumber(
                            -Double.parseDouble(nums[1].trim()),
                            -Double.parseDouble(nums[2].substring(0, nums[2].length() - 1).trim())
                    );
                }
                return new ComplexNumber(
                        Double.parseDouble(nums[0].trim()),
                        -Double.parseDouble(nums[1].substring(0, nums[1].length() - 1).trim())
                );
            }
        }
        if (input.contains("/")) {
            String[] nums = input.split("/");
            return new RationalNumber(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]));
        }
        return new RealNumber(Double.parseDouble(input));
    }

    /**
     * Метод выводит результат на консоль результат
     *
     * @param msg    текст на консоль
     * @param result число - результат вычислений.
     */
    public void printResult(String msg, Numbers result) {
        System.out.printf("%s: %s\n", msg, result);
    }

    /**
     * Меню взаимодейстия через консоль
     *
     * @return возвращает введенное пользователем строку
     */
    public String Menu() {
        System.out.println("""
                Выберите действие:
                0 - сложение
                1 - вычитание
                2 - умножение
                3 - деление
                q - выйти из калькулятора
                """);

        return new Scanner(System.in).next();
    }
}
