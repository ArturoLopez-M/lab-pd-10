public class Batido implements Cafe{

    @Override
    public String getDescripcion() {
        return "cafe batido con";
    }

    @Override
    public double costo() {
        return 0.89;
    }
}
