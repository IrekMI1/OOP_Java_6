package Model.AllNumbers;

import Model.Operations.IBaseOperations;

/**
 * Класс числа, от которого наследуются остальные числа
 */
public abstract class Numbers implements IBaseOperations {
    protected double x;
    protected double y;

    /**
     * Конструктор, инициализирует число
     * @param x первое поле
     * @param y второе поле
     * @param <T> тип принимаемого числа
     */
    public <T extends Number> Numbers(T x, T y) {
        this.x = x.doubleValue();
        this.y = y.doubleValue();
    }
}
