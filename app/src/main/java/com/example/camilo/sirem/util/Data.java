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
            e1.setNombre("Hacer Puño");
            e1.setDescripcion("Extienda los dedos antes de hacer puño");
            e1.setImagen("https://ibb.co/d4n8GG");
            e1.setSerie("Series");
            e1.setDescriocionS("4 Series de 10 Repeticiones");
            e1.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.vs1_e1);

            Ejercicio e2 = new Ejercicio();
            e2.setNombre("Recolectar Manzanas");
            e2.setDescripcion("Abra su mano por ensima de su cabeza y cierre jalando su brazo hacia abajo");
            e2.setImagen("https://ibb.co/fu8R3w");
            e2.setSerie("Series");
            e2.setDescriocionS("3 Series de 15 Repeticiones");
            e2.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.vs1_e2);

            Ejercicio e3 = new Ejercicio();
            e3.setNombre("Ondulacion");
            e3.setDescripcion("La mano se apoya en su borde cubital, se estabiliza la muñeca y se realiza un movimiento lento de extension y flexion");
            e3.setImagen("https://ibb.co/mE0Zqb");
            e3.setSerie("Series");
            e3.setDescriocionS("2 Series de 20 Repeticiones");
            e3.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.vs2_e2);

            Ejercicio e4 = new Ejercicio();
            e4.setNombre("Limpia Parabrisas");
            e4.setDescripcion("La palma de la mano plana sobre la mesa, lentamente abducir hacia radial y cubital");
            e4.setImagen("https://ibb.co/kZGJGG");
            e4.setSerie("Series");
            e4.setDescriocionS("2 Series de 20 Repeticiones");
            e4.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.vs2_e3);

            Ejercicio e5 = new Ejercicio();
            e5.setNombre("Facilitacion Neuromuscular Propioceptiva");
            e5.setDescripcion("Hacer puño mientras se eleva el brazo por arriba de la cabeza, y la nariz toca el codo. Lentamente lleva el brazo hacia abajo, abriendo la mano y extendiendo el codo");
            e5.setImagen("https://ibb.co/cvmPqb");
            e5.setSerie("Series");
            e5.setDescriocionS("2 Series de 20 Repeticiones");
            e5.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.vs2_e4);

            Ejercicio e6 = new Ejercicio();
            e6.setNombre("Hacer Puño");
            e6.setDescripcion("Aplastar una bola suabe por algunos segundos");
            e6.setImagen("https://ibb.co/fvCuOw");
            e6.setSerie("Series");
            e6.setDescriocionS("3 Series de 10 Repeticiones");
            e6.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.vs3_e1);

            Ejercicio e7 = new Ejercicio();
            e7.setNombre("Mano en el limite de la mesa");
            e7.setDescripcion("Lentamente mover la mano hacia usted: felixion(1), Pulgar hacia usted(2), extension(3)");
            e7.setImagen("https://ibb.co/cSF3GG");
            e7.setSerie("Series");
            e7.setDescriocionS("2 Series de 20 Repeticiones");
            e7.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.vs3_e2);

            Ejercicio e8 = new Ejercicio();
            e8.setNombre("Cepillarse los dientes");
            e8.setDescripcion("Cepillarlos como de costumbre con la mano afectada");
            e8.setImagen("https://ibb.co/jQmSbG");
            e8.setSerie("Series");
            e8.setDescriocionS("2 Series de 2 Minutos");
            e8.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.vs3_e3);

            Ejercicio e9 = new Ejercicio();
            e9.setNombre("Presion y contrapresion");
            e9.setDescripcion("Empujar la mano sana contra la palma de la mano lesionada(1), empujar la mano sana contra la parte superior de la mano lesionada");
            e9.setImagen("https://ibb.co/dnsxAb");
            e9.setSerie("Series");
            e9.setDescriocionS("2 Series de 10 Repeticiones");
            e9.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.vs4_e4);

            Ejercicio e10 = new Ejercicio();
            e10.setNombre("Contrapresion");
            e10.setDescripcion("Movimiento como el ejercicio anteriror pero sin presion y realizando flxion y extension completa de mano");
            e10.setImagen("https://ibb.co/fgv0Vb");
            e10.setSerie("Series");
            e10.setDescriocionS("2 Series de 10 Repeticiones");
            e10.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.vs4_e4);

            Ejercicio e11 = new Ejercicio();
            e11.setNombre("Botella de Agua");
            e11.setDescripcion("El mismo ejercicio 2 de la semana 3 pero sosteniendo una botela de 500 ml");
            e11.setImagen("https://ibb.co/dh6qVb");
            e11.setSerie("Series");
            e11.setDescriocionS("2 Series de 10 Repeticiones");
            e11.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.vs5_e6);

            Ejercicio e12 = new Ejercicio();
            e12.setNombre("Estiramientos");
            e12.setDescripcion("Estirar la mano , flexion y extension");
            e12.setImagen("https://ibb.co/kMR2bG");
            e12.setSerie("Series");
            e12.setDescriocionS("3 Series de 1 minuto");
            e12.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.vs6_e3);

            Ejercicio e13 = new Ejercicio();
            e13.setNombre("Hacer Puño");
            e13.setDescripcion("Apretar un bola de tenis por algunos segundos");
            e13.setImagen("https://ibb.co/i0ThbG");
            e13.setSerie("Series");
            e13.setDescriocionS("3 Series de 10 Repeticiones");
            e13.setVideo("android.resource://com.example.camilo.sirem/"+ R.raw.vs6_e4);

            ejercicios.add(e1);
            ejercicios.add(e2);
            ejercicios.add(e3);
            ejercicios.add(e4);
            ejercicios.add(e5);
            ejercicios.add(e6);
            ejercicios.add(e7);
            ejercicios.add(e8);
            ejercicios.add(e9);
            ejercicios.add(e10);
            ejercicios.add(e11);
            ejercicios.add(e12);
            ejercicios.add(e13);

        }
        return ejercicios;
    }
}
