package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private long numero;
    private String nom;
    private ArrayList<Compte> comptes;

    public Client(long numero, String nom)
    {
        this.numero = numero;
        this.nom = nom;
    }

    public long getNumero()
    {
        return this.numero;
    }

    public String getNom()
    {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /*public String toString() {
        return new String("Client " +this.numero+" "+this.nom+"\n");
    }*/

    public String toString() {
        String infos = new String();
        infos = "Client "+this.numero+" - "+this.nom+"\n";
        this.comptes.forEach((compte) -> infos = infos+"Compte n°"+compte.getNumero()+" - solde : "+compte.getSolde());
        return infos;
    }

    public void addCompte(Compte c) {
        this.comptes.add(c);
    }

    public ArrayList<Compte> getComptes() {
        return this.comptes;
    }
}
