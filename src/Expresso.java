public class Expresso implements Cafe{

    @Override
    public String getDescripcion() {
        return "café expresso con";
    }

    @Override
    public double costo() {
        return 1.99;
    }
}
