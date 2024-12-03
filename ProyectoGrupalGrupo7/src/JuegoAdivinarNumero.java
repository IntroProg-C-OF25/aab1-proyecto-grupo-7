
/**
 * Se le solicita desarrollar un demo tipo juego, que permita generar un número
 * aleatorio y le rete al usuario que lo adivine. Si no adivina el número, el juego
 * debe sugerirle lo intente nuevamente con pistas (es mayor, menor, es par,
 * impar, es primo, pertenece a la serie de fibonacy, es multiplo de N, etc.), el
 * usuario es quien deberá ir pidiendo repetitivamente que el sistema le muestre o
 * no, más pintas, solo que, si el usuario pide más pistas, el sistema
 * automáticamente le resta un intento y le informa cuantos intentos le quedan. Al
 * finalizar el juego, se debe felicitar al usuario si gana y como, o pedir que lo
 * intente de nuevo.
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class JuegoAdivinarNumero {

    public static void main(String[] args) {

int aleatorio = (int) (Math.random() * 100) + 1;
        int numero, contador = 10, num1, num2, contador2 = 2, contador3 = 3, contador4 = 5, num3, num4, contador5 = 7, contador6 = 9;
        boolean pista2;
        Scanner an = new Scanner(System.in);
        num1 = (5 * aleatorio * aleatorio + 4);
        num2 = (5 * aleatorio * aleatorio - 4);
        num3 = ((6 * aleatorio) + 1);
        num4 = ((6 * aleatorio) - 1);
        while (true) {
            System.out.print("Adivina el numero que estoy pensando entre del 1 al 100: ");
            numero = an.nextInt();
            if (aleatorio == numero) {
                System.out.println("Bien adivinaste");
                break;
            }

            if (contador <= 0) {
                System.out.println("Perdiste");
                break;

            }
            System.out.println("Tienes " + contador + " intentos");
            contador--;

            System.out.println("¿Quieres una pista? ¿true o false? ");
            pista2 = an.nextBoolean();

            if (pista2) {
                if (aleatorio > numero) {
                    System.out.println("Es un poco mas");
                }
                if (aleatorio < numero) {
                    System.out.println("Es un poco menos");
                }
                if ((pista2) && (contador == 9) || (contador <= 7)) {
                    if (aleatorio % contador2 == 0) {
                        System.out.println("Es multiplo de " + contador2);
                    }
                    if (aleatorio % contador3 == 0) {
                        System.out.println("Es multiplo de " + contador3);
                    }

                    if (aleatorio % contador4 == 0) {
                        System.out.println("Es multiplo de " + contador4);
                    }

                    if (aleatorio % contador5 == 0) {
                        System.out.println("Es multiplo de " + contador5);
                    }

                    if (aleatorio % contador6 == 0) {
                        System.out.println("Es multiplo de " + contador6);
                    }

                    if (aleatorio % contador4 == 0) {
                        System.out.println("Es multiplo de " + contador4);
                    }

                    if (aleatorio % contador5 == 0) {
                        System.out.println("Es multiplo de " + contador5);
                    }
                }
                if ((pista2) && (contador == 8) || (pista2) && (contador <= 7)) {
                    if (aleatorio % 2 == 0) {
                        System.out.println("El numero es par");
                    }
                    if ((aleatorio / 3 == 1) || (aleatorio == 1)) {
                        System.out.println("El numero es impar");
                    }
                }
                if ((pista2) && (contador <= 7)) {
                    if ((aleatorio % num3 == aleatorio) && (aleatorio % num4 == aleatorio)) {
                        System.out.println("El numero es primo");
                    } else {
                        System.out.println("El numero no es primo ");
                    }
                    if ((aleatorio == num1) || (aleatorio == num2)) {
                        System.out.println("Pertenece a conjunto fibonacci");
                    } else {
                        System.out.println("No pertenecea conjunto fibonacci");
                    }
                }

            }
        }
    }
}
/*
* run:
* Adivina el numero que estoy pensando entre del 1 al 100: 50
* Tienes 10 intentos
* ¿Quieres una pista? ¿true o false? 
* true
* Es un poco mas
* El numero es primo
* No pertenecea conjunto fibonacci
* Adivina el numero que estoy pensando entre del 1 al 100: 75
* Tienes 9 intentos
* ¿Quieres una pista? ¿true o false? 
* true
* Es un poco menos
* El numero es primo
* No pertenecea conjunto fibonacci
* Adivina el numero que estoy pensando entre del 1 al 100: 60
* Tienes 8 intentos
* ¿Quieres una pista? ¿true o false? 
* true
* Es un poco mas
* El numero es primo
* No pertenecea conjunto fibonacci
* Adivina el numero que estoy pensando entre del 1 al 100: 65
* Tienes 7 intentos
* ¿Quieres una pista? ¿true o false? 
* true
* Es un poco mas
* El numero es primo
* No pertenecea conjunto fibonacci
* Adivina el numero que estoy pensando entre del 1 al 100: 70
* Tienes 6 intentos
* ¿Quieres una pista? ¿true o false? 
* true
* Es un poco mas
* El numero es primo
* No pertenecea conjunto fibonacci
* Adivina el numero que estoy pensando entre del 1 al 100: 73
* Bien adivinaste
 */
