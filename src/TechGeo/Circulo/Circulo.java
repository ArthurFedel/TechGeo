package TechGeo.Circulo;

import TechGeo.Ponto.Ponto;

public class Circulo {
    private double raio;
    private Ponto ponto;

    public Circulo(double raio, Ponto ponto) {
        this.raio = raio;
        this.ponto = ponto;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    public double calcularArea() {
        double area = 0;
        area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    @Override
    public String toString() {
        String aux = "";
        aux += "Raio: " + raio + "\n";
        aux += ponto.toString();
        return aux;
    }
}
