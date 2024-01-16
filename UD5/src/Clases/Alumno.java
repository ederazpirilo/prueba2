package Clases;

public class Alumno  {
	
	private String nombre;
	private String apellido;
	
	private int notaRedes;
	private int notaBBDD;
	private int notaProgr;
	
	private float media;
	
	public Alumno() {
		this.nombre="generico";
		this.apellido="generico";
		this.notaRedes=0;
		this.notaBBDD=0;
		this.notaProgr=0;
		calcularMedia();
		
	}
	public Alumno(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.notaRedes=0;
		this.notaBBDD=0;
		this.notaProgr=0;
		calcularMedia();
	}
	public Alumno(String nombre, String apellido, int notaRedes, int notaBBDD, int notaProgr) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.notaRedes=notaRedes;
		this.notaBBDD=notaBBDD;
		this.notaProgr=notaProgr;
		calcularMedia();
	}
	
	private void calcularMedia() {
		media=(float)(notaRedes+notaBBDD+notaProgr);
		media=media/(float)3;
	}
	
	void mostrarAlumno(){
		System.out.println(nombre+" "+apellido+" "+media);
	}
	public  float getMedia() {
		return media;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
}
