public class Rentadora extends Electrodomestic {
    int soroll;
    int revolucions;

    public Rentadora (){

    }


    public Rentadora(Rentadora target) {
        super(target);
        if (target!= null){
            this.revolucions = target.revolucions;
            this.soroll = target.soroll;
        }
    }


    @Override
    public Electrodomestic clone() {
        return new Rentadora(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Electrodomestic) || !super.equals(object2)) return false;
        Rentadora cast2 = (Rentadora) object2;
        return cast2.revolucions == revolucions && cast2.soroll == soroll;
    }
}
