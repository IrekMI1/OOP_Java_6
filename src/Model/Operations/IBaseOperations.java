package Model.Operations;

import Model.AllNumbers.Numbers;

/**
 * Интерфейс математических операций
 */
public interface IBaseOperations {
    /**
     * Сложение чисел
     *
     * @param number число
     * @return число
     */
    public Numbers sum(Numbers number);

    /**
     * Разность чисел
     *
     * @param number число
     * @return число
     */
    public Numbers sub(Numbers number);

    /**
     * Умножение чисел
     *
     * @param number число
     * @return число
     */
    public Numbers mult(Numbers number);

    /**
     * Деление чисел
     *
     * @param number число
     * @return число
     */
    public Numbers div(Numbers number);
}
