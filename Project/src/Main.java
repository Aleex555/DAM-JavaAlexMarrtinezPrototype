import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Electrodomestic> llista = new ArrayList<>();
        List<Electrodomestic> llistaCopy = new ArrayList<>();

        Forn forn1 = new Forn();
        forn1.nom = "fornnn";
        forn1.autoneteja = "mala";
        forn1.temperatura = 24;
        forn1.color = "negro";
        forn1.eficiencia = "no";
        forn1.marca = "hola";
        forn1.preu = 12;
        Forn forn2 = new Forn();
        forn2.nom = "fornn2";
        forn2.autoneteja = "mala1";
        forn2.temperatura = 25;
        forn2.color = "azul";
        forn2.eficiencia = "si";
        forn2.marca = "holaaa";
        forn2.preu = 1;
        
        llista.add(forn1);
        llista.add(forn2);

        /*Forn anotherForn = (Forn) forn1.clone();
        llistaCopy.add(anotherForn);
        Forn anotherForn1 = (Forn) forn2.clone();
        llistaCopy.add(anotherForn1);*/

        Nevera nevera1 = new Nevera();
        nevera1.nom = "MAionesa";
        nevera1.frigories = 12;
        nevera1.soroll = 130;
        nevera1.color = "verde";
        nevera1.eficiencia = "no";
        nevera1.marca = "avecrem";
        nevera1.preu = 12;
        llista.add(nevera1);
        Nevera nevera2 = new Nevera();
        nevera2.nom = "Ketchup";
        nevera2.frigories = 32;
        nevera2.soroll = 124;
        nevera2.color = "negro";
        nevera2.eficiencia = "no";
        nevera2.marca = "top";
        nevera2.preu = 15;
        llista.add(nevera2);

        /*Nevera anotherNevera = (Nevera) nevera1.clone();
        llistaCopy.add(anotherNevera);
        Nevera anotherNevera1 = (Nevera) nevera2.clone();
        llistaCopy.add(anotherNevera1);*/
        

        Rentadora rentadora1 = new Rentadora();
        rentadora1.nom = "futbol";
        rentadora1.revolucions = 4000;
        rentadora1.soroll = 13;
        rentadora1.color = "amarillo";
        rentadora1.eficiencia = "si";
        rentadora1.marca = "top1";
        rentadora1.preu = 16;
        llista.add(rentadora1);
        Rentadora rentadora2 = new Rentadora();
        rentadora2.nom = "basquet";
        rentadora2.revolucions = 3444;
        rentadora2.soroll = 12;
        rentadora2.color = "lila";
        rentadora2.eficiencia = "no";
        rentadora2.marca = "temporada";
        rentadora2.preu = 18;
        llista.add(rentadora2);

        /*Rentadora anotherRentadora = (Rentadora) rentadora1.clone();
        llistaCopy.add(anotherRentadora);
        Rentadora anotherRentadora1 = (Rentadora) rentadora2.clone();
        llistaCopy.add(anotherRentadora1);*/

        for (Electrodomestic obj : llista) {
            llistaCopy.add(obj.clone());
        }
        System.out.println("Comparar la mateixa llista:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llista.get(i));
        }

        System.out.println("Comparar amb la llista clonada:");
        for (int i = 0; i < llista.size(); i++) {
            compare(i, llista.get(i), llistaCopy.get(i));
        }

    }

    static void compare (int i, Electrodomestic a, Electrodomestic b) {
        if (a == b) {
            System.out.println(i + ": Els Electrodomestics són el mateix objecte");
        } else {
            System.out.print(i + ": Els Electrodomestics són objectes diferents - ");
            if (a.equals(b)) {
                
                System.out.println(i + ": Els Electrodomestics són idèntics");
            } else {
                System.out.println(i + ": Els Electrodomestics NO són identics");
            }
        }
    }
}
