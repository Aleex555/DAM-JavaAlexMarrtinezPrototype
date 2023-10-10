public class Forn extends Electrodomestic{
    int temperatura;
    String autoneteja;

    public Forn (){

    }


    public Forn(Forn target) {
        super(target);
        if (target!= null){
            this.autoneteja = target.autoneteja;
            this.temperatura = target.temperatura;
        }
    }


    @Override
    public Electrodomestic clone() {
        return new Forn(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Electrodomestic) || !super.equals(object2)) return false;
        Forn cast2 = (Forn) object2;
        return cast2.equals(autoneteja) && cast2.temperatura == temperatura;
    }
    
}
