/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String codigo, ArrayList<Docente> listado) {
        super(codigo);
        lista = listado;

    }

    public void establecerLista(ArrayList<Docente> listado) {
        lista = listado;
    }

    public ArrayList<Docente> obtenerLista() {
        return lista;
    }

    public void calcularPromedioSueldos() {

        for (int i = 0; i < lista.size(); i++) {
            promedioSueldos += lista.get(i).getSueldo();
        }
        promedioSueldos = promedioSueldos / lista.size();
    }

    public double obtenerPromedioSueldos() {
        return promedioSueldos;
    }
    
        @Override
    public String toString() {
        String cadena = String.format("%s\n", codigo);

        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\n%s\n", cadena, lista.get(i));
        }
        cadena = String.format("%s\nPromedio Sueldos: %.2f\n",
                cadena, obtenerPromedioSueldos());
        return cadena;
    }
}

