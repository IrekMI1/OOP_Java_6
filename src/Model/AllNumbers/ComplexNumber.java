package Model.AllNumbers;

import Model.Operations.IBaseOperations;

/**
 * Касс комплексное число, содержит мнимую и действительную части
 */
public class ComplexNumber extends Numbers implements IReal, IImag, IBaseOperations {

    /**
     * Конструктор, инициализирует комплексное число
     * @param real действительная часть числа
     * @param image мнимая часть число
     * @param <T> принимаемый тип аргумента при инициализации
     */
    public <T extends Number> ComplexNumber(T real, T image) {
        super(real, image);
    }

    /**
     * Метод возвращает действительную часть числа
     * @return действительная часть числа
     */
    @Override
    public double getReal() {
        return x;
    }
    /**
     * Метод возвращает мнимую часть числа
     * @return мнимая часть числа
     */
    @Override
    public double getImag() {
        return y;
    }

    /**
     * Переопределение метода вывода объекта в строку
     * @return строку объекта
     */
    @Override
    public String toString() {
        if (this.y > 0) {
            return this.x + " + " + this.y + "i";
        }
        if (this.y < 0) {
            return this.x + " - " + Math.abs(this.y) + "i";
        }
        return String.format("%s", this.x);
    }

    /**
     * Складывает комплексные числа
     * @param number комплексное число
     * @return результат сложения
     */
    @Override
    public Numbers sum(Numbers number) {
        return new ComplexNumber(
                this.x + number.x,
                this.y + number.y
        );
    }

    /**
     * Расчет разности комплексных чисел
     * @param number комплексное число
     * @return результат разности
     */
    @Override
    public Numbers sub(Numbers number) {
        return new ComplexNumber(
                this.x - number.x,
                this.y + number.y
        );
    }

    /**
     * Умножение комплексных чисел
     * @param number комплексное число
     * @return результат умножения
     */
    @Override
    public Numbers mult(Numbers number) {
        return new ComplexNumber(
                this.x * number.y - this.y * number.y,
                this.y * number.x + this.x * number.y
        );
    }

    /**
     * Деление комплексных чисел
     * @param number комплексное число
     * @return результат деления
     */
    @Override
    public Numbers div(Numbers number) {
        double real2 = number.x;
        double imag2 = number.y;
        double newReal = (this.x * real2 + this.y * imag2) / (real2 * real2 + imag2 * imag2);
        double newImag = (real2 * this.y - this.x * imag2) / (real2 * real2 + imag2 * imag2);

        return new ComplexNumber(newReal, newImag);
    }
}