package com.example.camilo.sirem.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.camilo.sirem.R;
import com.example.camilo.sirem.databinding.TemplateProgresoBinding;
import com.example.camilo.sirem.models.Progreso;

import java.util.List;

/**
 * Created by camilo on 02/10/2017.
 */

public class ProgresoAdapter extends RecyclerView.Adapter<ProgresoAdapter.ProgresoHolder> {

    public  interface OnProgresoListener{
        void onProgresoClick(int position);
    }
    LayoutInflater inflater;
    List<Progreso> data;
    OnProgresoListener listener;


    public ProgresoAdapter(LayoutInflater inflater, List<Progreso> data, OnProgresoListener listener) {
            this.inflater = inflater;
        this.data = data;
        this.listener = listener;
    }


    @Override
    public ProgresoHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.template_progreso, parent, false);

        return new ProgresoHolder(v) ;
    }

    @Override
    public void onBindViewHolder(ProgresoHolder holder, int position) {
        holder.binding.setProgresos(data.get(position));


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void onItemClick(int position){
        listener.onProgresoClick(position);

    }


    //region ViewHolders

    static class ProgresoHolder  extends RecyclerView.ViewHolder{

        TemplateProgresoBinding binding;
        public ProgresoHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
    //endregion

}
