/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetemployer;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author KSDEV
 */
public class ListEmployer {
    private int n;
    private Employer[] liste;
    //Definition des constructeur

    public ListEmployer(int n, Employer[] liste) {
        this.n = 0;
        this.liste = new Employer[10];
    }
    //Definition des methodes 
    public boolean estplein(){
        return (n==10);
    }
    public boolean estvide(){
        return (n==0);
    }
    public void Ajout_emp(Employer emp){
        
        if(!estplein()){
            liste[n]=emp;
            n++;
        }else{
            JOptionPane.showMessageDialog(null, "Desolé liste plein");
        }
    }
    public int recherche_emp(String mat){
        int index=-1;//employer non encore trouver
        for (int i = 0; i < n; i++) {
            if (liste[i].getMat().equalsIgnoreCase(mat)){
                index=i;
                break;
            }
        }
        return index;
    }
    public void modifier(int p, Employer e){
        liste[p]=e;
    }
    public void supprimer(int p){
        if(p==n){
//          n-=2;
            n=n-1;
        }else{
            Employer tmp=liste[p];
            liste[p]=liste[n];
            liste[n]=tmp;
            n-=1;
        }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Employer[] getListe() {
        return liste;
    }

    public void setListe(Employer[] liste) {
        this.liste = liste;
    }
    
}
