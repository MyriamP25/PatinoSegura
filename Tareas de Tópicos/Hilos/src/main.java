package Hilos;

class Apliacion
{
	public static void main(String[]Args)
	{
	
		threads nuevo = new threads("Hilo 1");
		Thread hilo = new Thread(nuevo);

		threads nuevo2 = new threads("Hilo 2");
		Thread hilo2 = new Thread(nuevo2);

		threads nuevo3 = new threads("Hilo 3");
		Thread hilo3 = new Thread(nuevo3);

		hilo.start();
		hilo2.start();
		hilo3.start();

	}
	

}