/**
 * Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación
 * @author Jesús Herrera Sánchez
 */

public class Ejercicio1 {
    public static void main(String args[]){
        int x=144;
        int y=999;
        System.out.printf("x=%s\n", x);
        System.out.printf("y=%s\n",y);
        System.out.printf("%s+%s=%s\n", x, y, x+y);
        System.out.printf("%s-%s=%s\n", x, y, x-y);
        System.out.printf("%sx%s=%s\n", x, y, x*y);
        System.out.printf("%s/%s=%s\n", (double)x, (double)y, (double)x/y);
    }
}