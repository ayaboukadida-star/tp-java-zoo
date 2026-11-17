public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Simba", 5, 190.5, "Félin");

        // System.out.println(a1.nom);

        a1.setNom("Nala");
        System.out.println(a1.getNom());

        a1.setAge(-5);   // affiche le message d'erreur

        System.out.println(a1);   // appelle toString()
    }
}