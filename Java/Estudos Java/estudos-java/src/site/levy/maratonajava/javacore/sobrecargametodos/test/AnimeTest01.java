package site.levy.maratonajava.javacore.sobrecargametodos.test;

import site.levy.maratonajava.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("One Piece", "Mangá", 1900);
        anime.init("One Piece", "Mangá", 1900, "Aventura");


        anime.imprime();
    }
}
