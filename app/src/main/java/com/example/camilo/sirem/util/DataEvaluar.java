package com.example.camilo.sirem.util;

import com.example.camilo.sirem.models.Evaluar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by camilo on 02/10/2017.
 */

public class DataEvaluar {
    private static List<Evaluar> evaluaciones;
    public static List<Evaluar> getEvaluaciones(){
        if (evaluaciones == null){
            evaluaciones = new ArrayList<>();

            Evaluar ev1 = new Evaluar();
            ev1.setNombreEv("Flexion");
            ev1.setDescripcionEv("Se dispone la mano de forma horizontal y se baja la mano");

            evaluaciones.add(ev1);

            Evaluar ev2 = new Evaluar();
            ev2.setNombreEv("Extencion");
            ev2.setDescripcionEv("Se dispone la mano de forma horizontal y se sube la mano");

            evaluaciones.add(ev2);

            Evaluar ev3 = new Evaluar();
            ev3.setNombreEv("Desviacion Radial");
            ev3.setDescripcionEv("Se dispone la mano de forma horizontal y se gira a la izquierda");

            evaluaciones.add(ev3);

            Evaluar ev4 = new Evaluar();
            ev4.setNombreEv("Desviacion Ulnar");
            ev4.setDescripcionEv("Se dispone la mano de forma horizontal y gira a la derecha");

            evaluaciones.add(ev4);

        }
        return evaluaciones;
    }

}
