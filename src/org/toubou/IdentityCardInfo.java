package org.toubou;

public class IdentityCardInfo {
 static String nom="TOUBOU";
 static String prenom="JEAN SYLVAIN";
 static String datenaiss="18/08/1982";
 static String lieu="SANTCHOU";
 static String nompere="NFOBEP LOUIS";
 static String nommere="ABAMO ROSE";
 static String profession="INGENIEUR INFORMATIQUE";
 static String adresse="DLA-NKOTTO";
 static float taille=171f;
 static char sexe='M';
 static short poids=88;
 static String numero="115525799";
 static String datedelivrance="16/07/2013";
 static String dateexp="16/07/2023";
 
 
 public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Nom: " +nom);
		System.out.println("Prenom: " +prenom);
		System.out.println("Né(e) le: " +datenaiss);
		System.out.println("A : " +lieu);
		System.out.println("Pere: " +nompere);
		System.out.println("Mere: " +nommere);
		System.out.println("Profession: " +profession);
		System.out.println("Adresse: " +adresse);
		System.out.println("Taille : " +taille +"M");
		System.out.println("Sexe: " +sexe);
		System.out.println("S.P: " +poids);
		System.out.println("N°: " +numero);
		System.out.println("Date de délivrance: " +datedelivrance);
		System.out.println("Date d'expiration: " +dateexp);
	}

}
