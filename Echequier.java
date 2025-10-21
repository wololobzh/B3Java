// Déclaration d'une classe nommée "Echequier".
// En Java, tout le code doit être écrit à l'intérieur d'une classe.
public class Echequier {

    // La méthode "main" est le point d'entrée du programme.
    // C’est ici que tout commence à s’exécuter.
    public static void main(String[] args) {
        
        // On déclare une variable de type "float" (nombre à virgule)
        // pour représenter le nombre de grains de riz sur la première case.
        float nombreGrainDeLaCase = 1;

        // Une boucle "for" va permettre de répéter plusieurs fois un bloc d’instructions.
        // Ici, on répète l’opération 64 fois (pour les 64 cases de l’échiquier).
        // La variable "i" sert de compteur (on l'appelle souvent un index).
        for (int i = 1; i <= 64; i++) {

            // On affiche le numéro de la case, suivi du nombre de grains sur cette case.
            System.out.println("Case " + i + " : " + nombreGrainDeLaCase);

            // À chaque nouvelle case, le nombre de grains double.
            // C’est la fameuse légende du jeu d’échecs :
            // 1 grain sur la première case, 2 sur la deuxième, 4 sur la troisième, etc.
            nombreGrainDeLaCase = nombreGrainDeLaCase * 2;
        }

        // À la fin de cette boucle, le programme aura affiché les 64 cases
        // avec le nombre de grains correspondant à chacune.
        // (Tu verras que les nombres deviennent énormes très vite !)

        // -------------------------------------------------------------------
        // Maintenant, on ajoute une petite partie "bonus" :
        // on simule un lancé de dé (comme un vrai dé à 6 faces).
        // -------------------------------------------------------------------

        // Math.random() génère un nombre aléatoire compris entre 0.0 et 1.0 (exclu).
        // Si on le multiplie par 6 → on obtient un nombre entre 0.0 et 5.999...
        // En ajoutant 1 → on obtient un nombre entre 1.0 et 6.999...
        // Le "(int)" devant sert à convertir ce nombre en entier (1, 2, 3, 4, 5 ou 6).
        int de = (int)(Math.random() * 6) + 1;

        // On pourrait afficher le résultat du dé :
        System.out.println("Résultat du lancé de dé : " + de);

        // Fin du programme.
    }
}
