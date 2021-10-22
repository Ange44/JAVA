/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetemployer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KSDEV
 */
public class Sauvegarde {
    
    public void stock(Employer e[],int nbemp){
        try {
            FileOutputStream fos=new FileOutputStream("sauvegarde.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeInt(nbemp);
            for (int i = 0; i < nbemp; i++) {
                oos.writeObject(e[i]);
            }
            oos.close();
            fos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Sauvegarde.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Sauvegarde.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public Employer[] lire_fichier(){
        Employer[] tab=null;
        int n=0;
        try {
            FileInputStream fis=new FileInputStream("sauvegarde.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            n=ois.readInt();
            tab=new Employer[n];
            for (int i = 0; i < n; i++) {
                Employer e=(Employer) ois.readObject();
                tab[i]=e;
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Sauvegarde.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Sauvegarde.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Sauvegarde.class.getName()).log(Level.SEVERE, null, ex);
        }
     return tab; 
           
    }
}
