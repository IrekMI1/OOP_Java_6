package Model.AllNumbers;

/**
 * Класс действительных чисел, реализует методы абстрактного класса Numbers
 */
public class RealNumber extends Numbers implements IReal {

    public <T extends Number> RealNumber(T value) {
        super(value, 0);
    }

    @Override
    public double getReal() {
        return x;
    }

    @Override
    public String toString() {
        return String.format("%s", this.x);
    }

    @Override
    public Numbers sum(Numbers number) {
        return new RealNumber(this.x + number.x);
    }

    @Override
    public Numbers sub(Numbers number) {
        return new RealNumber(this.x - number.x);
    }

    @Override
    public Numbers mult(Numbers number) {
        return new RealNumber(this.x * number.x);
    }

    @Override
    public Numbers div(Numbers number) {
        return new RealNumber(this.x / number.x);
    }
}