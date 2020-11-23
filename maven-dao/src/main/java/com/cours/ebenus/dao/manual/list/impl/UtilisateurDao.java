package com.cours.ebenus.dao.manual.list.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.cours.ebenus.dao.IUtilisateurDao;
import com.cours.ebenus.dao.entities.Utilisateur;
import com.cours.ebenus.utils.Constants;

public class UtilisateurDao implements IUtilisateurDao {
	
	public Connection connection () {
		Connection connection = null;

		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	@Override
	public List<Utilisateur> findAllUtilisateurs() {
		Connection c = connection();
		List<Utilisateur> utilisateurList = new ArrayList<Utilisateur>();
		String selectSQL = "SELECT * FROM utilisateur";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = c.prepareStatement(selectSQL);
			ResultSet rs = preparedStatement.executeQuery(selectSQL);
			while (rs.next()) {
				Utilisateur newUtilisateur = new Utilisateur();
				newUtilisateur.setIdUtilisateur(rs.getInt("id"));
				newUtilisateur.setCivilite(rs.getString("civilite"));
				newUtilisateur.setNom(rs.getString("nom"));
				newUtilisateur.setPrenom(rs.getString("prenom"));
				newUtilisateur.setIdentifiant(rs.getString("identifiant"));
				newUtilisateur.setEmail(rs.getString("email"));
				newUtilisateur.setMotPasse(rs.getString("password"));
				newUtilisateur.setDateNaissance(rs.getDate("date de naissance"));
				newUtilisateur.setDateCreation(rs.getDate("date de creation"));
				newUtilisateur.setDateModification(rs.getDate("date de modification"));
			
				utilisateurList.add(newUtilisateur);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return utilisateurList;
	}

	@Override
	public Utilisateur findUtilisateurById(int idUtilisateur) {
		Connection c = connection();
		String selectSQL = "SELECT * FROM utilisateur WHERE id = ?";
		PreparedStatement preparedStatement;

		Utilisateur newUtilisateur = null;

		try {
			preparedStatement = c.prepareStatement(selectSQL);
			preparedStatement.setInt(1, idUtilisateur);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				newUtilisateur = new Utilisateur();
				newUtilisateur.setIdUtilisateur(rs.getInt("id"));
				newUtilisateur.setCivilite(rs.getString("civilite"));
				newUtilisateur.setNom(rs.getString("nom"));
				newUtilisateur.setPrenom(rs.getString("prenom"));
				newUtilisateur.setIdentifiant(rs.getString("identifiant"));
				newUtilisateur.setEmail(rs.getString("email"));
				newUtilisateur.setMotPasse(rs.getString("password"));
				newUtilisateur.setDateNaissance(rs.getDate("date de naissance"));
				newUtilisateur.setDateCreation(rs.getDate("date de creation"));
				newUtilisateur.setDateModification(rs.getDate("date de modification"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return newUtilisateur;

	}

	@Override
	public List<Utilisateur> findUtilisateurByPrenom(String prenom) {
		Connection c = connection();
		List<Utilisateur> utilisateurList = new ArrayList<Utilisateur>();

		String selectSQL = "SELECT * FROM utilisateur WHERE prenom = ?";
		PreparedStatement preparedStatement;

		try {
			preparedStatement = c.prepareStatement(selectSQL);
			preparedStatement.setString(1, prenom);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				Utilisateur newUtilisateur = new Utilisateur();
				newUtilisateur.setIdUtilisateur(rs.getInt("id"));
				newUtilisateur.setCivilite(rs.getString("civilite"));
				newUtilisateur.setNom(rs.getString("nom"));
				newUtilisateur.setPrenom(rs.getString("prenom"));
				newUtilisateur.setIdentifiant(rs.getString("identifiant"));
				newUtilisateur.setEmail(rs.getString("email"));
				newUtilisateur.setMotPasse(rs.getString("password"));
				newUtilisateur.setDateNaissance(rs.getDate("date de naissance"));
				newUtilisateur.setDateCreation(rs.getDate("date de creation"));
				newUtilisateur.setDateModification(rs.getDate("date de modification"));
				
				utilisateurList.add(newUtilisateur);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return utilisateurList;
	}

	@Override
	public List<Utilisateur> findUtilisateurByNom(String nom) {
		Connection c = connection();
		List<Utilisateur> utilisateurList = new ArrayList<Utilisateur>();

		String selectSQL = "SELECT * FROM utilisateur WHERE nom = ?";
		PreparedStatement preparedStatement;

		try {
			preparedStatement = c.prepareStatement(selectSQL);
			preparedStatement.setString(1, nom);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				Utilisateur newUtilisateur = new Utilisateur();
				newUtilisateur.setIdUtilisateur(rs.getInt("id"));
				newUtilisateur.setCivilite(rs.getString("civilite"));
				newUtilisateur.setNom(rs.getString("nom"));
				newUtilisateur.setPrenom(rs.getString("prenom"));
				newUtilisateur.setIdentifiant(rs.getString("identifiant"));
				newUtilisateur.setEmail(rs.getString("email"));
				newUtilisateur.setMotPasse(rs.getString("password"));
				newUtilisateur.setDateNaissance(rs.getDate("date de naissance"));
				newUtilisateur.setDateCreation(rs.getDate("date de creation"));
				newUtilisateur.setDateModification(rs.getDate("date de modification"));
				
				utilisateurList.add(newUtilisateur);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return utilisateurList;
	}

	@Override
	public List<Utilisateur> findUtilisateurByEmail(String email) {
		Connection c = connection();
		List<Utilisateur> utilisateurList = new ArrayList<Utilisateur>();

		String selectSQL = "SELECT * FROM utilisateur WHERE email = ?";
		PreparedStatement preparedStatement;

		try {
			preparedStatement = c.prepareStatement(selectSQL);
			preparedStatement.setString(1, email);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				Utilisateur newUtilisateur = new Utilisateur();
				newUtilisateur.setIdUtilisateur(rs.getInt("id"));
				newUtilisateur.setCivilite(rs.getString("civilite"));
				newUtilisateur.setNom(rs.getString("nom"));
				newUtilisateur.setPrenom(rs.getString("prenom"));
				newUtilisateur.setIdentifiant(rs.getString("identifiant"));
				newUtilisateur.setEmail(rs.getString("email"));
				newUtilisateur.setMotPasse(rs.getString("password"));
				newUtilisateur.setDateNaissance(rs.getDate("date de naissance"));
				newUtilisateur.setDateCreation(rs.getDate("date de creation"));
				newUtilisateur.setDateModification(rs.getDate("date de modification"));
				
				utilisateurList.add(newUtilisateur);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return utilisateurList;
	}

	@Override
	public Utilisateur createUtilisateur(Utilisateur utilisateur) {
		Connection c = connection();
		String selectSQL = "INSERT INTO utilisateur VALUES("+utilisateur.getIdUtilisateur()+",'"+utilisateur.getCivilite()+"','"+utilisateur.getNom()+"','"+utilisateur.getPrenom()+"','"+utilisateur.getIdentifiant()+"','"+utilisateur.getEmail()+"','"+utilisateur.getMotPasse()+"','"+utilisateur.getDateNaissance()+"','"+utilisateur.getDateCreation()+"','"+utilisateur.getDateModification()+"')";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = c.prepareStatement(selectSQL);
			preparedStatement.executeQuery(selectSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return utilisateur;
	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
		Connection c = connection();
		String selectSQL = "UPDATE utilisateur SET("+utilisateur.getIdUtilisateur()+",'"+utilisateur.getCivilite()+"','"+utilisateur.getNom()+"','"+utilisateur.getPrenom()+"','"+utilisateur.getIdentifiant()+"','"+utilisateur.getEmail()+"','"+utilisateur.getMotPasse()+"','"+utilisateur.getDateNaissance()+"','"+utilisateur.getDateCreation()+"','"+utilisateur.getDateModification()+"')";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = c.prepareStatement(selectSQL);
			preparedStatement.executeQuery(selectSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return utilisateur;
	}

	@Override
	public boolean deleteUtilisateur(Utilisateur utilisateur) {
		Connection c = connection();
		String selectSQL = "DELETE FROM utilisateur WHERE id="+utilisateur.getIdUtilisateur();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = c.prepareStatement(selectSQL);
			if(preparedStatement.executeQuery(selectSQL) != null) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}


}
