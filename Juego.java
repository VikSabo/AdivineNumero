/**
 * Created with IntelliJ IDEA.
 * User: victor y josé
 * Descripción: Clase en donde se desarolla los principales métodos del juego NumberGuess, como iniciar el juego y comparar numero.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Declaración de la clase Juego que hereda de la clase Oportunidades.

public class Juego extends Oportunidades {

// Declaración de el atributo privado jugadores.

    private int jugadores;

// Métodos get y set del atributo jugadores.

    public Juego(int jugadores) {
        this.jugadores = jugadores;
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }
    
    // Método booleano, para saber si el número digitado por el usuario y el número secreto, son iguales.

    public boolean compararNumero(int numeroUsuario){
        if (getNumeroSecreto() == numeroUsuario) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /* Método para jugar un intento de los 3 que se tiene, en éste método se solicita el número al usuario, se compara con una llamada al método anterior,
    éste retorna un entero, 0 si en el intento respondió correctamente, 1 si lo digitado es mayor al número secreto y -1 si lo digitado es menor al número secreto.
    */

    public int jugarIntento () throws IOException {
       int numeroUsuario;

       BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Ingrese un número >>>");
       String desdeConsola = stdin.readLine();

       numeroUsuario = Integer.parseInt(desdeConsola);

       boolean esCorrecto = compararNumero(numeroUsuario);

       if (esCorrecto) {
           return 0;
       }
       else  if (numeroUsuario > getNumeroSecreto()) {
           return -1;
       }
        else {
           return 1;
       }

    }
    
    /* Método principal para arrancar el juego, acá se solicita la cantidad de jugadores, que debe ser como máximo 2, si es 1 se crea el número aleatoriamente
    para empezar el juego, si son 2 jugadores, se puede ir turnando cuál jugador adivina y cuál otro escoge el número.
    */

    public void iniciarJuego() throws IOException {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el número de Jugadores >>>");
        String desdeConsola = stdin.readLine();

        setJugadores(Integer.parseInt(desdeConsola));

        if (jugadores == 1) {
            String rangoIni;
            String rangoFin;
            System.out.println("Ingrese el Rango inicial >>>");
            rangoIni = stdin.readLine();
            System.out.println("Ingrese el Rango Final");
            rangoFin = stdin.readLine();
            setRangoInicial(Integer.parseInt(rangoIni));
            setRangoFinal(Integer.parseInt(rangoFin));
            generarNumeroSecreto();
            jugarIntento();
        }
        else if (jugadores == 2) {
            String numerosecreto;
            System.out.println("Jugador 2 ingrese número Secreto >>>");
            numerosecreto = stdin.readLine();

            setNumeroSecreto(Integer.parseInt(numerosecreto));
            jugarIntento();

        }
        else {
             throw new RuntimeException("Este juego es para máximo de dos jugadores");
        }
    }

}


