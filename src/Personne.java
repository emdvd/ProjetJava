/**
 * Représente une personne avec un nom, un prénom et un âge.
 */
public class Personne {

    // Attributs privés (encapsulation)
    private String nom;
    private String prenom;
    private int age;

    // Constructeur par défaut
    public Personne() {
        this.nom = "Inconnu";
        this.prenom = "Inconnu";
        this.age = 0;
    }

    // Constructeur avec paramètres
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        setAge(age); // on passe par le setter pour vérifier la valeur
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Âge invalide, il doit être positif.");
            this.age = 0;
        }
    }

    // Méthodes
    public boolean estMajeur() {
        return age >= 18;
    }

    public void anniversaire() {
        age++;
    }

    public void sePresenter() {
        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom
                + " et j'ai " + age + " ans.");
    }

    @Override
    public String toString() {
        return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
    }
}
