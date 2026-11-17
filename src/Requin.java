public class Requin extends Animal implements Nourrissable {
    private String typeRequin;
    private double longueur;

    public Requin(String nom, int age, double poids, String typeRequin, double longueur) {
        super(nom, age, poids, "Poisson");
        this.typeRequin = typeRequin;
        this.longueur = longueur;
    }

    public void nager() {
        System.out.println(getNom() + " nage silencieusement...");
    }

    @Override
    public String toString() {
        return super.toString() + " | " + typeRequin + " " + longueur + "m";
    }
    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " ... (silence) ...");
    }
    @Override
    public void manger(String nourriture) {
        System.out.println(getNom() + " engloutit : " + nourriture);
    }

    @Override
    public double getRationJournaliere() {
        return getPoids() * 0.03;
    }
}