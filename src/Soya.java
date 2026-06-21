public class Soya extends Decorator{
    public Soya(Cafe cafe){
        super(cafe);
        }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", soya";
        }

    @Override
    public double costo() {
        double extra =  0.15;
        if (cafe.getTamano().equals("M")) extra = 0.20;
        else if (cafe.getTamano().equals("G")) extra = 0.25;
        return cafe.costo() + extra;
    }
}
