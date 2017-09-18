package com.example.camilo.sirem.fragments;


import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.camilo.sirem.R;
import com.example.camilo.sirem.VerVideoEjercicioActivity;
import com.example.camilo.sirem.adapters.EjercicioAdapter;
import com.example.camilo.sirem.databinding.FragmentMainBinding;
import com.example.camilo.sirem.util.Data;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements EjercicioAdapter.OnEjercicioListener {

    public static MainFragment instance(){
        return new MainFragment();
    }


    FragmentMainBinding binding;
    EjercicioAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        adapter = new EjercicioAdapter(getLayoutInflater(null), Data.getEjercicios(), this);
        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onEjercicioClick(int position) {

                Intent intent = new Intent(getActivity(), VerVideoEjercicioActivity.class);
                startActivity(intent);


        }


}
