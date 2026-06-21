public abstract class Decorator implements Cafe {
    protected Cafe cafe;

    public Decorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getTamano() {
        return cafe.getTamano();
    }
}
