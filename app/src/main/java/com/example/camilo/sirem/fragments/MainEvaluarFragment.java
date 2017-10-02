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
import com.example.camilo.sirem.VerVideoEvaluarActivity;
import com.example.camilo.sirem.adapters.EvaluarAdapter;
import com.example.camilo.sirem.databinding.FragmentMainevaluarBinding;
import com.example.camilo.sirem.util.DataEvaluar;


public class MainEvaluarFragment extends Fragment implements EvaluarAdapter.OnEvaluarListener {

    public static MainEvaluarFragment instance(){
        return new MainEvaluarFragment();
    }

    FragmentMainevaluarBinding binding;
    EvaluarAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_mainevaluar, container, false);
        adapter = new EvaluarAdapter(getLayoutInflater(null), DataEvaluar.getEvaluaciones(), this);
        binding.recyclerEv.setAdapter(adapter);
        binding.recyclerEv.setLayoutManager(new LinearLayoutManager(getContext()));
        // Inflate the layout for this fragment
        return binding.getRoot();
    }
    @Override
    public void onEvaluarClick(int position) {

        Intent intent = new Intent(getActivity(), VerVideoEvaluarActivity.class);
        intent.putExtra("pos",position);
        startActivity(intent);
    }

}
