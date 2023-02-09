package Model.AllNumbers;

/**
 * Класс рациональное число
 */
public class RationalNumber extends Numbers implements IRational {
    public <T extends Number> RationalNumber(T x, T y) {
        super(x, y);
    }

    @Override
    public double getNumerator() {
        return x;
    }

    @Override
    public double getDenominator() {
        return y;
    }

// TODO: 09.02.2023
    private void simplyfy() {

    }

    @Override
    public String toString() {
        if (this.x > 0) {
            return Math.round(this.x) + "/" + Math.round(this.y);
        }
        if (this.x < 0) {
            return "-" + this.x + "/" + this.y;
        }
        return "0";
    }

    @Override
    public Numbers sum(Numbers number) {
        return new RationalNumber(
                this.x + number.x,
                this.y + number.y
        );
    }

    @Override
    public Numbers sub(Numbers number) {
        return new RationalNumber(
                this.x - number.x,
                this.y - number.y
        );
    }

    @Override
    public Numbers mult(Numbers number) {
        return new RationalNumber(
                this.x * number.x,
                this.y * number.y
        );
    }

    @Override
    public Numbers div(Numbers number) {
        return new RationalNumber(
                this.x * number.y,
                this.y * number.x
        );
    }
}
