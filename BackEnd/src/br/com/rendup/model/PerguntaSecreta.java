package br.com.rendup.model;

public class PerguntaSecreta {
	
	private int idPergunta;
	private String pergunta;
	

	public PerguntaSecreta() {}
	
	public PerguntaSecreta(int idPergunta, String pergunta){
		setAll(idPergunta, pergunta);
	}

	public void setAll(int idPergunta, String pergunta) {
		setIdPergunta(idPergunta);
		setQuestao(pergunta);
	}
	
	public String getAll() {
		return "Pergunta de Segurança: " + pergunta;
	}
	
	public void setIdPergunta(int idPergunta) {
		this.idPergunta = idPergunta;
	}
	
	public int getIdPergunta() {
		return idPergunta;
	}
	
	public void setQuestao(String pergunta) {
		this.pergunta = pergunta.toUpperCase();
	}
	
	public String getQuestao() {
		return pergunta;
	}

}
