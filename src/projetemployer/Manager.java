/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetemployer;

import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 *
 * @author KSDEV
 */
public class Manager extends Employer{
    private double bonus;

    public Manager(double bonus, String nom, String datemb, String adresse, double salaire, ImageIcon photo) {
        super(nom, datemb, adresse, salaire, photo);
        this.bonus = 0;
    }
// Definition des methodes 
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getSal(){
        return super.getSalaire;
    }
    
}
