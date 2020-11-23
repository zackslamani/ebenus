package com.cours.ebenus.dao.manual.list.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cours.ebenus.dao.IAnimalDao;
import com.cours.ebenus.dao.entities.Animal;
import com.cours.ebenus.utils.Constants;

public class AnimalDao implements IAnimalDao {

	@Override
	public List<Animal> findAllAnimals() {
		Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		List<Animal> animalList = new ArrayList<Animal>();
		
		String selectSQL = "SELECT * FROM animal";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			ResultSet rs = preparedStatement.executeQuery(selectSQL);
			while (rs.next()) {
				Animal newAnimal = new Animal();
				newAnimal.setIdAnimal(rs.getInt("id"));
				newAnimal.setNom(rs.getString("nom"));
				newAnimal.setCohabit_chat(rs.getBoolean("cohabit_chat"));
				newAnimal.setCohabit_chien(rs.getBoolean("cohabit_chien"));
				animalList.add(newAnimal);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return animalList;
	}

	@Override
	public Animal findAnimalById(int idAnimal) {
		Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		String selectSQL = "SELECT * FROM animal WHERE id = ?";
		PreparedStatement preparedStatement;
		
		Animal newAnimal = null;
		
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.setInt(1, idAnimal);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				newAnimal = new Animal();
				newAnimal.setIdAnimal(rs.getInt("id"));
				newAnimal.setNom(rs.getString("nom"));
				newAnimal.setCohabit_chat(rs.getBoolean("cohabit_chat"));
				newAnimal.setCohabit_chien(rs.getBoolean("cohabit_chien"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return newAnimal;

	}

	@Override
	public List<Animal> findAnimalByPrenom(String prenom) {
		Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		List<Animal> animalList = new ArrayList<Animal>();
		
		String selectSQL = "SELECT * FROM animal WHERE prenom ?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.setString(1, prenom);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Animal newAnimal = new Animal();
				newAnimal.setIdAnimal(rs.getInt("id"));
				newAnimal.setNom(rs.getString("nom"));
				newAnimal.setCohabit_chat(rs.getBoolean("cohabit_chat"));
				newAnimal.setCohabit_chien(rs.getBoolean("cohabit_chien"));
				animalList.add(newAnimal);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return animalList;
	}

	@Override
	public List<Animal> findAnimalByNom(String nom) {
		Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		List<Animal> animalList = new ArrayList<Animal>();
		
		String selectSQL = "SELECT * FROM animal WHERE nom ?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.setString(1, nom);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Animal newAnimal = new Animal();
				newAnimal.setIdAnimal(rs.getInt("id"));
				newAnimal.setNom(rs.getString("nom"));
				newAnimal.setCohabit_chat(rs.getBoolean("cohabit_chat"));
				newAnimal.setCohabit_chien(rs.getBoolean("cohabit_chien"));
				animalList.add(newAnimal);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return animalList;
	}

	@Override
	public List<Animal> findAnimalByEmail(String email) {
		Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		List<Animal> animalList = new ArrayList<Animal>();
		
		String selectSQL = "SELECT * FROM animal WHERE email ?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.setString(1, email);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Animal newAnimal = new Animal();
				newAnimal.setIdAnimal(rs.getInt("id"));
				newAnimal.setNom(rs.getString("nom"));
				newAnimal.setCohabit_chat(rs.getBoolean("cohabit_chat"));
				newAnimal.setCohabit_chien(rs.getBoolean("cohabit_chien"));
				animalList.add(newAnimal);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return animalList;
	}

	@Override
	public Animal createAnimal(Animal animal) {
	Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		String selectSQL = "INSERT INTO animal VALUES("+animal.getIdAnimal()+",'"+animal.getNom()+"',"+animal.isCohabit_chat()+","+animal.isCohabit_chien()+")";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.executeQuery(selectSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return animal;
	
	}

	@Override
	public Animal updateAnimal(Animal animal) {
	Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		String selectSQL = "UPDATE animal SET("+animal.getIdAnimal()+",'"+animal.getNom()+"',"+animal.isCohabit_chat()+","+animal.isCohabit_chien()+")";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.executeQuery(selectSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return animal;
	}

	@Override
	public boolean deleteAnimal(Animal animal) {
	Connection connection = null;
		
		try {
			Class.forName(Constants.JDBC_DRIVER);
			connection = DriverManager.getConnection(Constants.DATABASE_URL,Constants.DATABASE_USER, Constants.DATABASE_PASSWORD);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		String selectSQL = "DELETE FROM animal WHERE"+animal.getIdAnimal()+",'"+animal.getNom()+"',"+animal.isCohabit_chat()+","+animal.isCohabit_chien()+")";
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
