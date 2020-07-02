package com.company;

public class ClientMain {

    public static void main(String[] args) {
        Client c1 = new Client(1, "Martin");
        Client c2 = new Client(2, "Dupond");

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        c2.setNom("Pichon");
        System.out.println(c2.toString());

        /** TEST APRÈS DERNIERE AMELIORATION
         * Client c1 = new Client("Martin",1);
         * System.out.println(c1);
         * Compte com1 = new Compte(10,c1);
         * Compte com2 = new Compte(20,c1);
         * c1.addCompte(com1);
         * c1.addCompte(com2);
         * System.out.println(c1);
         * com1.credit(500.0);
         * System.out.println(c1);
         */
    }
}
