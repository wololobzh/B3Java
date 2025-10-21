// On crée une classe nommée "Palindrome"
public class Palindrome {

    // La méthode "main" est le point d’entrée du programme.
    public static void main(String[] args) {

        // On déclare une variable "mot" contenant une chaîne de caractères.
        // Ici, on veut vérifier si ce mot est un palindrome.
        // Un palindrome, c’est un mot qu’on peut lire dans les deux sens :
        // Exemple : "kayak", "radar", "bob", "noxyon".
        String mot = "noxyon";

        // On crée une variable booléenne (true ou false) pour indiquer si le mot est un palindrome.
        boolean resultat = true;

        // On parcourt le mot depuis la fin jusqu’au début.
        // mot.length() donne la longueur du mot.
        // Exemple : pour "noxyon", mot.length() vaut 6 (car il y a 6 lettres).
        // On commence à la position (mot.length() - 1) → ici 5 (car on compte à partir de 0)
        for (int positionDroite = mot.length() - 1; positionDroite >= 0; positionDroite--) {

            // Cette ligne affiche des informations utiles pour comprendre ce qu’il se passe.
            // Elle montre :
            // - la position à droite
            // - le caractère à cette position
            // - la position opposée à gauche
            // - et le caractère correspondant à gauche
            System.out.println(
                    positionDroite + " - " + mot.charAt(positionDroite) + " - "
                            + (mot.length() - 1 - positionDroite) + " - "
                            + mot.charAt(mot.length() - 1 - positionDroite));

            // On calcule la position "gauche" opposée à la position "droite".
            // Exemple avec "noxyon" :
            // - Quand positionDroite = 5 → positionGauche = 0
            // - Quand positionDroite = 4 → positionGauche = 1
            // - Quand positionDroite = 3 → positionGauche = 2
            int positionGauche = mot.length() - 1 - positionDroite;

            // On compare la lettre à droite avec celle à gauche.
            // Si elles sont différentes → le mot n’est PAS un palindrome.
            if (mot.charAt(positionDroite) != mot.charAt(positionGauche)) {
                resultat = false; // On met le résultat à "false".
            }
        }

        // Après la boucle, on vérifie la valeur de "resultat".
        if (resultat == true) {
            System.out.println("C'est un palindrome !");
        } else {
            System.out.println("Ce n'est pas un palindrome.");
        }
    }
}
