package login;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String loginV, login, senhaV, senha;
		int saida = 1;
		
		System.out.println("Login: ");
		loginV = sc.nextLine();
		System.out.println("Senha: ");
		senhaV = sc.nextLine();
		
		if(senhaV.length() < 8) {
			System.out.println("Senha muito curta!");
		}
		else {
			
			while (saida == 1) {
							
				System.out.println("Insira o Login: ");
				login = sc.nextLine();
				System.out.println("Insira a Senha: ");
				senha = sc.nextLine();
				
				if (login.equals(loginV) && senha.equals(senhaV)) {
					System.out.println("é o bixão mesmo hein?");
					saida = 0;
				}
				else {
					System.out.println("usuário ou senha incorretos!\n");
					saida = 1;
				}
				
			}
			
		}
		
	}

}
