package com.cours.ebenus.dao.manual.list.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cours.ebenus.dao.IProprietaireDao;
import com.cours.ebenus.dao.entities.Proprietaire;
import com.cours.ebenus.utils.Constants;

public class ProprietaireDao implements IProprietaireDao {

	@Override
	public List<Proprietaire> findAllProprietaires() {
		Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		List<Proprietaire> proprietaireList = new ArrayList<Proprietaire>();
		
		String selectSQL = "SELECT * FROM proprietaire";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			ResultSet rs = preparedStatement.executeQuery(selectSQL);
			while (rs.next()) {
				Proprietaire newProprietaire = new Proprietaire();
				newProprietaire.setIdProprietaire(rs.getInt("id"));
				newProprietaire.setEmail(rs.getString("email"));
				newProprietaire.setPassword(rs.getString("password"));
				newProprietaire.setNom(rs.getString("nom"));
				newProprietaire.setPrenom(rs.getString("prenom"));
				newProprietaire.setAdresse(rs.getString("adresse"));
				newProprietaire.setCodePostal(rs.getInt("codePostal"));
				newProprietaire.setValid(rs.getBoolean("valid"));
				proprietaireList.add(newProprietaire);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return proprietaireList;
	}

	@Override
	public Proprietaire findProprietaireById(int idProprietaire) {
		Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		String selectSQL = "SELECT * FROM proprietaire WHERE id = ?";
		PreparedStatement preparedStatement;
		
		Proprietaire newProprietaire = null;
		
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.setInt(1, idProprietaire);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				newProprietaire = new Proprietaire();
				newProprietaire.setIdProprietaire(rs.getInt("id"));
				newProprietaire.setEmail(rs.getString("email"));
				newProprietaire.setPassword(rs.getString("password"));
				newProprietaire.setNom(rs.getString("nom"));
				newProprietaire.setPrenom(rs.getString("prenom"));
				newProprietaire.setAdresse(rs.getString("adresse"));
				newProprietaire.setCodePostal(rs.getInt("codePostal"));
				newProprietaire.setValid(rs.getBoolean("valid"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return newProprietaire;
	}

	@Override
	public List<Proprietaire> findProprietaireByPrenom(String prenom) {
	Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		List<Proprietaire> proprietaireList = new ArrayList<Proprietaire>();
		
		String selectSQL = "SELECT * FROM proprietaire WHERE prenom = ?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.setString(1, prenom);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Proprietaire newProprietaire = new Proprietaire();
				newProprietaire.setIdProprietaire(rs.getInt("id"));
				newProprietaire.setEmail(rs.getString("email"));
				newProprietaire.setPassword(rs.getString("password"));
				newProprietaire.setNom(rs.getString("nom"));
				newProprietaire.setPrenom(rs.getString("prenom"));
				newProprietaire.setAdresse(rs.getString("adresse"));
				newProprietaire.setCodePostal(rs.getInt("codePostal"));
				newProprietaire.setValid(rs.getBoolean("valid"));
				proprietaireList.add(newProprietaire);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return proprietaireList;
	}

	@Override
	public List<Proprietaire> findProprietaireByNom(String nom) {
	Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		List<Proprietaire> proprietaireList = new ArrayList<Proprietaire>();
		
		String selectSQL = "SELECT * FROM proprietaire WHERE nom = ?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.setString(1, nom);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Proprietaire newProprietaire = new Proprietaire();
				newProprietaire.setIdProprietaire(rs.getInt("id"));
				newProprietaire.setEmail(rs.getString("email"));
				newProprietaire.setPassword(rs.getString("password"));
				newProprietaire.setNom(rs.getString("nom"));
				newProprietaire.setPrenom(rs.getString("prenom"));
				newProprietaire.setAdresse(rs.getString("adresse"));
				newProprietaire.setCodePostal(rs.getInt("codePostal"));
				newProprietaire.setValid(rs.getBoolean("valid"));
				proprietaireList.add(newProprietaire);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return proprietaireList;
	}

	@Override
	public List<Proprietaire> findProprietaireByEmail(String email) {
	Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		List<Proprietaire> proprietaireList = new ArrayList<Proprietaire>();
		
		String selectSQL = "SELECT * FROM proprietaire WHERE email = ?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.setString(1, email);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Proprietaire newProprietaire = new Proprietaire();
				newProprietaire.setIdProprietaire(rs.getInt("id"));
				newProprietaire.setEmail(rs.getString("email"));
				newProprietaire.setPassword(rs.getString("password"));
				newProprietaire.setNom(rs.getString("nom"));
				newProprietaire.setPrenom(rs.getString("prenom"));
				newProprietaire.setAdresse(rs.getString("adresse"));
				newProprietaire.setCodePostal(rs.getInt("codePostal"));
				newProprietaire.setValid(rs.getBoolean("valid"));
				proprietaireList.add(newProprietaire);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return proprietaireList;
	}

	@Override
	public Proprietaire createProprietaire(Proprietaire proprietaire) {
	Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		String selectSQL = "INSERT INTO proprietaire VALUES("+proprietaire.getIdProprietaire()+",'"+proprietaire.getEmail()+"','"+proprietaire.getPassword()+"','"+proprietaire.getNom()+"','"+proprietaire.getPrenom()+"','"+proprietaire.getAdresse()+"',"+proprietaire.getCodePostal()+","+proprietaire.isValid()+")";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.executeQuery(selectSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return proprietaire;
	}

	@Override
	public Proprietaire updateProprietaire(Proprietaire proprietaire) {
	Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		String selectSQL = "UPDATE proprietaire SET("+proprietaire.getIdProprietaire()+",'"+proprietaire.getEmail()+"','"+proprietaire.getPassword()+"','"+proprietaire.getNom()+"','"+proprietaire.getPrenom()+"','"+proprietaire.getAdresse()+"',"+proprietaire.getCodePostal()+","+proprietaire.isValid()+")";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.executeQuery(selectSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return proprietaire;
	}

	@Override
	public boolean deleteProprietaire(Proprietaire proprietaire) {
Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		String selectSQL = "DELETE FROM proprietaire WHERE"+proprietaire.getIdProprietaire()+",'"+proprietaire.getEmail()+"','"+proprietaire.getPassword()+"','"+proprietaire.getNom()+"','"+proprietaire.getPrenom()+"','"+proprietaire.getAdresse()+"',"+proprietaire.getCodePostal()+","+proprietaire.isValid()+")";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.executeQuery(selectSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
