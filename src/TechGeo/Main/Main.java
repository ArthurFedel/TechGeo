package TechGeo.Main;

import TechGeo.Forma.Cilindro;
import TechGeo.Forma.Circulo;
import TechGeo.Forma.Forma;
import TechGeo.Forma.Volume;
import TechGeo.Ponto.Ponto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(new Cilindro(2, 2, new Ponto(2, 2)));
        lista.add(new Circulo(2, new Ponto(0, 0)));
        lista.add(new Cilindro(4, 5, new Ponto(6, 2)));
        lista.add(new Circulo(0.75, new Ponto(1, 0)));

        for (Forma f : lista){
            System.out.println(f);
            System.out.println();
        }

        System.out.println("Área:");
        for (Forma f: lista){
            System.out.println("Área: " + String.format("%.2f", f.calcularArea()) + "m²");
        }

        System.out.println();
        System.out.println("Volume: ");
        for (Forma f : lista){
            if (f instanceof Volume) {
                System.out.println("Volume: " + String.format("%.2f", ((Volume) f).calcularVolume()) + "m³");
            }
        }
    }
}
