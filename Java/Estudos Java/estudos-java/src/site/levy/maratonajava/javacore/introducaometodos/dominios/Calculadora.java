package site.levy.maratonajava.javacore.introducaometodos.dominios;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int numero01, int numero02) {
        System.out.println(numero01 * numero02);
    }

    public double divideDoisNumeros(double numero01, double numero02) {
        return numero01 / numero02;
    }

    public void imprimeDivisaoDeDoisNumeros(double numero01, double numero02) {
        if (numero02 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(numero01 / numero02);
    }

    public void alteraDoisNumeros(int numero01, int numero02){
        numero01 = 99;
        numero02 = 33;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Numero 01: " + numero01);
        System.out.println("Numero 02: " + numero02);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;

        for(int numero: numeros) {
            soma += numero;
        }

        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;

        for(int numero: numeros) {
            soma += numero;
        }

        System.out.println(soma);
    }
}
