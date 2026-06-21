public class Crema extends Decorator{
    public Crema(Cafe cafe){
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", crema";
        }

    @Override
    public double costo() {
        double extra =  0.10;
        if (cafe.getTamano().equals("M")) extra = 0.15;
        else if (cafe.getTamano().equals("G")) extra = 0.20;
        return cafe.costo() + extra;
        }
    }