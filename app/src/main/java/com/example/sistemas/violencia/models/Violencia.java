package com.example.sistemas.violencia.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sistemas on 2/06/17.
 */

public class Violencia {
    @SerializedName("grupo_de_edad")
    @Expose
    private String grupoDeEdad;
    @SerializedName("hombre")
    @Expose
    private String hombre;
    @SerializedName("homre")
    @Expose
    private String homre;
    @SerializedName("mujer_1")
    @Expose
    private String mujer1;
    @SerializedName("mujer_2")
    @Expose
    private String mujer2;
    @SerializedName("tasa_hombre")
    @Expose
    private String tasaHombre;
    @SerializedName("tasa_mujer")
    @Expose
    private String tasaMujer;
    @SerializedName("tasa_total")
    @Expose
    private String tasaTotal;
    @SerializedName("total_1")
    @Expose
    private String total1;
    @SerializedName("total_2")
    @Expose
    private String total2;

    public String getGrupoDeEdad() {
        return grupoDeEdad;
    }

    public void setGrupoDeEdad(String grupoDeEdad) {
        this.grupoDeEdad = grupoDeEdad;
    }

    public String getHombre() {
        return hombre;
    }

    public void setHombre(String hombre) {
        this.hombre = hombre;
    }

    public String getHomre() {
        return homre;
    }

    public void setHomre(String homre) {
        this.homre = homre;
    }

    public String getMujer1() {
        return mujer1;
    }

    public void setMujer1(String mujer1) {
        this.mujer1 = mujer1;
    }

    public String getMujer2() {
        return mujer2;
    }

    public void setMujer2(String mujer2) {
        this.mujer2 = mujer2;
    }

    public String getTasaHombre() {
        return tasaHombre;
    }

    public void setTasaHombre(String tasaHombre) {
        this.tasaHombre = tasaHombre;
    }

    public String getTasaMujer() {
        return tasaMujer;
    }

    public void setTasaMujer(String tasaMujer) {
        this.tasaMujer = tasaMujer;
    }

    public String getTasaTotal() {
        return tasaTotal;
    }

    public void setTasaTotal(String tasaTotal) {
        this.tasaTotal = tasaTotal;
    }

    public String getTotal1() {
        return total1;
    }

    public void setTotal1(String total1) {
        this.total1 = total1;
    }

    public String getTotal2() {
        return total2;
    }

    public void setTotal2(String total2) {
        this.total2 = total2;
    }
}
