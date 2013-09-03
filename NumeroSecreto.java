import java.util.Random;

/**
 *Esta Clase genera el numero secreto por averiguar en el juego.
 * 
 * @author Luis FLores Mora 
 * 
 * @version 1/9/2013
 *
 */


public class NumeroSecreto {

//Atributos de la Clase	
	
private int numero;
private int rangoInicio=0;
private int rangoFinal=10;

//Metodos


/** 
 *Constructor para el numero secreto 
 *
 * @param rango de inicio y rango final para generar un numero secreto entres ambos rangos. 
 * 
 * 
 */

public NumeroSecreto(int rangoInicio, int rangoFinal) {
	this.rangoInicio = rangoInicio;
	this.rangoFinal = rangoFinal;
} // cierre constructor



/**
 *Metodo para setear numero 
 * 
 * @param num  es el valor que se desea asignar al atributo numero
 * 
 */
public void setNumeroSecreto(int num){
	this.numero=num;
}


/**
 * Metodo para obtener el valor de numero
 * 
 * @return numero un entero con el numero secreto 
 */
public int getNumeroSecreto() {
	return numero;
}




private int getRangoInicio() {
	return rangoInicio;
}


/**
 * Metodo que modifica el valor del rango de inicio 
 * 
 * @param rangoInicio valor entero por asignar. 
 */
public void setRangoInicio(int rangoInicio) {
	this.rangoInicio = rangoInicio;
}


private int getRangoFinal() {
	return rangoFinal;
}

/**
 * Metodo que asigna o modifica el valor del rango final. 
 * 
 * @param rangoFinal valor entero por asignar. 
 */
public void setRangoFinal(int rangoFinal) {
	this.rangoFinal = rangoFinal;
}

/**
 *  Metodo que se encarga de tomar los valores de los rangos de inicio y de final 
 * y generar un numero random q se encuentre entre estos, para luego setearlo en numero.     
 */
public void generarNumero(){

	Random r= new Random();
	int numero= r.nextInt(this.getRangoFinal()-this.getRangoInicio()+1)+this.getRangoInicio();
	this.setNumeroSecreto(numero);
	
}



}// final de la clase 

or de numero
 * 
 * @return numero un entero con el numero secreto 
 */
public int getNumeroSecreto() {
	return numero;
}

private int getRangoInicio() {
	return rangoInicio;
}


/**
 * Metodo que modifica 
