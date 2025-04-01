package Ejercicios;
import java.util.*;

public class EJ_3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();
        
        double imc = peso / (altura * altura);
        
        double sumaVelocidad = 0, sumaDistancia = 0, sumaCalorias = 0;
        double maxDistancia = 0, maxCalorias = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Velocidad sesi�n " + i + ": ");
            double velocidad = sc.nextDouble();
            System.out.print("Distancia sesi�n " + i + ": ");
            double distancia = sc.nextDouble();
            System.out.print("Calor�as quemadas sesi�n " + i + ": ");
            double calorias = sc.nextDouble();
            
            sumaVelocidad += velocidad;
            sumaDistancia += distancia;
            sumaCalorias += calorias;
            
            if (distancia > maxDistancia) maxDistancia = distancia;
            if (calorias > maxCalorias) maxCalorias = calorias;
        }
        
        System.out.println("IMC: " + imc);
        System.out.println("Media velocidad: " + sumaVelocidad / 10);
        System.out.println("Media distancia: " + sumaDistancia / 10);
        System.out.println("Media calor�as: " + sumaCalorias / 10);
        System.out.println("M�xima distancia: " + maxDistancia);
        System.out.println("M�ximas calor�as: " + maxCalorias);
        
        sc.close();
    }
}

