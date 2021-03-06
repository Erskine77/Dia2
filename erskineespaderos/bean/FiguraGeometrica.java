package org.erskineespaderos.bean;
public abstract class FiguraGeometrica {
    private int ancho;
    private int alto;

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public abstract double calcularArea();
    
}
