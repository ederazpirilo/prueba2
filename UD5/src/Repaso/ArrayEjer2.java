package Repaso;

public class ArrayEjer2 {

	public static void main(String[] args) {
		int[] numeros= new int[20];
		cargarTabla(numeros);
		int sumaPares=sumaPares(numeros);
		double prodImpares=prodImpares(numeros);
		imprimirDatos(numeros, sumaPares, prodImpares);
	}
	public static int generarNumero() {
		int numero=(int)(Math.random() * 100) + 1;
		return numero;
	}
	public static void cargarTabla(int numeros[]) {
		for(int i=0;i<numeros.length; i++) {
			numeros[i]=generarNumero();
			}
		
	}
	public static int sumaPares(int numeros[]) {
		int suma=0;
		for(int i=0;i<numeros.length; i=i+2) {
			suma+=numeros[i];
			}
		return suma;
	}
	public static double prodImpares(int numeros[]) {
		double producto=1;
		for(int i=1;i<numeros.length; i=i+2) {
			producto*=numeros[i];
			}
		return producto;
	}
	public static void imprimirDatos(int numeros[], int sumaPares, double prodImpares) {
		for(int i=0;i<numeros.length; i++) {
			System.out.print(numeros[i]+", ");
			}
		System.out.println("\nSuma de pares: "+sumaPares+"\nProducto de impares: "+prodImpares);
	}

}
