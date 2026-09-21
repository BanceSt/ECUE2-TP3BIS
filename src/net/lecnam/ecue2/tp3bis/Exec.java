package net.lecnam.ecue2.tp3bis;


public class Exec  {

    public static void main(String[] args) {
        Duree d1 = new Duree(360);
        Duree d2 = new Duree(3, 59);
        Duree d3 = new Duree(45, 345);

        System.out.println("d1 : " + d1);
        System.out.println("d1 en secondes : " + d1.enSeconde());
        System.out.println("d2 : " + d2);
        System.out.println("d2 en secondes : " + d2.enSeconde());
        System.out.println("d3 : " + d3);
        System.out.println("d3 en secondes : " + d3.enSeconde());

        d1.ajouter(d2);
        System.out.println("d1 + d2 : " + d1);

        System.out.println("d3 > d2 : " + d3.estPlusLongueQue(d2));
    }

}
