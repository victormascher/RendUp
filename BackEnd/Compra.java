package br.com.fiap.beans;

import java.util.Date;

public class Compra {
	
	private int idCompra;
	private Date dtCompra = new Date();
	private boolean status;
	private Usuario usuario;
	private Planos plano;
	
	public Compra() {}
	
	public Compra(int idCompra, Date dtCompra, boolean status, Usuario usuario, Planos plano) {
		setAll(idCompra, dtCompra, status, usuario, plano);
	}
	
	public void setAll(int idCompra, Date dtCompra, boolean status, Usuario usuario, Planos plano) {
		setIdCompra(idCompra) ;
		setDataCompra(dtCompra); 
		setStatus(status);
		setUsuario(usuario); 
		setPlano(plano);
	}
	
	public String getAll() {
		return "ID da sua compra: " + idCompra + "\n" +
				"Data da compra: " + dtCompra + "\n" +
				"Status: " + status + "\n" +
				"Usuario: " + usuario + "\n" +
				"Plano: " + plano;
	}
	
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	
	public int getIdCompra() {
		return idCompra;
	}
	
	public void setDataCompra(Date dtCompra) {
		this.dtCompra = dtCompra;
	}
	
	public Date getDataCompra() {
		return dtCompra;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public boolean isConfirmado() {
		return status;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setPlano(Planos plano) {
		this.plano = plano;
	}
	
	public Planos getPlano() {
		return plano;
	}
}
