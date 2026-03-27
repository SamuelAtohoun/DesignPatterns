package tp1_pro;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String nom;
	private int 	age;
	
	
	public String getNom() {
		return nom;
	}


	public User(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


}
