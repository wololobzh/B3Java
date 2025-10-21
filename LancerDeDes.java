// On crée une classe nommée "LancerDeDes"
public class LancerDeDes {

    // Point d'entrée du programme
    public static void main(String[] args) {

        // Déclaration d'une variable qui contiendra le résultat d’un lancer de dé (entre 1 et 6)
        int valeur;

        // Déclaration et initialisation des compteurs à 0
        // Chaque variable comptera le nombre de fois qu’une face du dé est tombée
        int valeur1 = 0;
        int valeur2 = 0;
        int valeur3 = 0;
        int valeur4 = 0;
        int valeur5 = 0;
        int valeur6 = 0;

        // On va simuler 1 000 000 lancers de dé
        // "i" commence à 0, et la boucle s’exécute tant que i < 1_000_000
        // À chaque tour, on incrémente i de 1 (i++)
        for (int i = 0; i < 1_000_000; i++) {

            // Math.random() renvoie un nombre aléatoire entre 0.0 et 1.0 (exclu)
            // Exemple : 0.123, 0.874, 0.9999…
            // On multiplie ce nombre par 6 → on obtient un nombre entre 0.0 et 5.9999
            // Puis on convertit en int (ce qui garde uniquement la partie entière)
            // Enfin, on ajoute 1 pour avoir un résultat final entre 1 et 6 inclus.
            valeur = (int) (Math.random() * 6) + 1;

            // On utilise un switch pour savoir quelle face est tombée et incrémenter le bon compteur.
            switch (valeur) {
                case 1:
                    valeur1++; // On ajoute 1 au compteur du 1
                    break;
                case 2:
                    valeur2++;
                    break;
                case 3:
                    valeur3++;
                    break;
                case 4:
                    valeur4++;
                    break;
                case 5:
                    valeur5++;
                    break;
                case 6:
                    valeur6++;
                    break;
                default:
                    // Ce cas ne devrait jamais arriver, car "valeur" est toujours entre 1 et 6.
                    break;
            }
        }

        // Après les 1 000 000 de lancers, on affiche les résultats :
        // - combien de fois chaque face est tombée
        // - et en pourcentage sur l’ensemble des lancers

        System.out.println("Le 1 est tombé : " + valeur1 + " fois, en pourcentage ça fait " + ((float) valeur1 / 1_000_000) * 100 + " %");
        System.out.println("Le 2 est tombé : " + valeur2 + " fois, en pourcentage ça fait " + ((float) valeur2 / 1_000_000) * 100 + " %");
        System.out.println("Le 3 est tombé : " + valeur3 + " fois, en pourcentage ça fait " + ((float) valeur3 / 1_000_000) * 100 + " %");
        System.out.println("Le 4 est tombé : " + valeur4 + " fois, en pourcentage ça fait " + ((float) valeur4 / 1_000_000) * 100 + " %");
        System.out.println("Le 5 est tombé : " + valeur5 + " fois, en pourcentage ça fait " + ((float) valeur5 / 1_000_000) * 100 + " %");
        System.out.println("Le 6 est tombé : " + valeur6 + " fois, en pourcentage ça fait " + ((float) valeur6 / 1_000_000) * 100 + " %");
    }
}
