package site.levy.maratonajava.javacore.introducaometodos.test;

import site.levy.maratonajava.javacore.introducaometodos.dominios.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        System.out.println("-----------------");
        calculadora.subtraiDoisNumeros();
    }
}
