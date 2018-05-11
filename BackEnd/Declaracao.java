package br.com.fiap.beans;
import java.util.Date;

public class Declaracao {
	
	private int idDeclaracao;
	private Date dtResposta = new Date();
	private Usuario usuario;
	private String respostas;

	public Declaracao() {}
	
	public Declaracao(int idDeclaracao, Date dtResposta, Usuario usuario, String respostas) {
		setAll(idDeclaracao, dtResposta, usuario, respostas);
	}
	
	public void setAll(int idDeclaracao, Date dtResposta, Usuario usuario, String respostas) {
		setIdDeclaracao(idDeclaracao);
		setDataResposta(dtResposta);
		setUsuario(usuario);
		setResposta(respostas);
	}
	
	public String getAll() {
		return "O ID da sua declaração é: " + idDeclaracao + "\n" +
				"Data da resposta: " + dtResposta + "\n" +
				"Usuário:" + usuario + "\n" +
				"Respostas:" + respostas;
	}
	
	public void setIdDeclaracao(int idDeclaracao) {
		this.idDeclaracao = idDeclaracao;
	}
	
	public int getIdDeclaracao() {
		return idDeclaracao;
	}
	
	public void setDataResposta(Date dtResposta) {
		this.dtResposta = dtResposta;
	}
	
	public Date getDataResposta() {
		return dtResposta;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setResposta(String respostas) {
		this.respostas = respostas;
	}
	
	public String getResposta() {
		return respostas;
	}
	

}
