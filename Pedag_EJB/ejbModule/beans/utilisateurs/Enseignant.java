package beans.utilisateurs;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Enseignant{
	
	@OneToOne
	Utilisateur user;
	
	@Id
	int numEnseignant;

	public Enseignant(){}
	
	public Enseignant(String loginUtilisateur, String email, String password, String nomUtilisateur, String prenomUtilisateur) {
		user = new Utilisateur(loginUtilisateur, email, password, nomUtilisateur, prenomUtilisateur);
	}
	
	public Enseignant(String loginUtilisateur, String email, String password, String nomUtilisateur, String prenomUtilisateur, int numEnseignant) {
		user = new Utilisateur(loginUtilisateur, email, password, nomUtilisateur, prenomUtilisateur);
		this.numEnseignant = numEnseignant;
	}
	
	public int getNumEnseignant() {
		return numEnseignant;
	}

	public void setNumEnseignant(int numEnseignant) {
		this.numEnseignant = numEnseignant;
	}	
	
}
