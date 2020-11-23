package com.cours.ebenus.dao;

import java.util.List;
import com.cours.ebenus.dao.entities.Animal;

public interface IAnimalDao {
	
	 	public List<Animal> findAllAnimals();

	    public Animal findAnimalById(int idAnimal);

	    public List<Animal> findAnimalByPrenom(String prenom);

	    public List<Animal> findAnimalByNom(String nom);

	    public List<Animal> findAnimalByEmail(String email);


	    public Animal createAnimal(Animal animal);

	    public Animal updateAnimal(Animal animal);

	    public boolean deleteAnimal(Animal animal);

}
