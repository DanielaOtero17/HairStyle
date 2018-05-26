package modelo;

public class Usuario {

	private String nombre;
	private String contrasenia;
	
	public Usuario(String n, String c){
		
		nombre = n;
		contrasenia = c;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contrasenia;
	}

	public void setContraseña(String contraseña) {
		this.contrasenia = contraseña;
	}
	
	
	
	
	
}
