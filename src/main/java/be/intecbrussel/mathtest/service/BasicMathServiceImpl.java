package be.intecbrussel.mathtest.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

@Service
public class BasicMathServiceImpl implements BasicMathService{
    @Override
    public String add(String number1, String number2) {
        if (!number1.matches("^-?\\d*\\.?\\d+$") || !number2.matches("^-?\\d*\\.?\\d+$")) {
            throw new RuntimeException("Invalid number Strings.");
        }

        BigDecimal n1, n2, sum;
        n1 = new BigDecimal(number1);
        n2 = new BigDecimal(number2);
        sum = n1.add(n2);
        return sum.stripTrailingZeros().toPlainString();
    }

    @Override
    public String subtract(String number1, String number2) {
        if (!number1.matches("^-?\\d*\\.?\\d+$") || !number2.matches("^-?\\d*\\.?\\d+$")) {
            throw new RuntimeException("Invalid number Strings.");
        }

        BigDecimal n1, n2, difference;
        n1 = new BigDecimal(number1);
        n2 = new BigDecimal(number2);
        difference = n1.subtract(n2);
        return difference.stripTrailingZeros().toPlainString();
    }

    @Override
    public String multiply(String number1, String number2) {
        if (!number1.matches("^-?\\d*\\.?\\d+$") || !number2.matches("^-?\\d*\\.?\\d+$")) {
            throw new RuntimeException("Invalid number Strings.");
        }

        BigDecimal n1, n2, product;
        n1 = new BigDecimal(number1);
        n2 = new BigDecimal(number2);
        product = n1.multiply(n2);
        return product.stripTrailingZeros().toPlainString();
    }

    @Override
    public String divide(String number1, String number2) {
        if (!number1.matches("^-?\\d*\\.?\\d+$") || !number2.matches("^-?\\d*\\.?\\d+$")) {
            throw new RuntimeException("Invalid number Strings.");
        }

        if (number2.equals("0")) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        BigDecimal n1, n2, result;
        n1 = new BigDecimal(number1);
        n2 = new BigDecimal(number2);
        result = n1.divide(n2);
        return result.stripTrailingZeros().toPlainString();
    }
}
