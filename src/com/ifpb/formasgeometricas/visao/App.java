package com.ifpb.formasgeometricas.visao;

import com.ifpb.formasgeometricas.modelo.Circulo;
import com.ifpb.formasgeometricas.modelo.FormaGeometrica;


public class App {

    public static void main(String[] args) {

        FormaGeometrica formaGeometrica = new Circulo(3);

        System.out.println(formaGeometrica.calcularArea());
        System.out.println(formaGeometrica.calcularPerimetro());

    }

}
