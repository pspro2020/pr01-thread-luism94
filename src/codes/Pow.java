package codes;

public class Pow extends Thread {

	private int numb;

	public Pow(int numb) {
		this.numb = numb;
	}

	@Override
	public void run() {
		//En cada hilo muestro la tabla de potencias del entero que ha inicializado en cada uno de los hilos
		//Potencias del 0 al 10
		for (int i = 0; i < 11; i++) {
			System.out.println(getName() + " " + numb + " ^ " + i + " = " + Math.pow(numb, i)); //Mostrar nombre del hilo
		}
	}
	
}
