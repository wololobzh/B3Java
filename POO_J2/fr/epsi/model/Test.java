import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
public static void main(String[] args) {

Personne personne = new Stagiaire();
personne.setNom("Terieur");
personne.setPrenom("Alex");

Stagiaire stagiaire = new Stagiaire();
stagiaire.setNom("Terieur");
stagiaire.setPrenom("Alain");
stagiaire.setInscription(new Date());

Formateur formateur = new Formateur();
formateur.setNom("Onet");
formateur.setPrenom("Camille");
formateur.setSpecialite("Java");

Personne[] toutLeMonde = new Personne[5];
toutLeMonde[0] = stagiaire;
toutLeMonde[1] = formateur;

for (Personne personneCourante : toutLeMonde) 
{
    if(personneCourante != null)
    {
        System.out.println(personneCourante.getNom());

        System.out.println(personneCourante.cri());
    }
}

List<Personne> listePersonnes = new ArrayList<Personne>();
listePersonnes.size();
Personne p = listePersonnes.get(1);























}
}
