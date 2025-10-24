public class Formateur extends Personne
{
public Formateur()
{

}

    private String specialite;

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String cri() {
        return "Formateur en action!";
    }

    
}
