package org.erskineespaderos.bean;
public class Cuadrado extends FiguraGeometrica{
    @Override
    public double calcularArea(){
        return getAncho() * getAlto();
    }    
}
