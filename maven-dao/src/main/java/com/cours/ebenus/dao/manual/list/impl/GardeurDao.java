package com.cours.ebenus.dao.manual.list.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cours.ebenus.dao.IGardeurDao;
import com.cours.ebenus.dao.entities.Gardeur;
import com.cours.ebenus.utils.Constants;

public class GardeurDao implements IGardeurDao {

	@Override
	public List<Gardeur> findAllGardeurs() {
		Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		List<Gardeur> gardeurList = new ArrayList<Gardeur>();
		
		String selectSQL = "SELECT * FROM gardeur";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			ResultSet rs = preparedStatement.executeQuery(selectSQL);
			while (rs.next()) {
				Gardeur newGardeur = new Gardeur();
				newGardeur.setIdGardeur(rs.getInt("id"));
				newGardeur.setEmail(rs.getString("email"));
				newGardeur.setPassword(rs.getString("password"));
				newGardeur.setNom(rs.getString("nom"));
				newGardeur.setPrenom(rs.getString("prenom"));
				newGardeur.setAdresse(rs.getString("adresse"));
				newGardeur.setCodePostal(rs.getInt("codePostal"));
				newGardeur.setPrix(rs.getInt("prix"));
				newGardeur.setTypeLogement(rs.getString("typeLogement"));
				newGardeur.setChat(rs.getBoolean("chat"));
				newGardeur.setChien(rs.getBoolean("chien"));
				newGardeur.setValid(rs.getBoolean("valid"));
				gardeurList.add(newGardeur);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gardeurList;
	}

	@Override
	public Gardeur findGardeurById(int idGardeur) {
		Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		String selectSQL = "SELECT * FROM gardeur WHERE id = ?";
		PreparedStatement preparedStatement;
		
		Gardeur newGardeur = null;
		
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.setInt(1, idGardeur);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				newGardeur = new Gardeur();
				newGardeur.setIdGardeur(rs.getInt("id"));
				newGardeur.setEmail(rs.getString("email"));
				newGardeur.setPassword(rs.getString("password"));
				newGardeur.setNom(rs.getString("nom"));
				newGardeur.setPrenom(rs.getString("prenom"));
				newGardeur.setAdresse(rs.getString("adresse"));
				newGardeur.setCodePostal(rs.getInt("codePostal"));
				newGardeur.setPrix(rs.getInt("prix"));
				newGardeur.setTypeLogement(rs.getString("typeLogement"));
				newGardeur.setChat(rs.getBoolean("chat"));
				newGardeur.setChien(rs.getBoolean("chien"));
				newGardeur.setValid(rs.getBoolean("valid"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return newGardeur;
	}

	@Override
	public List<Gardeur> findGardeurByPrenom(String prenom) {
	Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		List<Gardeur> gardeurList = new ArrayList<Gardeur>();
		
		String selectSQL = "SELECT * FROM gardeur WHERE prenom = ?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.setString(1, prenom);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Gardeur newGardeur = new Gardeur();
				newGardeur.setIdGardeur(rs.getInt("id"));
				newGardeur.setEmail(rs.getString("email"));
				newGardeur.setPassword(rs.getString("password"));
				newGardeur.setNom(rs.getString("nom"));
				newGardeur.setPrenom(rs.getString("prenom"));
				newGardeur.setAdresse(rs.getString("adresse"));
				newGardeur.setCodePostal(rs.getInt("codePostal"));
				newGardeur.setPrix(rs.getInt("prix"));
				newGardeur.setTypeLogement(rs.getString("typeLogement"));
				newGardeur.setChat(rs.getBoolean("chat"));
				newGardeur.setChien(rs.getBoolean("chien"));
				newGardeur.setValid(rs.getBoolean("valid"));
				gardeurList.add(newGardeur);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gardeurList;
	}

	@Override
	public List<Gardeur> findGardeurByNom(String nom) {
		Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		List<Gardeur> gardeurList = new ArrayList<Gardeur>();
		
		String selectSQL = "SELECT * FROM gardeur WHERE nom = ?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.setString(1, nom);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Gardeur newGardeur = new Gardeur();
				newGardeur.setIdGardeur(rs.getInt("id"));
				newGardeur.setEmail(rs.getString("email"));
				newGardeur.setPassword(rs.getString("password"));
				newGardeur.setNom(rs.getString("nom"));
				newGardeur.setPrenom(rs.getString("prenom"));
				newGardeur.setAdresse(rs.getString("adresse"));
				newGardeur.setCodePostal(rs.getInt("codePostal"));
				newGardeur.setPrix(rs.getInt("prix"));
				newGardeur.setTypeLogement(rs.getString("typeLogement"));
				newGardeur.setChat(rs.getBoolean("chat"));
				newGardeur.setChien(rs.getBoolean("chien"));
				newGardeur.setValid(rs.getBoolean("valid"));
				gardeurList.add(newGardeur);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gardeurList;
	}

	@Override
	public List<Gardeur> findGardeurByEmail(String email) {
		Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		List<Gardeur> gardeurList = new ArrayList<Gardeur>();
		
		String selectSQL = "SELECT * FROM gardeur WHERE email = ?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.setString(1, email);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Gardeur newGardeur = new Gardeur();
				newGardeur.setIdGardeur(rs.getInt("id"));
				newGardeur.setEmail(rs.getString("email"));
				newGardeur.setPassword(rs.getString("password"));
				newGardeur.setNom(rs.getString("nom"));
				newGardeur.setPrenom(rs.getString("prenom"));
				newGardeur.setAdresse(rs.getString("adresse"));
				newGardeur.setCodePostal(rs.getInt("codePostal"));
				newGardeur.setPrix(rs.getInt("prix"));
				newGardeur.setTypeLogement(rs.getString("typeLogement"));
				newGardeur.setChat(rs.getBoolean("chat"));
				newGardeur.setChien(rs.getBoolean("chien"));
				newGardeur.setValid(rs.getBoolean("valid"));
				gardeurList.add(newGardeur);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gardeurList;
	}

	@Override
	public Gardeur createGardeur(Gardeur gardeur) {
	Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		String selectSQL = "INSERT INTO gardeur VALUES("+gardeur.getIdGardeur()+",'"+gardeur.getEmail()+"','"+gardeur.getPassword()+"','"+gardeur.getNom()+"','"+gardeur.getPrenom()+"','"+gardeur.getAdresse()+"',"+gardeur.getCodePostal()+","+gardeur.getPrix()+"'"+gardeur.getTypeLogement()+"','"+gardeur.isChat()+"','"+gardeur.isChien()+"',"+gardeur.isValid()+")";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.executeQuery(selectSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return gardeur;
	}

	@Override
	public Gardeur updateGardeur(Gardeur gardeur) {
	Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		String selectSQL = "UPDATE gardeur SET("+gardeur.getIdGardeur()+",'"+gardeur.getEmail()+"','"+gardeur.getPassword()+"','"+gardeur.getNom()+"','"+gardeur.getPrenom()+"','"+gardeur.getAdresse()+"',"+gardeur.getCodePostal()+","+gardeur.getPrix()+"'"+gardeur.getTypeLogement()+"','"+gardeur.isChat()+"','"+gardeur.isChien()+"',"+gardeur.isValid()+")";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.executeQuery(selectSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return gardeur;
	}

	@Override
	public boolean deleteGardeur(Gardeur gardeur) {
Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		String selectSQL = "DELETE FROM gardeur WHERE"+gardeur.getIdGardeur()+",'"+gardeur.getEmail()+"','"+gardeur.getPassword()+"','"+gardeur.getNom()+"','"+gardeur.getPrenom()+"','"+gardeur.getAdresse()+"',"+gardeur.getCodePostal()+","+gardeur.getPrix()+"'"+gardeur.getTypeLogement()+"','"+gardeur.isChat()+"','"+gardeur.isChien()+"',"+gardeur.isValid()+")";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			if(preparedStatement.executeQuery(selectSQL) != null) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
