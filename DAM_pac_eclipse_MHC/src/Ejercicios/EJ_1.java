package Ejercicios;
import java.util.*;

public class EJ_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Salario del Jefe: ");
        double salarioJefe = sc.nextDouble();
        System.out.print("Salario del Encargado: ");
        double salarioEncargado = sc.nextDouble();
        System.out.print("Salario de los Oficinistas: ");
        double salarioOficinistas = sc.nextDouble();
        System.out.print("Número de Oficinistas: ");
        int numeroOficinistas = sc.nextInt();
        System.out.print("Proyectos Terminados (true/false): ");
        boolean proyectosTerminados = sc.nextBoolean();
        System.out.print("Presupuesto de la Empresa: ");
        double presupuestoEmpresa = sc.nextDouble();
        
        auditoriaEmpresa(salarioJefe, salarioEncargado, salarioOficinistas, numeroOficinistas, proyectosTerminados, presupuestoEmpresa);
        sc.close();
    }
    
    public static boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado, double salarioOficinistas, int numeroOficinistas, boolean proyectosTerminados, double presupuestoEmpresa) {
        if (!proyectosTerminados) {
            System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados");
            return false;
        }
        
        double gastoTotal = salarioJefe + salarioEncargado + (salarioOficinistas * numeroOficinistas);
        if (gastoTotal > 20000) {
            System.out.println("No ha pasado la auditoría ya que el gasto en personal es de " + gastoTotal + " y excede el límite mensual de 20.000 euros");
            return false;
        }
        
        if (presupuestoEmpresa > 100000) {
            System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de " + presupuestoEmpresa + " excede el límite establecido en 100.000 euros");
            return false;
        }
        
        System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
        return true;
    }
}

