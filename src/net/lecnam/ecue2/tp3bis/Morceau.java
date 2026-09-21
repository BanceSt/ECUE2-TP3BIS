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

    public void ecouter()
    {
        nEcoute++;
    }

    public boolean estDe(String artiste) {
        return artist.equals(artiste);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || getClass() != obj.getClass()) return false;
        Morceau morceau = (Morceau) obj;
        return (titre.equals(morceau.titre)) && (artist.equals(morceau.artist));
    }

    @Override
    public String toString() {
        return String.format("%s - %s (%s) - %d écoute(s)", titre, artist, duree, nEcoute);
    }
}
