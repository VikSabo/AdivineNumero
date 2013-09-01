/**
 * Created with Eclipse.
 * User: Jairo
 * Descripción: Clase en donde se desarolla los metodos relacionados con las oportunidades y los intentos.
*/

// Declaracion de la clase Oportunidades.
public class Oportunidades extends NumeroSecreto{

// Declaracion publica de la variable intentos.
	int intentos = 3;
	
// Constructor de la variable intentos.
	public Oportunidades(int intentos) 
	{
		this.intentos = intentos;
	}

// Getters y Setters del atributo intentos.

	public int getIntentos()
	{
		return intentos;
	}

	public void setIntentos(int intentos) {
		if (intentos >3)
		{
			throw new RuntimeException("El parametro es mayor al permitido");
		}
		else
		{
			this.intentos = intentos;
		}
		
	}
	
// Metodo Booleano que retorna true en caso que hay mas intentos y false cuando se acabaron.
	public boolean hayMasIntentos(){
		if (intentos > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
}
	


