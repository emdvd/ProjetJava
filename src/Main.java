/**
 * Point d'entrée du programme : crée et manipule des objets Personne.
 */
public class Main {

    public static void main(String[] args) {

        // Création d'objets avec les deux constructeurs
        Personne p1 = new Personne("Dupont", "Marie", 20);
        Personne p2 = new Personne("Martin", "Lucas", 16);
        Personne p3 = new Personne();

        // Utilisation des méthodes
        p1.sePresenter();
        p2.sePresenter();
        p3.sePresenter();

        // Modification avec les setters
        p3.setNom("Bernard");
        p3.setPrenom("Léa");
        p3.setAge(25);
        System.out.println("Après modification : " + p3);

        // Test de majorité
        System.out.println(p2.getPrenom() + " est majeur ? " + p2.estMajeur());

        // Anniversaires
        p2.anniversaire();
        p2.anniversaire();
        System.out.println("Deux ans plus tard, " + p2.getPrenom() + " a "
                + p2.getAge() + " ans. Majeur ? " + p2.estMajeur());

        // Test d'un âge invalide
        p1.setAge(-5);
        System.out.println(p1);
    }
}
