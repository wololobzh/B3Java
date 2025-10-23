package fr.epsi.decouverte.model;

public class Personne 
{
    public Personne(){
        System.out.println("Je suis le construc teur et je construis une personne");
        this.setNom("Non défini pour le moment");
    }

    private String nom;
    private String prenom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(nom.trim().equals(""))
        {
            System.err.println("Olala je refuse ce NOM ! C'est NON !");
        }else{
            this.nom = nom;
        }
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPresentation(String nom)
    {
        String resultat = "";
        resultat = "Salut je suis " + this.nom + " " + prenom;
        return resultat;
    }

    @Override
    public String toString() {
        return this.nom + " - " + this.prenom;
    }
}