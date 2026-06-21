public class Moca extends Decorator{
    public Moca(Cafe cafe){
        super(cafe);
        }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", moca";
        }

    @Override
    public double costo() {
        double extra =  0.20;
        if (cafe.getTamano().equals("M")) extra = 0.25;
        else if (cafe.getTamano().equals("G")) extra = 0.30;
        return cafe.costo() + extra;
    }
}
