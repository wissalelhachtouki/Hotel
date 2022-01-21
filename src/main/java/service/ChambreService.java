/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Chambre;
import connexion.Connexion;
import dao.IDao;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ChambreService implements IDao<Chambre>{

    @Override
    public boolean create(Chambre o) {
        String sql = "insert into chambre values (null, ?, ?)";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, o.getCode());
            ps.setString(2, o.getLibelle());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("create : erreur sql : " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(Chambre o) {
        String sql = "delete from chambre where id = ?";
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
    public boolean update(Chambre o) {
        String sql = "update chambre set code  = ? ,libelle = ? where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, o.getCode());
            ps.setString(2, o.getLibelle());
            ps.setInt(3, o.getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("update : erreur sql : " + e.getMessage());

        }
        return false;
    }

    @Override
    public Chambre findById(int id) {
        Chambre s = null;
        String sql = "select * from chambre where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Chambre(rs.getInt("id"), rs.getString("code"), rs.getString("libelle"));
            }

        } catch (SQLException e) {
            System.out.println("findById " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Chambre> findAll() {
        List<Chambre> chambre = new ArrayList<Chambre>();

        String sql = "select * from chambre";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                chambre.add(new Chambre(rs.getInt("id"), rs.getString("code"), rs.getString("libelle")));
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return chambre;
    }
    
    public Chambre findByCode(String code) {
        Chambre s = null;
        String sql = "select * from chambre where code  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Chambre(rs.getInt("id"), rs.getString("code"), rs.getString("libelle"));
            }

        } catch (SQLException e) {
            System.out.println("findById " + e.getMessage());
        }
        return null;
    }
    
    public Chambre findByLibelle(String libelle) {
        String sql = "select * from chambre where libelle = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, libelle);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Chambre(rs.getInt("id"), rs.getString("code"), rs.getString("libelle"));
            }
        } catch (SQLException e) {
            System.out.println("findById " + e.getMessage());
        }
        return null;
    }
    
}
