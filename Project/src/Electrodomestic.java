import java.util.Objects;

public abstract class Electrodomestic{
    public String nom;
    public String color;
    int preu;
    String marca;
    String eficiencia;

    public Electrodomestic() {}

    public Electrodomestic(Electrodomestic target) {
        if (target != null) {
            this.nom = target.nom;
            this.color = target.color;
            this.preu = target.preu;
            this.marca = target.marca;
            this.eficiencia = target.eficiencia;
        }
    }

    public abstract Electrodomestic clone();

    /*@Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Electrodomestic)) return false;
        Electrodomestic cast2 = (Electrodomestic) object2;
        return cast2.nom.equals(nom) && cast2.preu == preu && cast2.color.equals(color) && cast2.equals(marca) && cast2.equals(eficiencia);
    }*/

    @Override
    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Electrodomestic other = (Electrodomestic) obj;
    return Objects.equals(nom, other.nom)
            && Objects.equals(color, other.color)
            && Objects.equals(eficiencia, other.eficiencia)
            && Objects.equals(marca, other.marca)
            && Integer.compare(preu, other.preu) == 0;
}

}