package site.levy.maratonajava.javacore.introducaoclasses.test;

import site.levy.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.ano = 2012;
        carro01.nome = "Ford";
        carro01.modelo = "Fiesta";

        carro02.modelo = "Corolla";
        carro02.nome = "Toyota";
        carro02.ano = 2023;

        System.out.println("Carro 02: " + carro02.nome + ", " + carro02.modelo + ", " + carro02.ano);
        System.out.println("Carro 01: " + carro01.nome + ", " + carro01.modelo + ", " + carro01.ano);


    }
}
