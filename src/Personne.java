public class Personne {
    private String nom;
    private String pernom;
    private String email;
    private String tel;
    private int age;

    public Personne() {
    }

    public Personne(String nom, String pernom, String email, String tel, int age) {
        this.nom = nom;
        this.pernom = pernom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPernom() {
        return pernom;
    }

    public void setPernom(String pernom) {
        this.pernom = pernom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " nom= " + nom + ", pernom= " + pernom + ", email= " + email + ", tel= " + tel +  ", age=" + age ;
    }
}
