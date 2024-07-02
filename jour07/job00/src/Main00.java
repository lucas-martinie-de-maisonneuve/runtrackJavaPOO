public class Main00 {
    public static void main(String[] args) {
        Personne p1 = new Personne("Lamorte", "Vanny", "25/12/1993", "Cambodge", "41 rue Roussel Doria", "0652311381");

        System.out.println(p1.prenom);
        System.out.println(p1.getDateNaissance());
    }
}
/*
 * Type d'attribut Public : Accessible partout
 * Type d'attribut Privé : Accessible que dans la classe
 * Type d'attribut Protégé : Accessible dans la classe et les sous classes

 * Getter et Setter sont nécessaire pour les types protégé et privée
 */