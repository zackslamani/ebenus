package com.cours.ebenus.dao.entities;

/**
 *
 * @author elhad
 */
public class Animal {

    @Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", nom=" + nom + ", cohabit_chat=" + cohabit_chat + ", cohabit_chien="
				+ cohabit_chien + ", version=" + version + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (cohabit_chat ? 1231 : 1237);
		result = prime * result + (cohabit_chien ? 1231 : 1237);
		result = prime * result + ((idAnimal == null) ? 0 : idAnimal.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (cohabit_chat != other.cohabit_chat)
			return false;
		if (cohabit_chien != other.cohabit_chien)
			return false;
		if (idAnimal == null) {
			if (other.idAnimal != null)
				return false;
		} else if (!idAnimal.equals(other.idAnimal))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}
	private static final long serialVersionUID = 1L;
    private Integer idAnimal;
    private String nom;
    private boolean cohabit_chat;
    private boolean cohabit_chien;
    private Integer version = 0;

    public Animal() {
    }

    public Animal(Integer idAnimal, String nom, Boolean cohabit_chat, Boolean cohabit_chien ) {
        this.idAnimal = idAnimal;
        this.nom = nom;
        this.cohabit_chat = cohabit_chat;
        this.cohabit_chien = cohabit_chien;
        
    }

	public Integer getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(Integer idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isCohabit_chat() {
		return cohabit_chat;
	}

	public void setCohabit_chat(boolean cohabit_chat) {
		this.cohabit_chat = cohabit_chat;
	}

	public boolean isCohabit_chien() {
		return cohabit_chien;
	}

	public void setCohabit_chien(boolean cohabit_chien) {
		this.cohabit_chien = cohabit_chien;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

   
}
