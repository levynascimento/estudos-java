package site.levy.maratonajava.javacore.introducaometodos.test;

import site.levy.maratonajava.javacore.introducaometodos.dominios.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Levy";
        funcionario.idade = 21;
        funcionario.salarios = new double[]{10000, 15000, 20000};

        funcionario.imprimeDadosDoFuncionario();
        funcionario.calculaEImprimeMediaDosSalarios();
    }
}
