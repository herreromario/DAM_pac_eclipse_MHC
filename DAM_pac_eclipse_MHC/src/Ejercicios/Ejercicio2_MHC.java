package Ejercicios;
import java.util.*;

public class Ejercicio2_MHC {

	public static void main(String[] args) {
        procesoSeleccion();
    }
    
    public static boolean procesoSeleccion() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        
        if (edad > 40) {
            System.out.println("Quedas descartado del proceso de selección");
            sc.close();
            return false;
        }
        
        sc.nextLine(); // Limpiar buffer
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce los años trabajados: ");
        int aniosTrabajados = sc.nextInt();
        System.out.print("Introduce tu sueldo bruto anual anterior: ");
        double sueldoBruto = sc.nextDouble();
        
        if (sueldoBruto > 30000) {
            System.out.println("Quedas descartado del proceso de selección");
            sc.close();
            return false;
        }
        
        double sumaNominas = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce el importe de la nómina " + i + ": ");
            sumaNominas += sc.nextDouble();
        }
        
        double media = sumaNominas / 5;
        double incremento = (media > 2500) ? 1.05 : 1.10;
        double nuevoSueldo = media * incremento;
        
        System.out.println("Se te sube el sueldo a " + nuevoSueldo);
        sc.close();
        return true;
    }
}