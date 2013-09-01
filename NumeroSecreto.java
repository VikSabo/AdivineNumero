import java.util.Random;


public class NumeroSecreto {
    private int numero;
    private int rangoInicio;
    private int rangoFinal;

    public NumeroSecreto() {
	    this.rangoInicio = 0;
	    this.rangoFinal = 10;
    }

    public void setNumeroSecreto(int num){
	    this.numero=num;
    }

    public int getNumeroSecreto() {
	    return numero;
    }

    private int getRangoInicio() {
	    return rangoInicio;
    }

    public void setRangoInicio(int rangoInicio) {
	    this.rangoInicio = rangoInicio;
    }

    private int getRangoFinal() {
	    return rangoFinal;
    }

    public void setRangoFinal(int rangoFinal) {
	    this.rangoFinal = rangoFinal;
    }

    public void generarNumero(){

	    Random r = new Random();
	    int numero = r.nextInt(this.getRangoFinal() - this.getRangoInicio() + 1) + this.getRangoInicio();
	    this.setNumeroSecreto(numero);
	
    }

}

