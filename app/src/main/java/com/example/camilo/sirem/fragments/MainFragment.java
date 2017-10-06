package com.example.camilo.sirem.fragments;


import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.camilo.sirem.MainEvaluarActivity;
import com.example.camilo.sirem.R;
import com.example.camilo.sirem.VerVideoEjercicioActivity;
import com.example.camilo.sirem.adapters.EjercicioAdapter;
import com.example.camilo.sirem.databinding.FragmentMainBinding;
import com.example.camilo.sirem.models.BtnEvaluar;
import com.example.camilo.sirem.models.Ejercicio;
import com.example.camilo.sirem.models.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements EjercicioAdapter.OnEjercicioListener {

    public static MainFragment instance(){
        return new MainFragment();
    }


    FragmentMainBinding binding;
    EjercicioAdapter adapter;
   public static List<Item> data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        data= new ArrayList<>();
        adapter = new EjercicioAdapter(inflater,data, this);
        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        // Inflate the layout for this fragment
        loadData();
        return binding.getRoot();
    }

    @Override
    public void onEjercicioClick(int position) {

        Intent intent = new Intent(getActivity(), VerVideoEjercicioActivity.class);
        intent.putExtra("pos",position);
        startActivity(intent);
         }

    @Override
    public void onBtnEvaluarClick(int position) {
        Intent intent = new Intent(getActivity(), MainEvaluarActivity.class);
        intent.putExtra("pos",position);
        startActivity(intent);

    }


    public void loadData(){

        data.add(new Ejercicio("https://ibb.co/d4n8GG","Hacer Puño", "Extienda los dedos antes de hacer puño","Series", "4 Series de 10 Repeticiones", "android.resource://com.example.camilo.sirem/"+ R.raw.vs1_e1));
        data.add(new Ejercicio("https://ibb.co/fu8R3w", "Recolectar Manzanas","Abra su mano por ensima de su cabeza y cierre jalando su brazo hacia abajo", "Series", "3 Series de 15 Repeticiones", "android.resource://com.example.camilo.sirem/"+ R.raw.vs1_e2));
        data.add(new Ejercicio( "https://ibb.co/mE0Zqb", "Ondulacion", "La mano se apoya en su borde cubital, se estabiliza la muñeca y se realiza un movimiento lento de extension y flexion", "Series",  "2 Series de 20 Repeticiones", "android.resource://com.example.camilo.sirem/"+ R.raw.vs2_e2));
        data.add(new Ejercicio("https://ibb.co/kZGJGG", "Limpia Parabrisas", "La palma de la mano plana sobre la mesa, lentamente abducir hacia radial y cubital", "Series" , "2 Series de 20 Repeticiones", "android.resource://com.example.camilo.sirem/"+ R.raw.vs2_e3 ));
        data.add(new Ejercicio("https://ibb.co/cvmPqb", "Facilitacion Neuromuscular Propioceptiva", "Hacer puño mientras se eleva el brazo por arriba de la cabeza, y la nariz toca el codo. Lentamente lleva el brazo hacia abajo, abriendo la mano y extendiendo el codo" , "Series" , "2 Series de 20 Repeticiones", "android.resource://com.example.camilo.sirem/"+ R.raw.vs2_e4 ));
        data.add(new Ejercicio("https://ibb.co/fvCuOw", "Hacer Puño", "Aplastar una bola suabe por algunos segundos", "Series", "3 Series de 10 Repeticiones", "android.resource://com.example.camilo.sirem/"+ R.raw.vs3_e1 ));
        data.add(new Ejercicio("https://ibb.co/cSF3GG", "Mano en el limite de la mesa", "Lentamente mover la mano hacia usted: felixion(1), Pulgar hacia usted(2), extension(3)", "Series", "2 Series de 20 Repeticiones", "android.resource://com.example.camilo.sirem/"+ R.raw.vs3_e2 ));
        data.add(new Ejercicio("https://ibb.co/jQmSbG", "Cepillarse los dientes", "Cepillarlos como de costumbre con la mano afectada", "Series", "2 Series de 2 Minutos", "android.resource://com.example.camilo.sirem/"+ R.raw.vs3_e3));
        data.add(new Ejercicio("https://ibb.co/dnsxAb" , "Presion y contrapresion", "Empujar la mano sana contra la palma de la mano lesionada(1), empujar la mano sana contra la parte superior de la mano lesionada", "Series", "2 Series de 10 Repeticiones", "android.resource://com.example.camilo.sirem/"+ R.raw.vs4_e4 ));
        data.add(new Ejercicio("https://ibb.co/fgv0Vb", "Contrapresion", "Movimiento como el ejercicio anteriror pero sin presion y realizando flxion y extension completa de mano", "Series", "2 Series de 10 Repeticiones", "android.resource://com.example.camilo.sirem/"+ R.raw.vs4_e4));
        data.add(new Ejercicio("https://ibb.co/dh6qVb", "Botella de Agua", "El mismo ejercicio 2 de la semana 3 pero sosteniendo una botela de 500 ml", "Series", "2 Series de 10 Repeticiones", "android.resource://com.example.camilo.sirem/"+ R.raw.vs5_e6));
        data.add(new Ejercicio("https://ibb.co/kMR2bG", "Estiramientos", "Estirar la mano , flexion y extension", "Series", "3 Series de 1 minuto",  "android.resource://com.example.camilo.sirem/"+ R.raw.vs6_e3));
        data.add(new Ejercicio("https://ibb.co/i0ThbG", "Hacer Puño", "Apretar un bola de tenis por algunos segundos", "Series", "3 Series de 10 Repeticiones", "android.resource://com.example.camilo.sirem/"+ R.raw.vs6_e4));
        data.add(new BtnEvaluar(""));

        adapter.notifyDataSetChanged();
    }





        }



