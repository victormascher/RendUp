package br.com.fiap.beans;

import java.util.Date;

public class Compra {
	
	private int id_compra;
	private Date dt_compra = new Date();
	private boolean status;
	private Usuario usuario;
	private Planos plano;
	
	public Compra() {}
	
	public Compra(int id_compra, Date dt_compra, boolean status, Usuario usuario, Planos plano) {
		setAll(id_compra, dt_compra, status, usuario, plano);
	}
	
	public void setAll(int id_compra, Date dt_compra, boolean status, Usuario usuario, Planos plano) {
		setCompraID(id_compra) ;
		setDataCompra(dt_compra); 
		setStatus(status);
		setUsuario(usuario); 
		setPlano(plano);
	}
	
	public String getAll() {
		return "Data da compra: " + dt_compra + "\n" +
				"Status: " + status + "\n" +
				"Usuario: " + usuario + "\n" +
				"Plano: " + plano;
	}
	
	public void setCompraID(int id_compra) {
		this.id_compra = id_compra;
	}
	
	public int getCompraID() {
		return id_compra;
	}
	
	public void setDataCompra(Date dt_compra) {
		this.dt_compra = dt_compra;
	}
	
	public Date getDataCompra() {
		return dt_compra;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public boolean getStatus() {
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
