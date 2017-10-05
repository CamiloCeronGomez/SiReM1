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
        data.add(new BtnEvaluar(""));

        adapter.notifyDataSetChanged();
    }





        }



