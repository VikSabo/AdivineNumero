public class Oportunidades {
	int intentos = 3;

	public Oportunidades(int intentos) 
	{
		this.intentos = intentos;
	}

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
	
	public boolean hayMasIntentos(){
		if (intentos > 0)
		{
			return true;
		}
		else{
			return false;
		}
	}
	
	
}
	


