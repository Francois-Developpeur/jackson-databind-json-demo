package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Conducteur {

	public static void main(String[] args) {
		
		try {
			
			// créer un objet de mappage
			ObjectMapper mapper = new ObjectMapper();
			
			// lire le fichier JSON et le mappage et le convertir en JAVA POJO
			//donnée/sample-lite.json
			
			Etudiant etudiant1 = mapper.readValue(new File("data/sample-full.json"), Etudiant.class);
			
			//imprimer le prénom et le nom
			
			System.out.println("prenom = " + etudiant1.getPrenom());
			System.out.println("nom = " + etudiant1.getNom());
			
			// imprimer l'adresse : rue et ville
			
			Adresse tempAdresse = etudiant1.getAdresse()
;
			
			System.out.println("Rue = " + tempAdresse.getRue());
			System.out.println("Ville = " + tempAdresse.getVille());
			
			// imprimons les langages
			
			for (String tempLang : etudiant1.getLangages()) {
				System.out.println(tempLang);
			}
			
		}
		catch(Exception eww) {
			eww.printStackTrace();
		}
	}

}
