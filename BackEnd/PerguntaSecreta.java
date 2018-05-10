package br.com.fiap.beans;

public class PerguntaSecreta {
	
	private int id_pergunta;
	private String pergunta;
	
	public PerguntaSecreta() {}
	
	public PerguntaSecreta(int id_pergunta, String pergunta){
		setAll(id_pergunta, pergunta);
	}

	public void setAll(int id_pergunta, String pergunta) {
		setPerguntaID(id_pergunta);
		setQuestao(pergunta);
	}
	
	public String getAll() {
		return "Pergunta de Segurança: " + pergunta;
	}
	
	public void setPerguntaID(int id_pergunta) {
		this.id_pergunta = id_pergunta;
	}
	
	public int getPerguntaID() {
		return id_pergunta;
	}
	
	public void setQuestao(String pergunta) {
		this.pergunta = pergunta.toUpperCase();
	}
	
	public String getQuestao() {
		return pergunta;
	}

}
