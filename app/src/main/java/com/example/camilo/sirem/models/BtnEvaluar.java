package com.example.camilo.sirem.models;

/**
 * Created by camilo on 04/10/2017.
 */

public class BtnEvaluar implements Item{
    private String txtBtnEvaluar;

    public BtnEvaluar(String txtBtnEvaluar) {
        this.txtBtnEvaluar = txtBtnEvaluar;
    }


    public String getTxtBtnEvaluar() {
        return txtBtnEvaluar;
    }

    public void setTxtBtnEvaluar(String txtBtnEvaluar) {
        this.txtBtnEvaluar = txtBtnEvaluar;
    }

    @Override
    public int getTipo() {
        return TIPO_DOS;
    }
}
