package com.example.simple_crud;

public class Client {

    private String nom;
    private String prenom;
    private String sexe;

    public Client(String nom, String prenom, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    @Override
    public String toString() {
        return nom + ' ' + prenom + ' ' + sexe;
    }
}
