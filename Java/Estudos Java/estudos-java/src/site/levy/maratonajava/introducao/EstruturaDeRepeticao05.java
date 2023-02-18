package site.levy.maratonajava.introducao;

public class EstruturaDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotalDoCarro = 40000;

        for(int parcela = (int) valorTotalDoCarro; parcela >= 1; parcela--) {
            double valorDaParcela = valorTotalDoCarro / parcela;

            if (valorDaParcela <= 1000) {
                continue;
            }

            System.out.println("Parcela " + parcela + " R$ " + valorDaParcela);

        }
    }
}
