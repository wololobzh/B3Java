// On crée une classe nommée "NombrePremier"
// En Java, tout programme commence par une classe.
public class NombrePremier {

    // La méthode "main" est le point d’entrée du programme : c’est ici que tout commence.
    public static void main(String[] args) {

        // On crée une première boucle "for" pour parcourir tous les nombres de 0 à 1000.
        // j commence à 0, et tant que j est inférieur ou égal à 1000, on l’incrémente de 1 à chaque tour (j++).
        for (int j = 0; j <= 1000; j++) {

            // On crée une variable "unNombre" pour stocker la valeur actuelle de j.
            // Ce n’est pas obligatoire, mais ça rend le code plus lisible.
            int unNombre = j;

            // On crée une variable pour compter combien de fois "unNombre" peut être divisé sans reste.
            // Par exemple, 6 est divisible par 1, 2, 3 et 6 → il a donc 4 diviseurs.
            int nombreDeDiviseur = 0;

            // On crée une deuxième boucle "for" pour tester TOUS les diviseurs possibles du nombre.
            // On part de 1 (car tout nombre est divisible par 1) jusqu’à la valeur du nombre lui-même.
            for (int i = 1; i <= unNombre; i++) {

                // On calcule le reste de la division de unNombre par i.
                // Exemple : 7 % 3 = 1 → il reste 1, donc 3 ne divise pas 7.
                // Exemple : 8 % 4 = 0 → pas de reste, donc 4 divise 8.
                int modulo = unNombre % i;

                // Si le reste est égal à 0, cela veut dire que i est un diviseur de unNombre.
                if (modulo == 0) {
                    // On ajoute 1 au compteur de diviseurs.
                    nombreDeDiviseur++;
                }
            }

            // Après la boucle, on sait combien de diviseurs le nombre possède.
            // Un nombre premier est un nombre qui n’a que 2 diviseurs :
            // - 1 (toujours)
            // - lui-même
            if (nombreDeDiviseur == 2) {
                // Si le nombre a exactement 2 diviseurs, on l’affiche.
                System.out.println(unNombre);
            }
        }
    }
}
