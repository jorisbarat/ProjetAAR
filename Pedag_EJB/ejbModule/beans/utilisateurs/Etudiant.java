package beans.utilisateurs;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Etudiant{

	@Id
	int numEtudiant;
	
	@OneToOne
	Utilisateur user;

	public Etudiant(){}
	
	public Etudiant(String loginUtilisateur, String email, String password, String nomUtilisateur, String prenomUtilisateur) {
		user = new Utilisateur(loginUtilisateur, email, password, nomUtilisateur, prenomUtilisateur);
	}
	
	public Etudiant(String loginUtilisateur, String email, String password, String nomUtilisateur, String prenomUtilisateur, int numEtudiant) {
		user = new Utilisateur(loginUtilisateur, email, password, nomUtilisateur, prenomUtilisateur);
		this.numEtudiant = numEtudiant;
	}
	
	public int getNumEtudiant() {
		return numEtudiant;
	}

	public void setNumEtudiant(int numEtudiant) {
		this.numEtudiant = numEtudiant;
	}	
	
}
