## Jour 2

### Exercices

[Le Plus Grand](ExoLePlusGrand.md)

### Démonstration en live

```java
public class Jour2 {
    public static void main(String[] args) {

        //Executer un fonction
        int valeurRetournee = afficherBonjourV2("Thibau");

        System.out.println("Wololo : " + valeurRetournee);


        
    }

    //Fonction qui execute un bloc d'instruction
    //Fonction qui ne retourne rien
    //Fonction qui n'a aucun paramètre
    public static void afficherBonjour()
    {
        System.out.println("Hello");
    }

    //Fonction qui execute un bloc d'instruction
    //Fonction qui ne retourne rien
    //Fonction qui attend un paramètre de type String
    public static void afficherBonjour(String prenom)
    {
        //J'utilise la valeur passée en paramètre
        System.out.println("Hello " + prenom);
    }

    //Fonction qui execute un bloc d'instruction
    //Fonction qui ne retourne rien
    //Fonction qui attend deux paramètres, un de type String, un de type int
    public static void afficherBonjour(String prenom, int quantite)
    {
        for(int i= 0; i < quantite; i++)
        {
            //J'utilise la valeur passée en paramètre
            System.out.println("Hello " + prenom);
        }
    }

    //Fonction qui execute un bloc d'instruction
    //Fonction qui retourne le nombre total de caractères affiché
    //Fonction qui attend deux paramètres, un de type String, un de type int
    public static int afficherBonjourV2(String prenom, int quantite)
    {
        int resultat = 0;

        for(int i= 0; i < quantite; i++)
        {
            //J'utilise la valeur passée en paramètre
            System.out.println("Hello " + prenom);

            resultat += "Hello ".length();
            resultat += prenom.length();
        }

        return resultat;
    }

    public static int afficherBonjourV2(String prenom)
    {
                return afficherBonjourV2(prenom,5);
    }



}
```
