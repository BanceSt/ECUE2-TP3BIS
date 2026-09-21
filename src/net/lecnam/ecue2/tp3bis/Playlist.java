package net.lecnam.ecue2.tp3bis;

public class Playlist {
    String nom;
    Morceau[] morceaux = new Morceau[20];
    int nMorceaux = 0;

    public Playlist(String nom) {
        this.nom = nom;
    }
}
