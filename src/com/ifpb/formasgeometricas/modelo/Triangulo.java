package com.ifpb.formasgeometricas.modelo;

public class Triangulo implements FormaGeometrica {

    private double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (Math.pow(lado,2)*Math.sqrt(3))/4;
    }

    @Override
    public double calcularPerimetro() {
        return 3*lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
