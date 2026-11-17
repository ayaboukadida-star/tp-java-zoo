public class Requin extends Animal {
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
}