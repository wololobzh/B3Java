import java.util.Date;

public class Stagiaire extends Personne
{

    public Stagiaire()
    {

    }

    private Date inscription;

    public Date getInscription() {
        return inscription;
    }

    public void setInscription(Date inscription) {
        this.inscription = inscription;
    }

    @Override
    public String cri() {
        return "Wouhouuuuuuuuuuuuu!";
    }

    
}
