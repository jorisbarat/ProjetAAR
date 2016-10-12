package beans.utilisateurs;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Administrateur{

	@Id
	int numAdmin;
	
	@OneToOne
	Utilisateur user;
	
	public Administrateur(){}
	
	public Administrateur(String loginUtilisateur, String email, String password, String nomUtilisateur,
			String prenomUtilisateur) {
		user = new Utilisateur(loginUtilisateur, email, password, nomUtilisateur, prenomUtilisateur);
	}

}
