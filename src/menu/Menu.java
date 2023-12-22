package menu;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		
		
		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                E-COMMERCE DA ANA                    ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Vestuário                            ");
			System.out.println("            3 - Bebida                               ");
			System.out.println("            4 - Eletronicos                          ");
			System.out.println("            5 - Alimentos                            ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\nE-COMMERCE DA ANA - 2023");
				 sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Criar Conta\n\n");

					break;
				case 2:
					System.out.println("Vestuário");

					break;
				case 3:
					System.out.println("Bebidas");

					break;
				case 4:
					System.out.println("Eletronicos");
					break;
					
				
				case 5:
					System.out.println("Alimentos");
					break;
				
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
	public static void sobre() {
		System.out.println("\n*********************************************************");


	}

}
