package org.calculadora.services;

import java.math.BigDecimal;

public interface ICalculatorService {

    /**
     * Method that given 2 numbers adds or subtract the values
     *
     * @param firstNumber
     * @param secondNumber
     * @param operation Distinct arithmetics operations. Add OR subtract.
     * @return The value of the operation
     */
    double executeOperations(BigDecimal firstNumber, BigDecimal secondNumber, String operation);
}
