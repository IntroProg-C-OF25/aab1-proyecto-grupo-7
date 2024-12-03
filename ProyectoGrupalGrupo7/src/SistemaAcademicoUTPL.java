
/**
 * La UTPL, le contrata para realizar una aplicación pequeña que permita la gestión de
 * calificaciones de los estudiantes en una materia.
 * Del Estudiante se registra su: nombre, cédula y la materia a cruzar. (Auto genere estos datos
 * con la función ALEATORIO/RAMDOM)
 * Se debe verificar la aprobación de una materia dadas tres calificaciones: ACD (3.5/10), APE
 * (3.5/10) y AA (3/10). Se aprueba si la sumatoria es de al menos 70%, si cumple con este
 * requisito, se considera que ha aprobado, caso contrario informar al estudiante que deberá rendir
 * un examen de recuperación sobre 3.5/10 pts. agregado al 60% acumulado de los componentes
 * ACD, APE y AA.
 * Ahora, debe implementar los siguientes requisitos en su programa:
 * 1. El programa debe permitir al usuario ingresar los datos de un estudiante, incluyendo su
 * nombre y cédula. (Nota: realizarlo por medio de simulación – random/aleatorio en el main())
 * 2. El programa debe permitir auto generar simulación de los datos de una materia, incluyendo
 * su nombre y las calificaciones del estudiante en las categorías ACD, APE y AA.
 * 3. El programa debe verificar si un estudiante ha aprobado la materia. Para ello, se deben
 * evaluar las calificaciones del estudiante en las tres categorías (ACD, APE y AA).
 * 4. Al finalizar, el programa debe mostrar las estadísticas/porcentajes de aprobación y/o
 * reprobación de la materia de un X curso.
 *
 * @author Daniela Briceño
 */
import java.util.Random;
import java.util.Scanner;

public class SistemaAcademicoUTPL {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);

        int contador = 1;
        double promedio = 0, acd, ape, aa, recu = 0;
        Random random = new Random();

        while (contador <= 2) {
            //Materia Random
            String[] materia = {"Fundamentos Matemáticas", "Computacion y Sociedad", "Humanismo", "Fundamentos Computacionales", "Programacion"};
            String materias = materia[random.nextInt(materia.length)];
            System.out.println("Materia:" + materias);
            //Nombres Random
            String[] nombres = {"Juan", "Maria", "Carlos", "Ana", "Luis", "Sofía", "Jose", "Valeria", "Miguel", "Lucia"};
            String[] apellidos = {"Perez", "Gómez", "Rodriguez", "López", "Garcia", "Martinez", "Hernandez", "Torres", "Ramirez", "Flores"};
            String nombre = nombres[random.nextInt(nombres.length)];
            String apellido1 = apellidos[random.nextInt(apellidos.length)];
            String apellido2 = apellidos[random.nextInt(apellidos.length)];
            String nombreCompleto = nombre + " " + apellido1 + " " + apellido2;
            System.out.println("Nombre Completo: " + nombreCompleto);
            //Numero de cedula random
            // Generar una cédula que empieza con "11" y tiene 10 dígitos
            String cedula = "11";
            for (int i = 0; i < 8; i++) {
                int digito = random.nextInt(10);
                cedula += digito;

            }
            System.out.println("Numero de Cedula = " + cedula);
            //Calificaciones
            System.out.print("Deme la calificacion ACD, APE, AA: ");
            acd = an.nextDouble();
            ape = an.nextDouble();
            aa = an.nextDouble();
            promedio = acd + ape + aa;
            if (promedio >= 7) {
                System.out.println("Aprobado");
            } else if (promedio < 7) {
                System.out.println("Debe dar recuperacion");
                System.out.println("Deme su nota de recuperacion: ");
                recu = an.nextDouble();
                recu = recu + aa;
                promedio = promedio + recu / 2;
            }
            if (promedio >= 7) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");

            }
            System.out.println("Usted obtuvo un promedio de:" + promedio + "%");
            contador++;
        }

    }
}

/*
* run:
* Materia:Humanismo
* Nombre Completo: Maria Gómez Ramirez
* Numero de Cedula = 1167707435
* Deme la calificacion ACD, APE, AA: 3 2 1
* Debe dar recuperacion
* Deme su nota de recuperacion: 
* 3
* Aprobado
* Usted obtuvo un promedio de:8.0%
* Materia:Fundamentos Computacionales
* Nombre Completo: Valeria Hernandez Flores
* Numero de Cedula = 1147761667
* Deme la calificacion ACD, APE, AA: 3 3 3
* Aprobado
* Aprobado
* Usted obtuvo un promedio de:9.0%
 */
