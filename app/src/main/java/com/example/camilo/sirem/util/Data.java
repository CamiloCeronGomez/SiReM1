package com.example.camilo.sirem.util;

import com.example.camilo.sirem.R;
import com.example.camilo.sirem.models.Ejercicio;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by camilo on 07/07/2017.
 */

public class Data {
    private static List<Ejercicio> ejercicios;
    public static List<Ejercicio> getEjercicios(){
        if (ejercicios == null){
            ejercicios = new ArrayList<>();

            Ejercicio e1 = new Ejercicio();
            e1.setNombre("Coger Bola");
            e1.setDescripcion("Coger la bola con la mano y girarla");
            e1.setImagen("https://thumbs.dreamstime.com/z/bola-baja-en-la-mano-4636618.jpg");
            e1.setSerie("Series");
            e1.setDescriocionS("4 Series de 10 Repeticiones");
            e1.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.pasos);

            Ejercicio e2 = new Ejercicio();
            e2.setNombre("Coger Bola");
            e2.setDescripcion("Coger la bola con la mano y girarla");
            e2.setImagen("https://thumbs.dreamstime.com/z/bola-baja-en-la-mano-4636618.jpg");
            e2.setSerie("Series");
            e2.setDescriocionS("4 Series de 10 Repeticiones");
            e2.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.pasos);

            Ejercicio e3 = new Ejercicio();
            e3.setNombre("Coger Bola");
            e3.setDescripcion("Coger la bola con la mano y girarla");
            e3.setImagen("https://thumbs.dreamstime.com/z/bola-baja-en-la-mano-4636618.jpg");
            e3.setSerie("Series");
            e3.setDescriocionS("4 Series de 10 Repeticiones");
            e3.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.pasos);

            Ejercicio e4 = new Ejercicio();
            e4.setNombre("Coger Bola");
            e4.setDescripcion("Coger la bola con la mano y girarla");
            e4.setImagen("https://thumbs.dreamstime.com/z/bola-baja-en-la-mano-4636618.jpg");
            e4.setSerie("Series");
            e4.setDescriocionS("4 Series de 10 Repeticiones");
            e4.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.pasos);

            Ejercicio e5 = new Ejercicio();
            e5.setNombre("Coger Bola");
            e5.setDescripcion("Coger la bola con la mano y girarla");
            e5.setImagen("https://thumbs.dreamstime.com/z/bola-baja-en-la-mano-4636618.jpg");
            e5.setSerie("Series");
            e5.setDescriocionS("4 Series de 10 Repeticiones");
            e5.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.pasos);

            ejercicios.add(e1);
            ejercicios.add(e2);
            ejercicios.add(e3);
            ejercicios.add(e4);
            ejercicios.add(e5);

        }
        return ejercicios;
    }
}
