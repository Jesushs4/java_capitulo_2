/**
 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
 * otra variable como cadena de caracteres y asígnale como valor la concatena-
 * ción de las anteriores 5 variables. Por último, muestra la cadena de caracteres
 * por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 * @author Jesús Herrera Sánchez
 */

public class Ejercicio8 {
    public static void main(String args[]) {
        char cha1='a';
        char cha2='b';
        char cha3='c';
        char cha4='d';
        char cha5='e';
        String concat=""+cha1+cha2+cha3+cha4+cha5;
        System.out.println(concat);

    }
    
}
