public class Expresso implements Cafe{

    @Override
    public String getDescripcion() {
        return "café expresso";
    }

    @Override
    public double costo() {
        return 1.99;
    }
}
