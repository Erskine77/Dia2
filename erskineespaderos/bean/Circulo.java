package org.erskineespaderos.bean;
public class Circulo extends FiguraGeometrica{
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
}
