public class Main {
    public static void main(String[] args) {
        Auteur  auteur1=new Auteur("saidi","samer","saidi@samer.ma","2568555",40,1);
        System.out.println(auteur1);
        Adherent adherent1=new Adherent("Abidin","Abdrhman","Abidin@Abdrhman.ma","02536555",40,1);
        System.out.println(adherent1);
        Livre livre1=new Livre("java",auteur1);
        System.out.println(livre1);
    }
}