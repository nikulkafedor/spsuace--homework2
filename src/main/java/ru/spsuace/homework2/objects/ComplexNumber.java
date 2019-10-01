package ru.spsuace.homework2.objects;

/**
 * Опишите иммутабельное комплексное число, с геттерами и методами toString()
 * Так же дополните класс методами, чтобы эти объекты можно было использовать в HashMap
 */
public class ComplexNumber {
    private final int dReal, dImaginary;

    public ComplexNumber( int dReal, int dImaginary) {
        this.dReal = dReal;
        this.dImaginary = dImaginary;
    }
    public int getReal() {
        return dReal;
    }
    public int getComplex() {
        return dImaginary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComplexNumber that = (ComplexNumber) o;
        return dReal == that.dReal && dImaginary == that.dImaginary;
    }

    @Override
    public int hashCode() {
        return Math.abs(this.dReal) + Math.abs(this.dImaginary);
    }

    @Override
    public String toString() {
        if (this.dImaginary < 0) {
            return this.dReal + " - " + Math.abs(this.dImaginary) + "i";
        } else {
            return this.dReal + " + " + this.dImaginary + "i";
        }
    }

    public static void main(String[] args) {
        System.out.println(new ComplexNumber(11, -24));
    }
}



