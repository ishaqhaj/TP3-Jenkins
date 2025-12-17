package com.example.tp1.EX2;

public class Main {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Harry Potter", "J.K. Rowling", 1997, "123456789");
        Livre livre2 = new Livre("1984", "George Orwell", 1949, "987654321");
        Bibliotheque bibliotheque = new Bibliotheque();


        bibliotheque.ajouterLivre(livre1);
        bibliotheque.ajouterLivre(livre2);


        Livre livreRecherche = bibliotheque.rechercherParTitre("Harry Potter");
        if (livreRecherche != null) {
            System.out.println("Livre trouvé : " + livreRecherche.getTitre());
        } else {
            System.out.println("Livre non trouvé.");
        }
    }
}
