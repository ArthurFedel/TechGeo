package TechGeo.Main;

import TechGeo.Cilindro.Cilindro;
import TechGeo.Circulo.Circulo;
import TechGeo.Ponto.Ponto;

public class Main {
    public static void main(String[] args) {

        Ponto ponto;

        // Cilindro
        ponto = new Ponto(2, -3);
        Cilindro cilindro = new Cilindro(8, 2, ponto);
        System.out.println("======= CILINDRO =======");
        System.out.println("Área = " + String.format("%.2f", cilindro.calcularArea()));
        System.out.println("Volume = " + String.format("%.2f", cilindro.calcularVolume()));

        // Cilindro
        ponto = new Ponto(-4, 7);
        Circulo circulo = new Circulo(10, ponto);
        System.out.println("======= CIRCULO =======");
        System.out.println("Área = " + String.format("%.2f", circulo.calcularArea()));
    }
}
