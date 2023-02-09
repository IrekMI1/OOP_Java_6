package Model.AllNumbers;

/**
 * Интерфейс рациональных чисел
 */
public interface IRational {
    /**
     * Метод, который взвращает числитель
     * @return чиситель дроби
     */
    public double getNumerator();

    /**
     * Метод, который возвращает знаменатель дроби
     * @return знаменатель дроби
     */
    public double getDenominator();
}
