package com.example.camilo.sirem.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.camilo.sirem.R;
import com.example.camilo.sirem.databinding.TemplateBtnevaluarBinding;

import com.example.camilo.sirem.databinding.TemplateEjerciciosBinding;
import com.example.camilo.sirem.models.BtnEvaluar;
import com.example.camilo.sirem.models.Ejercicio;
import com.example.camilo.sirem.models.Item;

import java.util.List;

/**
 * Created by camilo on 07/07/2017.
 */

public class EjercicioAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    LayoutInflater inflater;
    List<Item> data;
    OnEjercicioListener listener;


    public  interface OnEjercicioListener{
        void onEjercicioClick (int position);
        void onBtnEvaluarClick( int position );
    }




    public EjercicioAdapter(LayoutInflater inflater, List<Item> data, OnEjercicioListener listener) {
        this.inflater = inflater;
        this.data = data;
        this.listener = listener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder;
        if(viewType == Item.TIPO_UNO){
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_ejercicios, parent, false);
            holder = new EjercicioHolder(v);
        }else{
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_btnevaluar, parent, false);
            holder = new BtnEvaluarHolder(v);
        }


        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
       if (holder instanceof  EjercicioHolder){
           ((EjercicioHolder) holder).binding.setExercise((Ejercicio) data.get(position));
           ((EjercicioHolder) holder).binding.btnVerVideo.setTag(position);
           ((EjercicioHolder) holder).binding.setHandler(this);
       }else {
           ((BtnEvaluarHolder) holder).binding.setButtonEvaluar((BtnEvaluar) data.get(position));
           ((BtnEvaluarHolder) holder).binding.btnEvaluacion.setTag(position);
           ((BtnEvaluarHolder) holder).binding.setHandler(this);
       }

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void onItemClick(int position){
        listener.onEjercicioClick(position);

    }
    public void goToEvaluacion( int position){
        listener.onBtnEvaluarClick(position);

    }

    @Override
    public int getItemViewType(int position) {
        return data.get(position).getTipo();
    }

    //region ViewHolders

    static class EjercicioHolder  extends RecyclerView.ViewHolder{

        TemplateEjerciciosBinding binding;
        public EjercicioHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
    class BtnEvaluarHolder extends RecyclerView.ViewHolder{

        TemplateBtnevaluarBinding binding;

        public BtnEvaluarHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
    //endregion

}
