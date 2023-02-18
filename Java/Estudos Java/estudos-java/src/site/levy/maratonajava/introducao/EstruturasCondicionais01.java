package site.levy.maratonajava.introducao;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;

        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Pode comprar sua bebida!");
        } else {
            System.out.println("Você não pode comprar sua bebida!");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Você não pode comprar sua bebida!");
        }
    }
}