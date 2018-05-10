package br.com.fiap.beans;
import java.util.Date;

public class Declaracao {
	
	private int id_declaracao;
	private Date dt_resposta = new Date();
	private Usuario usuario;
	
	public Declaracao() {}
	
	public Declaracao(int id_declaracao, Date dt_resposta, Usuario usuario) {
		setAll(id_declaracao, dt_resposta, usuario);
	}
	
	public void setAll(int id_declaracao, Date dt_resposta, Usuario usuario) {
		setDeclaracaoID(id_declaracao);
		setDataResposta(dt_resposta);
		setUsuario(usuario);
	}
	
	public String getAll() {
		return "";
	}
	
	public void setDeclaracaoID(int id_declaracao) {
		this.id_declaracao = id_declaracao;
	}
	
	public int getDeclaracaoID() {
		return id_declaracao;
	}
	
	public void setDataResposta(Date dt_resposta) {
		this.dt_resposta = dt_resposta;
	}
	
	public Date getDataResposta() {
		return dt_resposta;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

}
