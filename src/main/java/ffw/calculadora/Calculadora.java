package ffw.calculadora;

public class Calculadora {
    protected static int count = 0;

    public Calculadora(){
        count++;
    }

    protected void finalize() throws Throwable {
        count--;
    } 

    public int soma (int num1, int num2) {
        int resultado;
        resultado = num1 + num2;
        return resultado;
    }

    public int subtracao (int num1, int num2) {
        int resultado;
        resultado = num1-num2;
        return resultado;
    }

    public int divisao (int num1, int num2) {
        int resultado;
        resultado = num1/num2;
        return resultado;
    }

    public int multiplicacao (int num1, int num2) {
        int resultado;
        resultado = num1*num2;
        return resultado;
    }

    public int getInstanceCount() {
        return count;
    }

}
