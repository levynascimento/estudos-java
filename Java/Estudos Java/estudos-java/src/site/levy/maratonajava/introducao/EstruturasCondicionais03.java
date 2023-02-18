package site.levy.maratonajava.introducao;
public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensageDoar = "Eu doar 500 pro Dev Dojo.";
        String mensagemNaoDoar = "Ainda não dá, mas vou ter logo logo.";
        String resultado = salario > 5000 ? mensageDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}