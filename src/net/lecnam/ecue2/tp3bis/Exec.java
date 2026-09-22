package net.lecnam.ecue2.tp3bis;


import java.util.Random;

public class Exec  {

    public static void main(String[] args) {
        Playlist pl = new Playlist("Hit of 1500-to-2999");
        Random rand = new Random();

        // Morceaux
        Morceau m1 = new Morceau("Long long run", "Arthur Grant", 10, 45);
        Morceau m2 = new Morceau("Bip bip", "Arthur Grant", 0, 45);
        Morceau m3 = new Morceau("Mes emmerdes", "Charles Aznavour", 3, 7);
        Morceau m4 = new Morceau("Deux Guitare", "Charles Aznavour", 3, 51);
        Morceau m5 = new Morceau("Hier encore", "Charles Aznavour", 2, 23);
        Morceau m6 = new Morceau("Menilmontant", "Charles Trenet", 3, 20);
        Morceau m7 = new Morceau("I will survive", "Gloria Gaynor", 3, 15);
        Morceau m8 = new Morceau("Imposter syndrome", "Sydney Gish", 4, 49);
        Morceau m9 = new Morceau("La foule", "Edith Piaf", 3, 23);
        Morceau m10 = new Morceau("Tout doucement", "Bibie", 4, 12);

        pl.ajout(m1);
        pl.ajout(m2);
        pl.ajout(m3);
        pl.ajout(m4);
        pl.ajout(m5);
        pl.ajout(m6);
        pl.ajout(m7);
        pl.ajout(m8);
        pl.ajout(m9);

        if (pl.ajout(m10)) {
            System.out.println("Nouvelle Ajout");
        }
        if (!(pl.ajout(m4))) {
            System.out.println("Déjà là !");
        };


        System.out.println(pl.retourneDureeTotale());

        for (int i = 0; i <= 200;i++) {
            pl.morceaux[rand.nextInt(10)].ecouter();
        }

        pl.ecouterTout();

        System.out.println("Le plus long : " + pl.retourneMorceauLePlusLong());
        System.out.println("Le plus écouter : " + pl.retourneMorceauLePlusEcoute());

        System.out.println("Aznavour à " + pl.retourneNbMorceauxDe("Charles Aznavour") + " morceaux dans la playlist.");
    }
}
