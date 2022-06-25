package paquete05;

import java.util.ArrayList;
import java.util.Scanner;
import paquete04.Estudiante;
import paquete04.EstudianteDistancia;
import paquete04.EstudiantePresencial;

public class EjecutaEstudiante {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;

        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        do {

            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial\n"
                    + "Ingrese (2) para Estudiante Distancia");

            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();

            if (tipoEstudiante == 1) {

                EstudiantePresencial estudianteP = new EstudiantePresencial();

                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();

                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);

                estudiantes.add(estudianteP);
            } else {

                EstudianteDistancia estudianteD = new EstudianteDistancia();

                // Solicitar ingreso de valores para variables 
                System.out.println("Ingrese el número de asignaturas");
                numeroAsigs = entrada.nextInt();
                System.out.println("Ingrese el costo de cada cada asignatura");
                costoAsig = entrada.nextDouble();

                estudianteD.establecerNombresEstudiante(nombresEst);
                estudianteD.establecerApellidoEstudiante(apellidosEst);
                estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                estudianteD.establecerEdadEstudiante(edadEst);
                estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                estudianteD.establecerCostoAsignatura(costoAsig);

                // Se agrega al arreglo estudiantes un objeto de tipo
                // EstudianteDistancia
                estudiantes.add(estudianteD);

            }

            System.out.println("Desea ingresar más estudiante. Digite la "
                    + "letra S para continuar o digite la letra N para salir "
                    + "del proceso");

            continuar = entrada.nextLine();

        } while (continuar.equals("S"));

        for (int i = 0; i < estudiantes.size(); i++) {

            estudiantes.get(i).calcularMatricula();

            System.out.printf("\nDatos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));

        }
    }

}
