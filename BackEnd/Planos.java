package br.com.fiap.beans;

public class Planos {
	
	private int id_plano;
	private String nm_plano;
	private String descricao;
	private float valor;
	
	public Planos() {}
	
	public Planos(int id_plano, String nm_plano, String descricao, float valor) {
		setAll(id_plano, nm_plano, descricao, valor);
	}
	
	public void setAll(int id_plano, String nm_plano, String descricao, float valor) {
		setPlanoID(id_plano);
		setNomePlano(nm_plano);
		setDescricao(descricao);
		setValor(valor);
	}
	
	public String getAll() {
		return "Plano: " + nm_plano + "\n" +
				"Descrição: " + descricao  + "\n" +
				"Valor: " + valor;
	}
	
	public void setPlanoID(int id_plano) {
		this.id_plano = id_plano;
	}
	
	public int getPlanoID() {
		return id_plano;
	}
	
	public void setNomePlano(String nm_plano) {
		this.nm_plano = nm_plano.toUpperCase();
	}
	
	public String getNomePlano() {
		return nm_plano;
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
