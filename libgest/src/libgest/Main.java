package libgest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
		ArrayList<Employee> employees = new ArrayList<Employee>();
		ArrayList<Livre> livres = new ArrayList<Livre>();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		boolean var = true;
		while (var) {
			System.out.println("*********************Programme de Gestion*********************");
			System.out.println("Menu Principal");

			System.out.println("1- Gestion Etudiant");
			System.out.println("2- Gestion Employee");
			System.out.println("3- Gestion Livre");
			System.out.println("4- Quitter le programme");

			System.out.println("Choix :");

			int choix = sc.nextInt();

			switch (choix) {
			case 1:

				boolean var1 = true;

				while (var1) {

					System.out.println("*********************Gestion Etudiant*********************");
					System.out.println("1- Ajouter Etudiant");
					System.out.println("2- Supprimer Etudiant");
					System.out.println("3- Modifier Etudiant");
					System.out.println("4- Afficher Etudiant");
					System.out.println("5- Quitter le Menu Etudiant");

					System.out.println("Choix :");

					int choixEtudiant = sc.nextInt();

					switch (choixEtudiant) {
					case 1:
						System.out.println("Ajouter le Id  d'etudaint \n ");
						String id = sc.nextLine();
						System.out.println("Ajouter le Nom d'etudaint  \n");
						String nom = sc.nextLine();
						System.out.println("Ajouter le prenom d'etudaint \n");
						String prenom = sc.nextLine();
						System.out.println("Ajouter l age d'etudaint \n ");
						int age = sc.nextInt();

						System.out.println("Ajouter la branche d'etudaint \n ");
						String branche = sc.nextLine();
						Etudiant etudiant = new Etudiant(id, nom, prenom, age, branche);
						etudiants.add(etudiant);// adding Student class object

						System.out.println("Bien Ajouté");

						break;
					case 2:
						System.out.println("Supprimer Etudiant");
						System.out.println(
								"-----------------------------------------------------------------------------");
						System.out.printf("%10s %10s %10s %10s %7s %15s", "Id dans table", "ID", "NOM", "PRENOM", "AGE",
								"BRANCHE");
						System.out.println();
						System.out.println(
								"-----------------------------------------------------------------------------");

						for (int i = 0; i < etudiants.size(); i++) {
							System.out.format("%10s %10s %10s %10s %7s %15s", i + 1, etudiants.get(i).getId(),
									etudiants.get(i).getNom(), etudiants.get(i).getPrenom(), etudiants.get(i).getAge(),
									etudiants.get(i).getBranche());
							System.out.println();
						}
						System.out.println(
								"-----------------------------------------------------------------------------");

						System.out.println("Select etudiant a supr: ");
						etudiants.remove(sc.nextInt() - 1);

						System.out.println("Bien supprimer");

						break;
					case 3:
						System.out.println("Modifier Etudiant");
						System.out.println(
								"-----------------------------------------------------------------------------");
						System.out.printf("%10s %10s %10s %10s %7s %15s", "Id dans table", "ID", "NOM", "PRENOM", "AGE",
								"BRANCHE");
						System.out.println();
						System.out.println(
								"-----------------------------------------------------------------------------");

						for (int i = 0; i < etudiants.size(); i++) {
							System.out.format("%10s %10s %10s %10s %7s %15s", i + 1, etudiants.get(i).getId(),
									etudiants.get(i).getNom(), etudiants.get(i).getPrenom(), etudiants.get(i).getAge(),
									etudiants.get(i).getBranche());
							System.out.println();
						}
						System.out.println(
								"-----------------------------------------------------------------------------");

						System.out.println("Select etudiant a modifier: ");

						int ii = sc.nextInt() - 1;

						for (int i = 0; i < etudiants.size(); i++) {
							if (i == ii) {

								System.out.println("neveau Nom :");
								String nomE = sc.next();
								etudiants.get(i).setNom(nomE);

								System.out.println("neveau Prenom :");
								String prenomE = sc.next();
								etudiants.get(i).setPrenom(prenomE);

								System.out.println("neveau Age :");
								int ageE = sc.nextInt();
								etudiants.get(i).setAge(ageE);

								System.out.println("neveau Branche :");
								String brancheE = sc.next();
								etudiants.get(i).setBranche(brancheE);

								System.out.println("bien modif :");

							} else {
								System.out.println("aucun id est associer recayer plustrar");

							}

						}
						System.out.println("Bien Modifier");

						break;
					case 4:
						System.out.println("Afficher Etudiant");

						System.out.println(
								"-----------------------------------------------------------------------------");
						System.out.printf("%10s %10s %10s %10s %7s %15s", "Id dans table", "ID", "NOM", "PRENOM", "AGE",
								"BRANCHE");
						System.out.println();
						System.out.println(
								"-----------------------------------------------------------------------------");

						for (int i = 0; i < etudiants.size(); i++) {
							System.out.format("%10s %10s %10s %10s %7s %15s", i + 1, etudiants.get(i).getId(),
									etudiants.get(i).getNom(), etudiants.get(i).getPrenom(), etudiants.get(i).getAge(),
									etudiants.get(i).getBranche());
							System.out.println();
						}
						System.out.println(
								"-----------------------------------------------------------------------------");

						break;
					case 5:
						System.out.println("Quitter");

						var1 = false;
						var = true;
						break;

					default:
						System.out.println("Choix invalid!!!!!!!!!!!");
						break;
					}
				}
				break;
			case 2:
				boolean var2 = true;

				while (var2) {

					System.out.println("*********************Gestion Employee*********************");
					System.out.println("1- Ajouter Employee");
					System.out.println("2- Supprimer Employee");
					System.out.println("3- Modifier Employee");
					System.out.println("4- Afficher Employee");
					System.out.println("5- Quitter le Menu Employee");

					System.out.println("Choix :");

					int choixEmployee = sc.nextInt();

					switch (choixEmployee) {
					case 1:
						System.out.println("Ajouter le Id  Employee \n ");
						String id = sc.nextLine();
						System.out.println("Ajouter le Nom d'Employee \n");
						String nom = sc.nextLine();
						System.out.println("Ajouter le prenom d'Employee \n");
						String prenom = sc.nextLine();
						System.out.println("Ajouter l age d'Employee \n ");
						int age = sc.nextInt();

						System.out.println("Ajouter le salair d'Employee \n ");
						float salaire = sc.nextFloat();
						Employee employee = new Employee(id, nom, prenom, age, salaire);
						employees.add(employee);

						System.out.println("Bien Ajoute");

						break;
					case 2:
						System.out.println("Supprimer Employee");
						System.out.println(
								"-----------------------------------------------------------------------------");
						System.out.printf("%10s %10s %10s %10s %7s %15s", "Id dans table", "ID", "NOM", "PRENOM", "AGE",
								"SALAIRE");
						System.out.println();
						System.out.println(
								"-----------------------------------------------------------------------------");

						for (int i = 0; i < employees.size(); i++) {
							System.out.format("%10s %10s %10s %10s %7s %15s", i + 1, employees.get(i).getId(),
									employees.get(i).getNom(), employees.get(i).getPrenom(), employees.get(i).getAge(),
									employees.get(i).getSalaire());
							System.out.println();
						}
						System.out.println(
								"-----------------------------------------------------------------------------");

						System.out.println("Select employee a supr: ");
						employees.remove(sc.nextInt() - 1);

						System.out.println("Bien supprimer");

						break;
					case 3:
						System.out.println("Modifier employee");
						System.out.println(
								"-----------------------------------------------------------------------------");
						System.out.printf("%10s %10s %10s %10s %7s %15s", "Id dans table", "ID", "NOM", "PRENOM", "AGE",
								"BRANCHE");
						System.out.println();
						System.out.println(
								"-----------------------------------------------------------------------------");

						for (int i = 0; i < employees.size(); i++) {
							System.out.format("%10s %10s %10s %10s %7s %15s", i + 1, employees.get(i).getId(),
									employees.get(i).getNom(), employees.get(i).getPrenom(), employees.get(i).getAge(),
									employees.get(i).getSalaire());
							System.out.println();
						}
						System.out.println(
								"-----------------------------------------------------------------------------");

						System.out.println("Select employee a modifier: ");

						int ii = sc.nextInt() - 1;

						for (int i = 0; i < employees.size(); i++) {
							if (i == ii) {

								System.out.println("neveau Nom :");
								String nomE = sc.next();
								employees.get(i).setNom(nomE);

								System.out.println("neveau Prenom :");
								String prenomE = sc.next();
								employees.get(i).setPrenom(prenomE);

								System.out.println("neveau Age :");
								int ageE = sc.nextInt();
								employees.get(i).setAge(ageE);

								System.out.println("neveau Branche :");
								float Salaire = sc.nextFloat();
								employees.get(i).setSalaire(Salaire);

								System.out.println("bien modif :");

							} else {
								System.out.println("aucun id est associer recayer plustrar");

							}

						}
						System.out.println("Bien Modifier");

						break;
					case 4:
						System.out.println("Afficher employees");
						System.out.println(
								"-----------------------------------------------------------------------------");
						System.out.printf("%10s %10s %10s %10s %7s %15s", "Id dans table", "ID", "NOM", "PRENOM", "AGE",
								"Salaire");
						System.out.println();
						System.out.println(
								"-----------------------------------------------------------------------------");

						for (int i = 0; i < employees.size(); i++) {
							System.out.format("%10s %10s %10s %10s %7s %15s", i + 1, employees.get(i).getId(),
									employees.get(i).getNom(), employees.get(i).getPrenom(), employees.get(i).getAge(),
									employees.get(i).getSalaire());
							System.out.println();
						}
						System.out.println(
								"-----------------------------------------------------------------------------");

						break;
					case 5:
						System.out.println("Quitter");

						var1 = false;
						var = true;
						break;

					default:
						System.out.println("Choix invalid!!!!!!!!!!!");
						break;
					}
				}
				break;
			case 3:
				boolean var3 = true;

				while (var3) {
					System.out.println("*********************Gestion Livre*********************");
					System.out.println("1- Ajouter Livre");
					System.out.println("2- Supprimer Livre");
					System.out.println("3- Modifier Livre");
					System.out.println("4- Afficher Livre");
					System.out.println("5- Quitter le Menu Livre");

					System.out.println("Choix :");

					int choixEmployee = sc.nextInt();

					switch (choixEmployee) {
					case 1:

						System.out.println("Ajouter le titre \n");
						String titre = sc.nextLine();
						System.out.println("Ajouter l'auteur \n");
						String auteur = sc.nextLine();
						System.out.println("Ajouter nombre Pages \n ");
						int nombrePages = sc.nextInt();

						Livre livre = new Livre(titre, auteur, nombrePages);
						livres.add(livre);

						System.out.println("Bien Ajoute");

						break;
					case 2:
						System.out.println("Supprimer Livre");
						System.out.println(
								"-----------------------------------------------------------------------------");
						System.out.printf("%10s %10s %10s %10s ", "Id dans table", "titre", "auteur", "nombre Pages");
						System.out.println();
						System.out.println(
								"-----------------------------------------------------------------------------");

						for (int i = 0; i < livres.size(); i++) {
							System.out.format("%10s %10s %10s %10s", i + 1, livres.get(i).getTitre(),
									livres.get(i).getAuteur(), livres.get(i).getNombrePages());
							System.out.println();
						}
						System.out.println(
								"-----------------------------------------------------------------------------");

						System.out.println("Select Livre a supr: ");
						livres.remove(sc.nextInt() - 1);

						System.out.println("Bien supprimer");

						break;
					case 3:
						System.out.println("Modifier Livre");
						System.out.println(
								"-----------------------------------------------------------------------------");
						System.out.printf("%10s %10s %10s %10s", "Id dans table", "titre", "auteur", "nombre Pages");
						System.out.println();
						System.out.println(
								"-----------------------------------------------------------------------------");

						for (int i = 0; i < livres.size(); i++) {
							System.out.format("%10s %10s %10s %10s", i + 1, livres.get(i).getTitre(),
									livres.get(i).getAuteur(), livres.get(i).getNombrePages());
							System.out.println();
						}
						System.out.println(
								"-----------------------------------------------------------------------------");

						System.out.println("Select Livre a modifier: ");

						int ii = sc.nextInt() - 1;

						for (int i = 0; i < livres.size(); i++) {
							if (i == ii) {

								System.out.println("neveau Auteur :");
								String nomE = sc.next();
								livres.get(i).setAuteur(nomE);

								System.out.println("neveau Titre :");
								String ntitre = sc.next();
								livres.get(i).setTitre(ntitre);

								System.out.println("neveau Age :");
								int page = sc.nextInt();
								livres.get(i).setNombrePages(page);

								System.out.println("bien modif :");

							} else {
								System.out.println("aucun id est associer recayer plustrar");

							}

						}
						System.out.println("Bien Modifier");

						break;
					case 4:
						System.out.println("Afficher Livres");
						System.out.println(
								"-----------------------------------------------------------------------------");
						System.out.printf("%10s %10s %10s %10s", "Id dans table", "titre", "auteur", "nombre Pages");
						System.out.println();
						System.out.println(
								"-----------------------------------------------------------------------------");

						for (int i = 0; i < livres.size(); i++) {
							System.out.format("%10s %10s %10s %10s", i + 1, livres.get(i).getTitre(),
									livres.get(i).getAuteur(), livres.get(i).getNombrePages());
							System.out.println();
						}
						System.out.println(
								"-----------------------------------------------------------------------------");
						break;
					case 5:
						System.out.println("Quitter");

						var1 = false;
						var = true;
						break;

					default:
						System.out.println("Choix invalid!!!!!!!!!!!");
						break;
					}
				}

				break;
			case 4:
				System.out.println("*********************Quitter*********************");
				System.exit(0);
				break;

			default:
				System.out.println("Choix invalid!!!!!!!!!!!");
				break;
			}

		}

	}

}
