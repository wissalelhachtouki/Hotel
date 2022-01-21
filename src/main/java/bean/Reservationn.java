/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

public class Reservationn {
    int id;
    String nom;
    String pernom;
    String telephone;
    String email;
    Date dateReserv;
    int reservation;
    String sexe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPernom() {
        return pernom;
    }

    public void setPernom(String pernom) {
        this.pernom = pernom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateReserv() {
        return dateReserv;
    }

    public void setDateReserv(Date dateReserv) {
        this.dateReserv = dateReserv;
    }

    public int getReservation() {
        return reservation;
    }

    public void setReservation(int reservation) {
        this.reservation = reservation;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Reservationn(int id, String nom, String pernom, String telephone, String email, Date dateReserv, int reservation, String sexe) {
        this.id = id;
        this.nom = nom;
        this.pernom = pernom;
        this.telephone = telephone;
        this.email = email;
        this.dateReserv = dateReserv;
        this.reservation = reservation;
        this.sexe = sexe;
    }
    
    public Reservationn(String nom, String pernom, String telephone, String email,Date dateReserv, int reservation, String sexe) {
        this.nom = nom;
        this.pernom = pernom;
        this.telephone = telephone;
        this.email = email;
        this.dateReserv = dateReserv;
        this.reservation = reservation;
        this.sexe = sexe;
    }
    
    
}
