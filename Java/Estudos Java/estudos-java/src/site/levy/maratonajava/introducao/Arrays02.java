package site.levy.maratonajava.introducao;

public class Arrays02 {
    public static void main(String[] args) {
//       ( byte, short, int, long, float, double ) = 0
//        char = '\u0000', ''
//        boolean = false
//        String = null

        String[] nomes = new String[4];

        nomes[0] = "Hinata";
        nomes[1] = "Kageyama";
        nomes[2] = "Tanaka";
        nomes[3] = "Sugawara";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
