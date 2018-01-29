package com.example.camilo.sirem.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.camilo.sirem.R;
import com.example.camilo.sirem.adapters.ProgresoAdapter;
import com.example.camilo.sirem.databinding.FragmentProgresoBinding;
import com.example.camilo.sirem.util.DataProgreso;

public class ProgresoFragment extends Fragment implements ProgresoAdapter.OnProgresoListener {

    public static ProgresoFragment instance(){
        return new ProgresoFragment();
    }

    FragmentProgresoBinding binding;
    ProgresoAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_progreso, container, false);
        adapter = new ProgresoAdapter(getLayoutInflater(null), DataProgreso.getProgresos(), this);
        binding.recyclerProgreso.setAdapter(adapter);
        binding.recyclerProgreso.setLayoutManager(new LinearLayoutManager(getContext()));
        // Inflate the layout for this fragment
        return binding.getRoot();
    }


    @Override
    public void onProgresoClick(int position) {

    }
}

