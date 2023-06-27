package site.levy.maratonajava.javacore.introducaometodos.test;

import site.levy.maratonajava.javacore.introducaometodos.dominios.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Hinataaaaaaaaaaaaaa";
        estudante01.sexo = 'M';
        estudante01.idade = 15;

        estudante02.nome = "Kageyamaaaaaaaaaaa";
        estudante02.sexo = 'M';
        estudante02.idade = 15;

        estudante01.imprime();
        estudante02.imprime();
    }
}
