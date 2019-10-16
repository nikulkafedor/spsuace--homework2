package ru.spsuace.homework2.objects;

/**
 * Опишите иммутабельное комплексное число, с геттерами и методами toString()
 * Так же дополните класс методами, чтобы эти объекты можно было использовать в HashMap
 */

/**
 *  у меня переменные начинаются с d просто потому что первоначальное объяснение из интернета как необходимо делать подобное задание было с такими названиями)
 *  на вопрос про целые числа не знаю ответа если честно) не надо было целыми делать?
 */
public class ComplexNumber {
    private final int dReal;
    private final int dImaginary;

    public ComplexNumber(int dReal,
                         int dImaginary) {
        this.dReal = dReal;
        this.dImaginary = dImaginary;
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

}
