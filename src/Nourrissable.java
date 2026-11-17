public interface Nourrissable {
    void manger(String nourriture);
    double getRationJournaliere();

    default void afficherRegime() {
        System.out.println("Ration journalière : " + getRationJournaliere() + " kg");
    }
}