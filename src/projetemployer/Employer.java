/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetemployer;

import java.io.Serializable;
import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 *
 * @author KSDEV
 */
public class Employer implements Serializable{
//    Definition des attribut
    private String mat;
    private String nom;
    private String datemb;
    private String adresse;
    private double salaire;
    private ImageIcon photo;
    private static int matsuiv=1;
    double getSalaire;
//    Definition du constructeur
    public Employer(String nom, String datemb, String adresse, double salaire, ImageIcon photo) {
        this.mat = "emp"+matsuiv++;
        this.nom = nom;
        this.datemb = datemb;
        this.adresse = adresse;
        this.salaire = salaire;
        this.photo = photo; 
    }

    public Employer(String mat, String nom, String datemb, String adresse, double salaire, ImageIcon photo) {
        this.mat = mat;
        this.nom = nom;
        this.datemb = datemb;
        this.adresse = adresse;
        this.salaire = salaire;
        this.photo = photo;
    }

    Employer(String mat, String nom, LocalDate localDate, String adresse, double d, ImageIcon photo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Definition des methodes

    public String getMat() {
        return mat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDatemb() {
        return datemb;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }

    public static int getMatsuiv() {
        return matsuiv;
    }

    public static void setMatsuiv(int matsuiv) {
        Employer.matsuiv = matsuiv;
    }
    
}
