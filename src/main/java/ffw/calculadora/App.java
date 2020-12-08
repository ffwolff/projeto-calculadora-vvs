package ffw.calculadora;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int num1, num2, resultado;
        Scanner entrada = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        
        System.out.println("Digite o primeiro número:\n");
        num1 = entrada.nextInt();
        System.out.println("\nDigite o segundo número:\n");
        num2 = entrada.nextInt();
        resultado = calculadora.soma(num1, num2);
        System.out.println("\nSoma: "+ resultado);
        resultado = calculadora.subtracao(num1, num2);
        System.out.println("\nSubtração: " + resultado);
        resultado = calculadora.multiplicacao(num1, num2);
        System.out.println("\nMultiplicação: " + resultado);
        resultado = calculadora.divisao(num1, num2);
        System.out.println("\nDivisão: " + resultado);
        
    }
}
