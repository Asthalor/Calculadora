package org.calculadora.services;

import org.calculadora.model.Operation;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;


@Service
public class CalculatorService implements ICalculatorService  {
    public double executeOperations(BigDecimal firstNumber, BigDecimal secondNumber, String operationMethod) {
        Operation operation = Operation.fromValue(operationMethod);

        switch (operation) {
            case ADDITION -> {
                return firstNumber.add(secondNumber).doubleValue();
            }
            case SUBTRACTION -> {
                return firstNumber.subtract(secondNumber).doubleValue();
            }
            default -> {
                throw new RuntimeException("Unknown operation: " + operation.toString());
            }
        }
    }

}
