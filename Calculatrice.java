import java.util.Scanner;

public class Calculatrice {
	
	public static void main(String[] args) {

		System.out.print("Bonjour !\n");
		System.out.print("Bienvenue dans la calculatrice ! :\n------------------------------------\n");
		Menu();

		
	}

	//Menu()
	public static void Menu() {

		Scanner msg = new Scanner(System.in);
		int intMsg = 0;

		do {

			System.out.print("\nChoissisez un mode ! :\n");
			System.out.print("1 : Addition\n");
			System.out.print("2 : Soustraction\n");
			System.out.print("3 : Multiplication\n");
			System.out.print("4 : Division\n");
			System.out.print("5 : Reste\n");
			System.out.print("6 : Puissance\n");
		
			intMsg = msg.nextInt();

			if (intMsg > 0 && intMsg < 7) {

				System.out.print("valeur correcte\n");

				Operation(intMsg);
				msg.close();


			} else System.out.print("ERREUR : valeur incorrecte\n");

		} while (intMsg < 1 || intMsg > 6);

	}
	
	//Operation()
	public static void Operation(int TypeOperation) {

		Scanner msg = new Scanner(System.in);

		if (TypeOperation == 1) {

			System.out.print("choissisez un 1er nombre : ");
			int nombre1 = msg.nextInt();

			System.out.print("choissisez un 2e nombre : ");
			int nombre2 = msg.nextInt();

			System.out.print("\n\nLe resultat est : " + Additionner(nombre1, nombre2) + "\n");
			Menu();

		}

		if (TypeOperation == 2) {

			System.out.print("choissisez un 1er nombre : ");
			int nombre1 = msg.nextInt();

			System.out.print("choissisez un 2e nombre : ");
			int nombre2 = msg.nextInt();

			System.out.print("\n\nLe resultat est : " + Soustraire(nombre1, nombre2) + "\n");
			Menu();

		}

		if (TypeOperation == 3) {

			System.out.print("choissisez un 1er nombre : ");
			int nombre1 = msg.nextInt();

			System.out.print("choissisez un 2e nombre : ");
			int nombre2 = msg.nextInt();

			System.out.print("\n\nLe resultat est : " + Multiplier(nombre1, nombre2) + "\n");
			Menu();

		}

		if (TypeOperation == 4) {

			System.out.print("choissisez un 1er nombre : ");
			int nombre1 = msg.nextInt();

			System.out.print("choissisez un 2e nombre : ");
			int nombre2 = msg.nextInt();

			System.out.print("\n\nLe resultat est : " + Diviser(nombre1, nombre2) + "\n");
			Menu();

		}

		if (TypeOperation == 5) {

			System.out.print("choissisez un 1er nombre : ");
			int nombre1 = msg.nextInt();

			System.out.print("choissisez un 2e nombre : ");
			int nombre2 = msg.nextInt();

			System.out.print("\n\nLe resultat est : " + Reste(nombre1, nombre2) + "\n");
			Menu();

		}

		if (TypeOperation == 6) {

			System.out.print("choissisez un 1er nombre : ");
			int nombre1 = msg.nextInt();

			System.out.print("choissisez un 2e nombre : ");
			int nombre2 = msg.nextInt();

			System.out.print("\n\nLe resultat est : " + Puissance(nombre1, nombre2) + "\n");
			Menu();

		}

		msg.close();

	}
	
	//Operations
	private static int Additionner(int nombre1, int nombre2) {
		return (nombre1 + nombre2);
	}
	
	private static int Soustraire(int nombre1, int nombre2) {
		return (nombre1 - nombre2);
	}
	
	private static int Multiplier(int nombre1, int nombre2) {
		return (nombre1 * nombre2);
	}
	
	private static double Diviser(int nombre1, int nombre2) {
		return ((double)(nombre1 /= nombre2) - (double)Reste(nombre1,nombre2));
	}
	
	private static double Reste(int nombre1, int nombre2) {
		return ((double)nombre1 % (double)nombre2);
	}
	
	private static int Puissance(int nombre1, int nombre2) {
		int result = 1;
		for (int i = 0;i < nombre2;i++) result = 1 * Multiplier(result,nombre1);
		
		return result;
	}
	

}