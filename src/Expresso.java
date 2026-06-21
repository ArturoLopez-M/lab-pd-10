public class Expresso implements Cafe{
    private String tamano;

    public Expresso(String tamano) {
        // Verificamos si la letra no es ninguna de las permitidas
        if (!tamano.equals("N") && !tamano.equals("M") && !tamano.equals("G")) {
            // Esto "lanza" el error rojo en la consola y detiene el programa
            throw new IllegalArgumentException("Error fatal: Tamaño no válido. Ingresaste '" + tamano + "', pero solo se permite 'N', 'M' o 'G'.");
        }
        this.tamano = tamano;
    }


    @Override
    public String getDescripcion() {
        return "Café Expresso (" + tamano + ")";
    }

    @Override
    public double costo() {
        if (tamano.equals("G")) return 2.15;
        if (tamano.equals("M")) return 2.09;
        return 1.99;
    }

    @Override
    public String getTamano() {
        return tamano;
    }
}
