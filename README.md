# B3Java

## Jour 1, les fondamentaux

```java
/*
 * Ceci est ma classe principale du projet Java.
 * Une classe est une sorte de "boîte" qui contient du code : des variables, des fonctions, etc.
 * En Java, tout programme commence dans une classe.
 */
import java.util.Scanner; 
// On importe la classe Scanner, qui permet de lire des informations tapées par l'utilisateur au clavier.

public class Principale {

    /**
     * Wololo - Point d'entrée de ma première application.
     * Le point d'entrée, c’est la méthode "main".
     * C’est le premier endroit où le programme commence à s’exécuter.
     **/
    public static void main(String[] args) {

        // Affichage d'un message dans la console.
        System.out.println("Hello World !!");
        // println signifie "print line" → afficher une ligne de texte.

        System.out.println("Donne moi ton prénom ?");

        // On crée un objet Scanner pour lire ce que l'utilisateur va écrire au clavier.
        Scanner scanMonClavier = new Scanner(System.in);

        // On déclare une variable de type String (chaîne de caractères) pour stocker le prénom saisi.
        String monPrenom = scanMonClavier.nextLine();
        // nextLine() lit toute la ligne tapée par l'utilisateur et la renvoie sous forme de texte.

        System.out.println("Je m'appelle " + monPrenom);
        // Le signe + sert ici à "coller" (concaténer) deux textes.

        // On déclare une variable entière appelée temperature.
        int temperature = 15;

        // Exemple d'instruction conditionnelle : if / else
        if (temperature <= 15) {
            System.out.println("Mets un blouson");
        } else {
            System.out.println("Mets une veste");
        }
        // Ici, si la température est inférieure ou égale à 15, on affiche "Mets un blouson".
        // Sinon, le programme affiche "Mets une veste".

        // Deuxième série de conditions, avec plusieurs cas possibles.
        if (temperature == 0) {
            System.out.println("Y gèle");
        } else if (temperature == 20) {
            System.out.println("On est bien");
        } else if (temperature == 30) {
            System.out.println("Je vais prendre un petit cocktail");
        } else if (temperature == 40) {
            System.out.println("Je sors pas");
        } else {
            System.out.println("Wololo");
        }
        // "==" sert à comparer deux valeurs.
        // "else if" permet d’ajouter d’autres cas si la première condition n’est pas remplie.
        // "else" sert à gérer le cas par défaut, si aucune condition n’est vraie.

        // On fait maintenant la même chose qu’au-dessus, mais avec un switch.
        // switch = "interrupteur" → on choisit le bon cas en fonction de la valeur de "temperature".
        switch (temperature) {
            case 0:
                System.out.println("0000");
                break; // break sert à sortir du switch une fois le bon cas trouvé.
            case 20:
                System.out.println("20202020");
                break;
            case 30:
                System.out.println("303030");
                break;
            case 40:
                System.out.println("404040");
                break;
            default:
                System.out.println("Wololo");
                break;
        }

        // Une boucle "for" permet de répéter une action plusieurs fois.
        // Ici, on part de 200 et on descend jusqu’à 1.
        for (int index = 200; index > 0; index--) {
            System.out.println("Bonjour : " + index);
        }
        // index-- signifie "décrémente de 1" à chaque tour.
        // La boucle s'arrête quand index devient égal à 0.

        // Exemple d'une boucle "while" (tant que).
        int compteur = 0;

        while (compteur < 10) {
            System.out.println("Moins de 10, nanana : " + compteur);
            compteur++; // On ajoute 1 à compteur à chaque tour.
        }
        // La boucle tourne tant que la condition (compteur < 10) est vraie.
        // Quand compteur atteint 10, la condition devient fausse → la boucle s’arrête.

        System.out.println("Bye bye et à vos questions !!");

        // On déclare une variable "capitale" vide (null = elle ne contient encore rien).
        String capitale = null;

        // Boucle do...while :
        // Elle s’exécute AU MOINS une fois, même si la condition est fausse au départ.
        do {
            System.out.println("Capitale de la france ?");
            capitale = scanMonClavier.nextLine(); // On relit ce que tape l’utilisateur.

        } while (!capitale.equals("Paris"));
        // Tant que la réponse n’est PAS "Paris", on recommence la question.
        // "!" veut dire "non".
        // equals() sert à comparer le contenu de deux chaînes de texte (et pas leur adresse en mémoire).

        // Très important : on ferme le scanner pour libérer la mémoire.
        scanMonClavier.close();

    }
}
```

