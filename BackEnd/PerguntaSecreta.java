package br.com.fiap.beans;

public class PerguntaSecreta {
	
	private int id_pergunta;
	private String pergunta;
	

	public PerguntaSecreta() {}
	
	public PerguntaSecreta(int id_pergunta, String pergunta){
		setAll(id_pergunta, pergunta);
	}

	public void setAll(int id_pergunta, String pergunta) {
		setIdPergunta(id_pergunta);
		setQuestao(pergunta);
	}
	
	public String getAll() {
		return "Pergunta de Segurança: " + pergunta;
	}
	
	public void setIdPergunta(int id_pergunta) {
		this.id_pergunta = id_pergunta;
	}
	
	public int getIdPergunta() {
		return id_pergunta;
	}
	
	public void setQuestao(String pergunta) {
		this.pergunta = pergunta.toUpperCase();
	}
	
	public String getQuestao() {
		return pergunta;
	}

}
