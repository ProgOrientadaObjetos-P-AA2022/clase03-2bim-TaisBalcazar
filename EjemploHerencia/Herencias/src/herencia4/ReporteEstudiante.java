/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {

    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String codigo, ArrayList<Estudiante> listado) {
        super(codigo);
        lista = listado;

    }

    public void establecerLista(ArrayList<Estudiante> listado) {
        lista = listado;
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    public void calcularPromedioMatriculas() {

        for (int i = 0; i < lista.size(); i++) {
            promedioMatriculas += lista.get(i).getMatricula();
        }
        promedioMatriculas = promedioMatriculas / lista.size();
    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n", codigo);

        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\n%s\n", cadena, lista.get(i));
        }
        cadena = String.format("%s\nPromedio Matriculas: %.2f\n",
                cadena, obtenerPromedioMatriculas());
        return cadena;
    }
}
