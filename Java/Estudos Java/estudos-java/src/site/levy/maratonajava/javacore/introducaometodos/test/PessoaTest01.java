package site.levy.maratonajava.javacore.introducaometodos.test;

import site.levy.maratonajava.javacore.introducaometodos.dominios.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Levy");
        pessoa.setIdade(21);
        // pessoa.imprime();
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());
    }
}
