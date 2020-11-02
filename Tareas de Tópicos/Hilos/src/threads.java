package Hilos;


public class threads implements Runnable
{
	

	
	
	private String nombre;
	
	public threads(String nombre)
	{
		this.nombre=nombre;
	}

	
	public void run()
	{
		
		for(int i=1;i<=5;i++)
		{
			if(nombre.equalsIgnoreCase("Hilo 1"))
			{
				System.out.println(i+" "+ nombre +"---->" );
			}
			else if(nombre.equalsIgnoreCase("Hilo 2"))
			{
				System.out.println(i+" "+ nombre +"<----" );
			}
			
			else
			{
				System.out.println(i+" "+ nombre +"-----" );
			}
			
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		
		}
		
	}

}

