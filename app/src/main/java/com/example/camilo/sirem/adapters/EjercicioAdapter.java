package com.example.camilo.sirem.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.camilo.sirem.R;
import com.example.camilo.sirem.databinding.TemplateEjerciciosBinding;
import com.example.camilo.sirem.models.Ejercicio;

import java.util.List;

/**
 * Created by camilo on 07/07/2017.
 */

public class EjercicioAdapter extends RecyclerView.Adapter<EjercicioAdapter.EjercicioHolder>{

    LayoutInflater inflater;
    List<Ejercicio> data;

    public EjercicioAdapter(LayoutInflater inflater, List<Ejercicio> data) {
        this.inflater = inflater;
        this.data = data;
    }

    @Override
    public EjercicioHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.template_ejercicios, parent, false);

        return new EjercicioHolder(v) ;
    }

    @Override
    public void onBindViewHolder(EjercicioHolder holder, int position) {
        holder.binding.setExercise(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    //region ViewHolders

    static class EjercicioHolder  extends RecyclerView.ViewHolder{

        TemplateEjerciciosBinding binding;
        public EjercicioHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
    //endregion

}