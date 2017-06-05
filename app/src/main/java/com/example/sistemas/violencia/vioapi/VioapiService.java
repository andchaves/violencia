package com.example.sistemas.violencia.vioapi;

import com.example.sistemas.violencia.models.Violencia;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sistemas on 2/06/17.
 */

public interface VioapiService {
    @GET("gsc9-7iuj.json")
    Call<ArrayList<Violencia>> obtenerListaViolencia();

    @GET("gsc9-7iuj.json")
    Call<ArrayList<Violencia>> obtenerListaViolencia2();

    @GET("gsc9-7iuj.json")
    Call<ArrayList<Violencia>> obtenerListaViolencia3();

    @GET("gsc9-7iuj.json")
    Call<ArrayList<Violencia>> obtenerListaViolencia4();

    @GET("gsc9-7iuj.json")
    Call<ArrayList<Violencia>> obtenerListaViolencia5();

    @GET("gsc9-7iuj.json")
    Call<ArrayList<Violencia>> obtenerListaViolencia6();

    @GET("gsc9-7iuj.json")
    Call<ArrayList<Violencia>> obtenerListaViolencia7();
    @GET("gsc9-7iuj.json")
    Call<ArrayList<Violencia>> obtenerListaViolencia8();
    @GET("gsc9-7iuj.json")
    Call<ArrayList<Violencia>> obtenerListaViolencia9();
    @GET("gsc9-7iuj.json")
    Call<ArrayList<Violencia>> obtenerListaViolencia10();

}
