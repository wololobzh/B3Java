package fr.epsi.decouverte.main;

import fr.epsi.decouverte.model.*;

public class Principale {
    public static void main(String[] args) 
    {
        Personne silvin = new Personne();

        silvin.setNom("Azerty");
        silvin.setPrenom("Silvin"); 

        System.out.println(silvin.getNom() + " " + silvin.getPrenom());

        String laPresentationDeSilvin = silvin.getPresentation("blabla");

        System.out.println(laPresentationDeSilvin);

        System.out.println(silvin);
    }
}
