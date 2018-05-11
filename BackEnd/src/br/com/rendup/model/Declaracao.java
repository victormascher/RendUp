package br.com.rendup.model;

import java.util.Date;

public class Declaracao {
	
	private int idDeclaracao;
	private Date dtResposta = new Date();
	private Usuario usuario;
	private String respostas;
	private String hsPergunta;

	public Declaracao() {}
	
	public Declaracao(int idDeclaracao, Date dtResposta, Usuario usuario, String respostas, String hsPergunta) {
		setAll(idDeclaracao, dtResposta, usuario, respostas, hsPergunta);
	}
	
	public void setAll(int idDeclaracao, Date dtResposta, Usuario usuario, String respostas, String hsPergunta) {
		setIdDeclaracao(idDeclaracao);
		setDataResposta(dtResposta);
		setUsuario(usuario);
		setResposta(respostas);
		setHsPergunta(hsPergunta);
	}
	
	public String getAll() {
		return "O ID da sua declaração é: " + idDeclaracao + "\n" +
				"Data da resposta: " + dtResposta + "\n" +
				"Usuário:" + usuario + "\n" +
				"Respostas:" + respostas + "\n" +
				"Hash da Pergunta : " + hsPergunta;
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
	
	public void setHsPergunta(String hsPergunta) {
		this.hsPergunta = hsPergunta;
	}
	
	public String getHsPergunta() {
		return hsPergunta;
	}

}
