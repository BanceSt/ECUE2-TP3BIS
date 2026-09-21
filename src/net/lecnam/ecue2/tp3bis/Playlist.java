package net.lecnam.ecue2.tp3bis;

public class Playlist {
    String nom;
    Morceau[] morceaux = new Morceau[20];
    int nMorceaux = 0;

    public Playlist(String nom) {
        this.nom = nom;
    }

    public boolean ajout(Morceau morceau) {
        if (morceau == null) return false;
        if (nMorceaux >= 20 ) return false;
        for (int i =0; i < nMorceaux;i++)
        {
            if (morceau.equals(morceaux[i])) return false;
        }
        morceaux[nMorceaux] = morceau;
        nMorceaux++;
        return true;
    }
}
