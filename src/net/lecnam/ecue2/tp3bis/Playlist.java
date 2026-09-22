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

    public Duree retourneDureeTotale()
    {
        Duree dureeTotale = new Duree(0);
        for (int i =0; i < nMorceaux;i++)
        {
            dureeTotale.ajouter(morceaux[i].duree);
        }
        return dureeTotale;
    }

    public int retourneNbMorceauxDe(String artiste) {
        int nMorceauxDe = 0;
        for (int i =0; i < nMorceaux;i++)
        {
            if (morceaux[i].artist.equals(artiste)) nMorceauxDe++;
        }
        return nMorceauxDe;
    }

    public Morceau retourneMorceauLePlusLong(){
        Morceau morceau = new Morceau("", "", 0, 0);
        for (int i=0; i< nMorceaux;i++)
        {
            if (!(morceau.duree.estPlusLongueQue(morceaux[i].duree))) {
                morceau = morceaux[i];
            }
        }
        if (morceau.titre.isEmpty()) return null;
        return morceau;
    }

    public  Morceau retourneMorceauLePlusEcoute(){
        Morceau morceau = new Morceau("", "", 0, 0);
        for (int i=0; i< nMorceaux;i++)
        {
            if (morceaux[i].nEcoute > morceau.nEcoute) {
                morceau = morceaux[i];
            }
        }
        if (morceau.titre.isEmpty()) return null;
        return morceau;
    }

    public  void ecouterTout(){
        for (int i=0; i< nMorceaux;i++)
        {
            morceaux[i].ecouter();
        }
    }
}
