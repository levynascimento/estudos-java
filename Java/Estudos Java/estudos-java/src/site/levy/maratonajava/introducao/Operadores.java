package site.levy.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        double numero1 = 10;
        double numero2 = 20;
        double result = numero1 / numero2;

        System.out.println(result);

        double bonus = 1800;
        // bonus = bonus + 1000;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);
    }
}
