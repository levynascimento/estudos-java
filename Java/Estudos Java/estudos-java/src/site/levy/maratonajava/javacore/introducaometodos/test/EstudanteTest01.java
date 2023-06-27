package site.levy.maratonajava.javacore.introducaometodos.test;

import site.levy.maratonajava.javacore.introducaometodos.dominios.Estudante;
import site.levy.maratonajava.javacore.introducaometodos.dominios.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Hinataaaaaaaaaaaaaa";
        estudante01.sexo = 'M';
        estudante01.idade = 15;

        estudante02.nome = "Kageyamaaaaaaaaaaa";
        estudante02.sexo = 'M';
        estudante02.idade = 15;

        impressora.imprime(estudante01);

        System.out.println("--------------------");

        impressora.imprime(estudante02);
    }
}
