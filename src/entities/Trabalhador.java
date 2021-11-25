package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelTrabalhador;

public class Trabalhador {
	private String nome;
	private NivelTrabalhador nivel;
	private Double salarioBase;
	
	//Associações: Trabalhador
	private Departamento departamento;
	private List<ContratoHora> contratos = new ArrayList<>();
	
	public Trabalhador() {
		
	}
	// gerar o construtor sem a lista contratos

	public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
		
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}

	
	public void addContrato(ContratoHora contrato) {
		contratos.add(contrato);
	}
	public void removeContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}
	/*percorrer os contratos deste funcionário, testando quais os contratos que são deste mês e ano
	e se o contrato for deste mes e ano vai entrar na soma*/
	public double renda (int year, int month) {
		double soma = salarioBase;	
		Calendar cal = Calendar.getInstance();
		for (ContratoHora c : contratos) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
		    int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				soma +=  c.valorTotal();
			}
		}
		return soma;
	}
	

}
