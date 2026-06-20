public class Crema extends Decorator{
    public Crema(Cafe cafe){
        super(cafe);
    }
    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + "crema";
        }
    @Override
    public double costo() {
        return costo() + 0.10;
        }
    }
