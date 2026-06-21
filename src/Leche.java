public class Leche extends Decorator{
 public Leche(Cafe cafe){
     super(cafe);
 }
    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", leche";
    }

    @Override
    public double costo() {
        return cafe.costo() + 0.10;
    }
}

