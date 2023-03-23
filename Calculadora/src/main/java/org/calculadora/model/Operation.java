package org.calculadora.model;


public enum Operation {
    ADDITION("+"),
    SUBTRACTION("-");

    private static final Operation[] values = new Operation[]{ADDITION, SUBTRACTION};

    private final String sign;

    Operation(String sign) {
        this.sign = sign;
    }

    private String getSign() {
        return this.sign;
    }

    public static Operation fromValue(String valor) {

        for (Operation opActual : values) {
            if (valor.equalsIgnoreCase(opActual.name()) ||
                    valor.equalsIgnoreCase(opActual.getSign())) {
                return opActual;
            }
        }
        throw new RuntimeException("Operación no soportada para el valor: " + valor);
    }
}
