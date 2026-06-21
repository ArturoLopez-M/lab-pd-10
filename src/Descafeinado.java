public class Descafeinado implements Cafe{

    @Override
    public String getDescripcion() {
        return "cafe descafeinado";
    }

    @Override
    public double costo() {
        return 1.05;
    }
}
