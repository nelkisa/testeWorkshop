package login;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String loginV, login, senhaV, senha;
		
		System.out.println("Login: ");
		loginV = sc.nextLine();
		System.out.println("Senha: ");
		senhaV = sc.nextLine();
		
		System.out.println("Insira o Login: ");
		login = sc.nextLine();
		System.out.println("Insira a Senha: ");
		senha = sc.nextLine();
		
		if (login.equals(loginV) && senha.equals(senhaV)) {
			System.out.println("� o bix�o mesmo hein?");
		}
		else {
			System.out.println("usu�rio ou senha incorretos!");
		}
		
	}

}
