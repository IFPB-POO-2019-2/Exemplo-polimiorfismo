package com.ifpb.formasgeometricas.modelo;

public class Retangulo extends FormaGeometrica {

    private double ladoa;
    private double ladob;

    public Retangulo(double ladoa, double ladob) {
        this.ladoa = ladoa;
        this.ladob = ladob;
    }

    @Override
    public double calcularArea(){
        return ladoa*ladob;
    }

    @Override
    public double calcularPerimetro(){
        return (2*ladoa) + (2*ladob);
    }

    public double getLadoa() {
        return ladoa;
    }

    public void setLadoa(double ladoa) {
        this.ladoa = ladoa;
    }

    public double getLadob() {
        return ladob;
    }

    public void setLadob(double ladob) {
        this.ladob = ladob;
    }
}
