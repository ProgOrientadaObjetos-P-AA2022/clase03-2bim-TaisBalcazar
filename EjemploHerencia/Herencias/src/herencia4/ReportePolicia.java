/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte {

    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String codigo, ArrayList<Policia> listado) {
        super(codigo);
        lista = listado;

    }

    public void establecerLista(ArrayList<Policia> listado) {
        lista = listado;
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    public void calcularPromedioEdades() {

        for (int i = 0; i < lista.size(); i++) {
            promedioEdades += lista.get(i).getEdad();
        }
        promedioEdades = promedioEdades / lista.size();
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n", codigo);

        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\n%s\n", cadena, lista.get(i));
        }
        cadena = String.format("%s\nPromedio Edades: %.2f\n",
                cadena, obtenerPromedioEdades());
        return cadena;

    }
}
