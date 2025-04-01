package Ejercicios;
import java.util.*;

public class EJ_4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] equipos = new String[20];
        int[] puntuaciones = new int[20];
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Introduce el nombre del equipo " + (i + 1) + ": ");
            equipos[i] = sc.nextLine();
            puntuaciones[i] = 35 + (int) (Math.random() * 66);
        }
        
        int maxPunt = puntuaciones[0], minPunt = puntuaciones[0];
        String equipoGanador = equipos[0], equipoUltimo = equipos[0];
        int sumaPuntos = puntuaciones[0];
        
        for (int i = 1; i < 20; i++) {
            sumaPuntos += puntuaciones[i];
            if (puntuaciones[i] > maxPunt) {
                maxPunt = puntuaciones[i];
                equipoGanador = equipos[i];
            }
            if (puntuaciones[i] < minPunt) {
                minPunt = puntuaciones[i];
                equipoUltimo = equipos[i];
            }
        }
        
        System.out.println("Equipo ganador: " + equipoGanador + " con " + maxPunt + " puntos");
        System.out.println("Último clasificado: " + equipoUltimo + " con " + minPunt + " puntos");
        System.out.println("Puntuación media: " + (sumaPuntos / 20.0));
        
        sc.close();
    }
}