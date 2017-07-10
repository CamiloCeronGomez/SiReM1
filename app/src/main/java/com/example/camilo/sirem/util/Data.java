package com.example.camilo.sirem.util;

import com.example.camilo.sirem.models.Ejercicio;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by camilo on 07/07/2017.
 */

public class Data {
    private static List<Ejercicio> ejercicios;
    private static List<Ejercicio> getEjercicios(){
        if (ejercicios == null){
            ejercicios = new ArrayList<>();

            Ejercicio e1 = new Ejercicio();
            e1.setNombre("Coger Bola");
            e1.setDescripcion("Coger la bola con la mano y girarla");
            e1.setImagen("sm.ign.com/ign_latam/screenshot/default/spidermanhomecomingposter_u8zq.jpg");
            e1.setSerie("Series");
            e1.setDescriocionS("4 Series de 10 Repeticiones");
        }
        return ejercicios;
    }
}
