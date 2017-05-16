package Pac3;

import java.util.EmptyStackException;

import javax.annotation.processing.FilerException;

public interface Stack {
	
	 /* Nelle implementazioni, i metodi devono essere dichiarato
	  * public anche se qui non compare il modificatore d'accesso:
	  * in una interfaccia tutti i metodi sono implicitamente public!
	  * Anche le interfacce possono avere attributi, che sono implicitamente static */
	
	boolean is_empty ();
	void push (int v) throws FilerException;
	int pop () throws EmptyStackException;
}