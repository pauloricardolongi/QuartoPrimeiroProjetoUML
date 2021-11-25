package aplicacao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.Trabalhador;
import entities.enums.NivelTrabalhador;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do Departamento: ");
		String departamentoNome = sc.nextLine();
		System.out.print("Entre com os dados do Trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Nível: ");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Salário Base: ");
		double salarioBase = sc.nextDouble();
		
		//Diagrama de Objetos
		
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador),
		salarioBase, new Departamento(departamentoNome));
		
		System.out.print("Quantos contratos este trabalhador vai ter? ");
		int n = sc.nextInt();
		for(int i=1; i<n; i++) {
			System.out.println("Entre com contrato # " + i + " dados: ");
			System.out.print("Date (DD/MM/YYYY): ");
			
			
			
		}
		
		sc.close();
		

	}

}
