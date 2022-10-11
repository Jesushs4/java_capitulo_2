/**
 * Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación
 * @author Jesús Herrera Sánchez
 */

public class Ejercicio1 {
    public static void main(String args[]){
        float num1=144;
        float num2=999;
        System.out.printf("%s+%s=%s\n", num1, num2, num1+num2);
        System.out.printf("%s-%s=%s\n", num1, num2, num1-num2);
        System.out.printf("%sx%s=%s\n", num1, num2, num1*num2);
        System.out.printf("%s/%s=%s\n", num1, num2, num1/num2);
    }
}