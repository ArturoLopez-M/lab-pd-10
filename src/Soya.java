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
        return cafe.costo() + 0.15;
        }
    }
