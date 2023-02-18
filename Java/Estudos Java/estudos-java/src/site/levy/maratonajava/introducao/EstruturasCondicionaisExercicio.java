package site.levy.maratonajava.introducao;

public class EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salarioAnual = 25000;
        double imposto = 0;

        boolean impostoMenor = salarioAnual >= 0 && salarioAnual <= 34712;
        boolean impostoMedio = salarioAnual > 34712 && salarioAnual <= 68507;
        boolean impostoMaior = salarioAnual > 68507;

        if (impostoMenor) {
            imposto = (salarioAnual * 9.70)/100;
        }

        if (impostoMedio) {
            imposto = (salarioAnual * 37.35)/100;
        }

        if (impostoMaior) {
            imposto = (salarioAnual * 49.50)/100;
        }

        System.out.println(imposto);
    }
}