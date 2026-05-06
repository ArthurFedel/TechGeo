package TechGeo.Forma;

import TechGeo.Ponto.Ponto;

public class Cilindro extends Forma implements Volume {
    private double raio;
    private double altura;
    private Ponto ponto;

    public Cilindro(double raio, double altura, Ponto ponto) {
        this.raio = raio;
        this.altura = altura;
        this.ponto = ponto;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    public double calcularArea() {
        double area = 0;
        area = 2 * Math.PI * raio * (raio + altura);
        return area;
    }

    public double calcularVolume() {
        double volume = 0;
        volume = Math.PI * Math.pow(raio, 2) * altura;
        return volume;
    }

    @Override
    public String toString() {
        String aux = "";
        aux += "Raio: " + raio + "\n";
        aux += "Altura: " + altura + "\n";
        aux += ponto.toString();
        return aux;
    }
}
