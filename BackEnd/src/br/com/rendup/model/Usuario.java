package br.com.rendup.model;
import java.util.Date;
import java.util.UUID;

public class Usuario {
	
	private String idUser;
	private String nome;
	private String email;
	private String senha;
	private String cpf;
	private String rg;
	private Date dtNascimento = new Date();
	private PerguntaSecreta perguntaSecreta;
	private String respostaSecreta;
	long guardaCPF[] = new long[11];
	
	public Usuario() {}
	
	public Usuario(String idUser, String nome, String email, String senha, String cpf, String rg, Date dtNascimento, PerguntaSecreta perguntaSecreta, String respostaSecreta) {
		setAll(idUser, nome, email, senha, cpf, rg, dtNascimento, perguntaSecreta, respostaSecreta);
	}
	
	public void setAll(String idUser, String nome, String email, String senha, String cpf, String rg, Date dtNascimento, PerguntaSecreta perguntaSecreta, String respostaSecreta) {
		setIdUser(idUser);
		setNome(nome);
		setEmail(email);
		setSenha(senha);
		setCPF(cpf);
		setRG(rg);
		setDataNascimento(dtNascimento);;
		setPerguntaSecreta(perguntaSecreta);
		setRespostaSecreta(respostaSecreta);
	}

	public String getAll() {
		return "Login: " + idUser + "\n" +
				"Nome: " + nome + "\n" +
				"E-mail: " + email + "\n" +
				"Senha:" + senha + "\n" +
				"CPF: " + cpf +"\n" +
				"RG: " + rg  + "\n" +
				"Data de Nascimento: " + dtNascimento  + "\n"  +
				"Pergunta Secreta: " + perguntaSecreta + "\n" +
				"Resposta da Pergunta Secreta: " +respostaSecreta;
	}
	
	public void setIdUser(String idUser) {
		if(idUser != "" ) {
			this.idUser = idUser;			
		}else {
			System.out.println("Id invalido");
		}
	}
	
	public String getIdUser() {
		return idUser;
	}
	
	public void setNome(String nome) {
		if(nome != "") {
			this.nome = nome.toUpperCase();			
		}else {
			System.out.println("Nome invalido");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setEmail(String email) {
		if(verificaEmail(email) != true) {
			System.out.println("Email invalido");
			return;
		}
		this.email = email.toLowerCase();
	
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setSenha(String senha) {
		if(verificaSenha(senha) == false) {
			System.out.println("Senha deve conter de 8 a 16 digitos com no minimo um caracter"
					+ "especial, letra maiucula e numero");
			return;
		}		
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setCPF(String cpf) {
		if(validaCPF(cpf) == false) {
			System.out.println("Cpf inválido");
			return;
		}
		this.cpf = cpf;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public void setRG(String rg) {
		if(verificaRg(rg) != true) {
			System.out.println("Rg em formato invalido");
			return;
		}
		this.rg = rg;
	}
	
	public String getRG() {
		return rg;
	}
	
	public void setDataNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	public Date getDataNascimento() {
		return dtNascimento;
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
	
	public boolean validaCPF(String cpf) {
		
		if(!cpf.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}")) {
			System.out.println("Forma de Cpf invalido");
			return false;
		}

			      int conta = 0;
			      int conta2 = 0;
			      int dg1 = 0;
			      int dg2 = 0;
			      
			      int[] cpfDigitos = new int[11];
			      
			      for(int x = 0; x < 9; x ++ ){
			          String num = cpf.substring(x,(x+1));
			          int y = Integer.parseInt(num);
			          cpfDigitos[x] = y;
			      }
			      
			      for(int x = 0; x < 9; x++){
			        int unico = cpfDigitos[x]*(10-x);
			        conta += unico;
			      }
			      
			      if(conta%11 >= 10){
			         dg1 = 0;
			      } 
			      	else {
			      		int valor = 11-(conta%11);
			      		cpfDigitos[9] = valor;
			      		dg1 = valor;
			      }

			      for(int x = 0; x < 10; x++){
			        int unico = cpfDigitos[x]*(11-x);
			        conta2 += unico;
			      }
			      
			      if(conta2%11 >= 10){
			         dg2 = 0;
			      }
			      	else {
			      		int valor2 = 11- conta2%11;
			      		dg2 = valor2;
			      }
			      
			      String validador = cpf.substring(9,10);
			      int dv1 = Integer.parseInt(validador);
			      String validador2 = cpf.substring(10,11);
			      int dv2 = Integer.parseInt(validador2);
			      
			      if(dv1 != dg1 || dv2 != dg2) {
			    	  System.out.println("CPF inválido.");
			    	  return false;
			      } 
			      else {
			    	  return true;
			      }
			    
			   }
	
		public boolean verificaRg(String rg) {
				if(email.matches("\\d{2}.\\d{3}.\\d{3}-\\d{1}")) {
					return true;
				}else {
					return false;
				}
		}

		public String generateToken() {
			 UUID uuid = UUID.randomUUID();
		        String randomUUIDString = uuid.toString();
		 
		        return randomUUIDString;
		}
	}

