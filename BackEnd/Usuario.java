package br.com.fiap.beans;
import java.util.Date;

public class Usuario {
	
	private String id_user;
	private String nome;
	private String email;
	private String senha;
	private long cpf;
	private long rg;
	private Date dt_nasc = new Date();
	private String token;
	private PerguntaSecreta perguntaSecreta;
	private String respostaSecreta;
	
	public Usuario() {}
	
	public Usuario(String id_user, String nome, String email, String senha, long cpf, long rg, Date dt_nasc, String token, PerguntaSecreta perguntaSecreta, String respostaSecreta) {
		setAll(id_user, nome, email, senha, cpf, rg, dt_nasc, token, perguntaSecreta, respostaSecreta);
	}
	
	public void setAll(String id_user, String nome, String email, String senha, long cpf, long rg, Date dt_nasc, String token, PerguntaSecreta perguntaSecreta, String respostaSecreta) {
		setUserID(id_user);
		setNome(nome);
		setEmail(email);
		setSenha(senha);
		setCPF(cpf);
		setRG(rg);
		setDataNascimento(dt_nasc);
		setToken(token);
		setPerguntaSecreta(perguntaSecreta);
		setRespostaSecreta(respostaSecreta);
	}

	public String getAll() {
		return "Login: " + id_user + "\n" +
				"Nome: " + nome + "\n" +
				"E-mail: " + email + "\n" +
				"Senha:" + senha + "\n" +
				"CPF: " + cpf +"\n" +
				"RG: " + rg  + "\n" +
				"Data de Nascimento: " + dt_nasc  + "\n" +
				"Token de Confirmação:" + token  + "\n" +
				"Pergunta Secreta: " + perguntaSecreta + "\n" +
				"Resposta da Pergunta Secreta: " +respostaSecreta;
	}
	
	public void setUserID(String id_user) {
		this.id_user = id_user;
	}
	
	public String getUserID() {
		return id_user;
	}
	
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public String getNome() {
		return nome;
	}

	public void setEmail(String email) {
		this.email = email.toLowerCase();
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setCPF(long cpf) {
		this.cpf = cpf;
	}
	
	public long getCPF() {
		return cpf;
	}
	
	public void setRG(long rg) {
		this.rg = rg;
	
	}
	
	public long getRG() {
		return rg;
	}
	
	public void setDataNascimento(Date dt_nasc) {
		this.dt_nasc = dt_nasc;
	}
	
	public Date getDataNascimento() {
		return dt_nasc;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setPerguntaSecreta(PerguntaSecreta perguntaSecreta) {
		this.perguntaSecreta = perguntaSecreta;
	}
	
	public PerguntaSecreta getPerguntaSecreta() {
		return perguntaSecreta;
	}
	
	public void setRespostaSecreta(String respostaSecreta) {
		this.respostaSecreta = respostaSecreta;
	}
	
	public String getRespostaSecreta() {
		return respostaSecreta;
	}
	
	public boolean verificaSenha(String senha){
				
		if(!(senha.matches("\\d+"))){
			System.out.println("Senha não contem números");
			return false;
		}
		if(!(senha.matches("[A-Z]"))){
			System.out.println("Senha deve contar no minimo uma letra maiuscula");
			return false;
		}
		if(!(senha.length()>=8 && senha.length() <= 16)){
			System.out.println("Senha deve conter no mínimo 8 e no maximo 18 caracteres");
			return false;
		}
		if(!(senha.matches(("[!#$%&'()*+,-./:;?@[\\\\\\]_`{|}~]]")))){
			System.out.println("Senha deve conter no minimo 1 caracter especial");	
			return false;	
		}
		
		return true;
	}
	
	public boolean verificaEmail(String email) {
		
		if(!(email.matches("^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)@\" + \"[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)(\\\\.[A-Za-z]{2,})$"))) {
			System.out.println("E-mail inválido.");
			return false;
		}
		return true;
	}
}
