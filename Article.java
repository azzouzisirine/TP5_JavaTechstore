package heritage;

public class Article {

package techstore;

public class Article {

    // 1. Attributs
    private int id;
    private String nom;
    private double prix;

    // 2. Constructeur
    public Article(int id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    // 3. Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    // 4. Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    // 5. toString()
    @Override
    public String toString() {
        return "Article [id=" + id
                + ", nom=" + nom
                + ", prix=" + prix + "]";
    }
}

}
