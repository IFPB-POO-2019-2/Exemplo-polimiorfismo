package com.ifpb.formasgeometricas.modelo;

public class Quadrado extends FormaGeometrica{

    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return Math.pow(lado,2);
    }

    @Override
    public double calcularPerimetro(){
        return 4*lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
