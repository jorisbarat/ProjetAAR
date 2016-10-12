package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

@Stateful
@LocalBean
public class FacadeBean implements Facade{

	@Override
	public boolean ajouterUtilisateur(String loginUtilisateur, String email, String password, String nom,
			String prenom) {
		return false;
	}

	@Override
	public boolean ajouterEtudiant(String loginUtilisateur, String email, String password, String nom, String prenom) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ajouterEnseignant(String loginUtilisateur, String email, String password, String nom,
			String prenom) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supprimerUtilisateur(String login) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supprimerEtudiant(String login) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supprimerEnseignant(String login) {
		// TODO Auto-generated method stub
		return false;
	}

}
