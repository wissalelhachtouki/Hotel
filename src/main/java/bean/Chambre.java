/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Ultrapc
 */
public class Chambre {
    int id;
    String code;
    String libelle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Chambre(int id, String code, String libelle) {
        this.id = id;
        this.code = code;
        this.libelle = libelle;
    }
    
    public Chambre(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }
    
    
}
