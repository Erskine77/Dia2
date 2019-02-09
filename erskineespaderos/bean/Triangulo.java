package org.erskineespaderos.bean;
public class Triangulo extends FiguraGeometrica{
    @Override
    public double calcularArea(){
        return (getAncho() * getAlto()) /2;
    }
}
