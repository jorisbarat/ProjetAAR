package beans.utilisateurs;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utilisateur implements Serializable{

	@Id
	String loginUtilisateur;
	
	String email;
	String password;
	String nomUtilisateur;
	String prenomUtilisateur;
	
	public Utilisateur(){}
	
	public Utilisateur(String loginUtilisateur, String email, String password, String nomUtilisateur, String prenomUtilisateur) {
		super();
		this.loginUtilisateur = loginUtilisateur;
		this.email = email;
		this.password = password;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
	}
	
	public String getLoginUtilisateur() {
		return loginUtilisateur;
	}
	public void setLoginUtilisateur(String loginUtilisateur) {
		this.loginUtilisateur = loginUtilisateur;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}
	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}
	
	
}
