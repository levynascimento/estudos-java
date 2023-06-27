package site.levy.maratonajava.javacore.introducaometodos.test;

import site.levy.maratonajava.javacore.introducaometodos.dominios.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(225, 5);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(225, 5));
        System.out.println("---------");
        calculadora.imprimeDivisaoDeDoisNumeros(25, 5);
    }
}
