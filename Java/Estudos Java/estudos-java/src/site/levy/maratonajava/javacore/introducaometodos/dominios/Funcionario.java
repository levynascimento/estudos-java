package site.levy.maratonajava.javacore.introducaometodos.dominios;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;
    public void imprimeDadosDoFuncionario() {
        System.out.println("------------");
        System.out.println(this.nome);
        System.out.println(this.idade);

        if(salarios == null) {
            return;
        }

        for(double salario: salarios) {
            System.out.println(salario);
        }

        calculaEImprimeMediaDosSalarios();
    }

    public void calculaEImprimeMediaDosSalarios() {
        if (salarios == null) {
            return;
        }

        double media = 0;
        for(double salario: salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("A média é: " + media);
    }
}
