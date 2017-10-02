package com.example.camilo.sirem.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.camilo.sirem.R;
import com.example.camilo.sirem.databinding.TemplateEvaluarBinding;
import com.example.camilo.sirem.models.Evaluar;

import java.util.List;

/**
 * Created by camilo on 02/10/2017.
 */

public class EvaluarAdapter extends RecyclerView.Adapter<EvaluarAdapter.EvaluarHolder> {

    public  interface OnEvaluarListener{
        void onEvaluarClick (int position);
    }
    LayoutInflater inflater;
    List<Evaluar> data;
    OnEvaluarListener listener;


    public EvaluarAdapter(LayoutInflater inflater, List<Evaluar> data, OnEvaluarListener listener) {
        this.inflater = inflater;
        this.data = data;
        this.listener = listener;
    }


    @Override
    public EvaluarHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.template_evaluar, parent, false);

        return new EvaluarHolder(v) ;
    }

    @Override
    public void onBindViewHolder(EvaluarHolder holder, int position) {
        holder.binding.setEvaluation(data.get(position));
        holder.binding.btnVerVideoEv.setTag(position);
        holder.binding.setHandler(this);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void onItemClick(int position){
        listener.onEvaluarClick(position);

    }

    //region ViewHolders

    static class EvaluarHolder  extends RecyclerView.ViewHolder{

        TemplateEvaluarBinding binding;
        public EvaluarHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
    //endregion

}
