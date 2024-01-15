public class Adherent extends Personne{


    private int numAdherent;


    public Adherent(String nom, String pernom, String email, String tel, int age,int numAdherent) {
        super(nom, pernom, email, tel, age);
        this.numAdherent=numAdherent;
    }


    @Override
    public String toString() {
        
        return super.toString()+ ",numAdherent=" + numAdherent ;
    }
}
