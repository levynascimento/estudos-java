package site.levy.maratonajava.introducao;

public class EstruturaDeRepeticao04 {
    public static void main(String[] args) {
        double valorTotalDoCarro = 40000;
        for(int parcela = 1; parcela < valorTotalDoCarro; parcela++) {
            double valorDaParcela = valorTotalDoCarro / parcela;

            if (valorDaParcela < 1000) {
                break;
            }

            System.out.println("Parcela " + parcela + " R$ " + valorDaParcela);
        }
    }
}
