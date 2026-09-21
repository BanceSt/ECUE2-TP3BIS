package net.lecnam.ecue2.tp3bis;

public class Duree {
    int minutes;
    int secondes;

    Duree(int minutes, int secondes){
        this.minutes = minutes + Math.floorDiv(secondes, 60);
        this.secondes = secondes % 60;
    }

    Duree(int secondes) {
        this.minutes =  Math.floorDiv(secondes, 60);
        this.secondes = secondes % 60;
    }

    public int enSeconde() {
        return minutes * 60 + secondes;
    }

    public void ajouter(Duree duree) {
        this.minutes += duree.minutes + Math.floorDiv(duree.secondes + secondes, 60);
        this.secondes = (duree.secondes + secondes) % 60;
    }

    public boolean estPlusLongueQue(Duree d) {
        return ((minutes > d.minutes) || ((minutes == d.minutes) && (secondes > d.secondes)));
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", minutes, secondes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || getClass() != o.getClass()) return false;
        Duree duree = (Duree) o;
        return (duree.minutes == minutes) && (duree.secondes == secondes);
    }
}
