public class Apprenant {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private int[] notes;


    public Apprenant(int id, String nom, String prenom, String email, int[] notes) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.notes = notes;
    }


    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        StringBuilder notesString = new StringBuilder();
        if (notes != null && notes.length > 0) {
            for (int note : notes) {
                notesString.append(note).append(" ");
            }
        }

        if (notesString.length() > 500) {
            notesString.setLength(500);
            notesString.append("...");
        }
        return "Apprenant [ID=" + id + ", Nom=" + nom + ", Prenom=" + prenom + ", Email=" + email + ", Notes=" + notesString.toString().trim() + "]";
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String newEmail) {
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}