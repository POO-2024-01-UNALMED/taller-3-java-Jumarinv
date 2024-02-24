package taller3.televisores;

public class Control {
	
	private TV tv;
	
	public void enlazar (TV tv) {
		
		this.tv = tv;
	}
	
	void setTV (TV tv) {
		
		this.enlazar (tv);
	}
	
	TV getTV () {
		
		return tv;
	}
	
	void turnOn () {
		
		this.tv.turnOn();
	}
	
	void turnOff () {
		
		this.tv.turnOff();
	}
	
	void canalUp () {
		
		this.tv.canalUp();
	}
	
	void canalDown () {
		
		this.tv.canalDown();
	}
	
	
	void volumenUp () {
		
		this.tv.volumenUp();
	}
	
	void volumenDown () {
		
		this.tv.volumenDown();
	}
	
	void setCanal (int canal) {
		
		this.tv.setCanal(canal);
	}
	
	void setVolumen (int volumen) {
		
		this.tv.setVolumen(volumen);
	}
	

}
