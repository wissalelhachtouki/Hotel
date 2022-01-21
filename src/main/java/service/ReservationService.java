/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Reservationn;
import connexion.Connexion;
import dao.IDao;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ReservationService implements IDao<Reservationn>{

    @Override
    public boolean create(Reservationn o) {
        String sql = "insert into reservation values (null, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, o.getNom());
            ps.setString(2, o.getPernom());
            ps.setString(3, o.getTelephone());
            ps.setString(4, o.getEmail());
            ps.setDate(5, new Date(o.getDateReserv().getTime()));
            ps.setInt(6, o.getReservation());
            ps.setString(7, o.getSexe());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("create : erreur sql : " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(Reservationn o) {
         String sql = "delete from reservation where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, o.getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("delete : erreur sql : " + e.getMessage());

        }
        return false;
    }

    @Override
    public boolean update(Reservationn o) {
        String sql = "update reservation set nom  = ? ,prenom = ? ,telephone = ? ,email = ? ,dateReserv = ? ,reservation = ? ,sexe = ? where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, o.getNom());
            ps.setString(2, o.getPernom());
            ps.setString(3, o.getTelephone());
            ps.setString(4, o.getEmail());
            ps.setDate(5, new Date(o.getDateReserv().getTime()));
            ps.setInt(6, o.getReservation());
            ps.setString(7, o.getSexe());
            ps.setInt(8, o.getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("update : erreur sql : " + e.getMessage());

        }
        return false;
    }

    @Override
    public Reservationn findById(int id) {
        Reservationn p = null;
        String sql = "select * from reservation where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Reservationn(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("telephone"), rs.getString("email"), rs.getDate("dateReserv"), rs.getInt("reservation"), rs.getString("sexe"));
            }
        } catch (SQLException e) {
            System.out.println("findById " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Reservationn> findAll() {
        List<Reservationn> reservations = new ArrayList<Reservationn>();

        String sql = "select * from reservation";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	reservations.add(new Reservationn(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("telephone"), rs.getString("email"), rs.getDate("dateReserv"), rs.getInt("reservation"), rs.getString("sexe")));
            }
        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return reservations;
    }
    
}
