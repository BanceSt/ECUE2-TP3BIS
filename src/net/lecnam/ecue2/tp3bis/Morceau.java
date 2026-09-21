package net.lecnam.ecue2.tp3bis;

public class Morceau {
    String titre;
    String artist;
    Duree duree;
    int nEcoute = 0;

    public Morceau(String titre, String artist, Duree duree) {
        this.titre = titre;
        this.artist = artist;
        this.duree = duree;
    }

    public Morceau(String titre, String artist, int minutes, int secondes) {
        this(titre, artist, new Duree(minutes, secondes));
    }
}
