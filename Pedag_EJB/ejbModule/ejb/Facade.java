package ejb;

import javax.ejb.Local;

@Local
public interface Facade {
	public boolean ajouterUtilisateur(String loginUtilisateur, String email, String password, String nom, String prenom);
	public boolean ajouterEtudiant(String loginUtilisateur, String email, String password, String nom, String prenom);
	public boolean ajouterEnseignant(String loginUtilisateur, String email, String password, String nom, String prenom);
	
	public boolean supprimerUtilisateur(String login);
	public boolean supprimerEtudiant(String login);
	public boolean supprimerEnseignant(String login);
	
	/*
	public boolean identifier(String login, String password);
	public boolean sinscrireModule(String login, ...)
	
	public boolean ajouterModule(...);
	public boolean ajouterChapitre(...);
	
	public boolean supprimerModule(...);
	public boolean supprimerChapitre(...);
	*/
}
