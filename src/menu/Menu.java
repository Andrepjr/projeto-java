package menu;

import java.util.Scanner;

import java.util.InputMismatchException;

import model.Alimentos;
import model.Bebida;
import model.Eletronicos;
import model.Vestuario;

public class Menu {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	//Vestuario
	Vestuario vestuario = new Vestuario();
	vestuario.setNome("Camiseta");
	vestuario.setPreco(65.0);
	vestuario.setDescricao("Camiseta de banda de rock");
	vestuario.setEstoque(32.0);
	vestuario.setFabricante("Modas rockeiras");
	vestuario.setTamanho(42);
	vestuario.setMaterial("algodao");
	vestuario.setCor("Preto");
		
	//Bebidas
	Bebida bebida = new Bebida();
	bebida.setNome("Refri legal");
	bebida.setPreco(10.0);
	bebida.setDescricao("Refrigerante sabor guarana");
	bebida.setEstoque(987.0);
	bebida.setFabricante("Super cola");
	bebida.setDatadevalidade(2024.0);
	bebida.setIngredientes("Água gaseificada, etc");
	bebida.setAlcoolico("Não");
	bebida.setVolume(500);
	
	//Eletronicos
	Eletronicos eletronicos = new Eletronicos();
	eletronicos.setNome("Celular");
	eletronicos.setPreco(1000.0);
	eletronicos.setDescricao("Celular de ultima geração marca japonesa");
	eletronicos.setEstoque(36.0);
	eletronicos.setFabricante("Japan Eletronics");
	eletronicos.setModelo("yxzpo");
	
	//Alimentos
	Alimentos alimentos = new Alimentos();
	alimentos.setNome("Feijao");
	alimentos.setPreco(13.0);
	alimentos.setDescricao("Feijao de corda");
	alimentos.setEstoque(9000.0);
	alimentos.setFabricante("Minas do Brasil");
	alimentos.setValidade(2024.0);
	alimentos.setIngredientes("Feijao de corda natural");
	
	
	
		int opcao,cpf,senha;
		String nome, email;

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
					System.out.println("Digite o CPF:  ");
					cpf = leia.nextInt();
					System.out.println("Digite o Nome Completo: ");
					leia.skip("\\R?");
					email = leia.nextLine();
					System.out.println("Digite a senha númerica: ");
					senha = leia.nextInt();
					System.out.println("Conta criada com sucesso! ");
					
					
					break;
				case 2:
					System.out.println("Vestuário");
					System.out.println(vestuario.getResumo());

					break;
				case 3:
					System.out.println("Bebidas");
					System.out.println(bebida.getResumo());
					break;
				
				case 4:
					System.out.println("Eletronicos");
					System.out.println(eletronicos.getResumo());
					break;
					
				
				case 5:
					System.out.println("Alimentos");
					System.out.println(alimentos.getResumo());
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
