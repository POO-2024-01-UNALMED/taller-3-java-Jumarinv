package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	public TV (Marca marca, boolean estado) {
		
		this.marca = marca; this.estado = estado;
	}
	
	void turnOn () {
		
		estado = true;
	}
	
	void turnOff () {
		
		estado = false;
	}
	
	boolean getEstado () {
		
		return estado;
	}
	
	void canalUp () {
		
		if (estado && canal <= 120) {
			
			canal = canal + 1;
		}
	}
	
	void canalDown () {
		if (estado && canal >= 1) {
			
			canal = canal - 1;
		}
	}
	
	void volumenUp () {
		if (estado && volumen <= 7) {
			
			volumen = volumen + 1;
		}
	}
	
	void volumenDown () {
		if (estado && volumen >= 0) {
			
			volumen = volumen - 1;
		}
	}
	
	void setMarca (Marca marca) {
		
		this.marca = marca;
	}
	
	Marca getMarca (){
		
		return marca;
		
		
	}
	
	void setCanal (int canal) {
		
		this.canal = canal;
	}
	
	int getCanal (){
		
		return canal;
		
	}
	
	void setPrecio (int precio) {
		
		this.precio = precio;
	}
	
	int getPrecio (){
		
		return precio;
	
	}
	
	void setVolumen (int volumen) {
		
		this.volumen = volumen;
	}
	
	int getVolumen (){
		
		return volumen;
	
	}
	
	void setControl (Control control) {
		
		this.control = control;
	}
	
	Control getControl (){
		
		return control;
	
	}
	
	void setNumTV () {
		
		numTV = numTV + 1;
	}
	
	int getNumTV () {
		
		return numTV;
	}
	

}
