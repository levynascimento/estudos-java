package site.levy.maratonajava.javacore.introducaometodos.test;

import site.levy.maratonajava.javacore.introducaometodos.dominios.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int a = 1;
        int b = 2;

        calculadora.alteraDoisNumeros(a, b);

        System.out.println("Dentro do CalculadoraTest04");
        System.out.println("A: " + a);
        System.out.println("B: " + b);


    }
}
