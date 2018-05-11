package br.com.rendup.model;

public class Planos {
	
	private int idPlano;
	private String nomePlano;
	private String descricao;
	private float valor;
	
	public Planos() {}
	
	public Planos(int idPlano, String nomePlano, String descricao, float valor) {
		setAll(idPlano, nomePlano, descricao, valor);
	}
	
	public void setAll(int idPlano, String nomePlano, String descricao, float valor) {
		setIdPlano(idPlano);
		setNomePlano(nomePlano);
		setDescricao(descricao);
		setValor(valor);
	}
	
	public String getAll() {
		return "Plano: " + nomePlano + "\n" +
				"Descrição: " + descricao  + "\n" +
				"Valor: " + valor;
	}
	
	public void setIdPlano(int idPlano) {
		this.idPlano = idPlano;
	}
	
	public int getIdPlano() {
		return idPlano;
	}
	
	public void setNomePlano(String nomePlano) {
		this.nomePlano = nomePlano.toUpperCase();
	}
	
	public String getNomePlano() {
		return nomePlano;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public float getValor() {
		return valor;
	}

}
