package site.levy.maratonajava.introducao;

public class EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        byte diaDaSemana = 6;

        switch (diaDaSemana) {
            case 1, 7:
                System.out.println("Fim de semana");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Você é burro ou só se faz? Digita de 1 até 7, benção de Deus!");
                break;
        }
    }
}
