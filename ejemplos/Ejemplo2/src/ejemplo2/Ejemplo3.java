
/*
 * Realizar un programa en java que permita determinar
 * si un estudiante ha pasado el ciclo
 * se ingresa el promedio del estudiante
 * - Un estudiante pasa el ciclo si tiene un promedio
 * mayor o igual a 7.5. Si el estudiante aprueba el ciclo, presentar
 * un mensaje como sigue, Estudiante aprobado con un promedio: 8.1 
 * CASO CONTRARIO presentar un mensaje con el siguiente texto, 
 * Estudiante reprobado con un promedio: 7.4 
 */
package ejemplo2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Condicionales compuestos
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2
        
        /* Asi se DECLARA variables */
        double nota1;  
        double nota2;
        double promedio;
        // double suma;
        
        System.out.println("Ingrese el nota1 por favor");
        nota1 = entrada.nextDouble(); // para ingresar valores nuemericos

        System.out.println("Ingrese el nota2 por favor");
        nota2 = entrada.nextDouble();
        // suma = suma /2;
               // con esto tambien puedo hacer con esto, es mucho mas 
               // descriptivo, pero tambien es otro metodo para encontrar la 
               // misma respueta         
        
        promedio = (nota1 + nota2) / 2; 
        
        // para veridicar si aprobo o no, condicional basicamente
        if (promedio >= 7.5) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        }else{
            System.out.printf("Estudiante reprobado con un "
                    + "promedio: %.2f\n", promedio);
        }
    }
    
}
