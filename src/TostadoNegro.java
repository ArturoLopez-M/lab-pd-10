public class TostadoNegro implements Cafe{
    private String tamano;

    public TostadoNegro(String tamano) {
        // Verificamos si la letra no es ninguna de las permitidas
        if (!tamano.equals("N") && !tamano.equals("M") && !tamano.equals("G")) {
            // Esto "lanza" el error rojo en la consola y detiene el programa
            throw new IllegalArgumentException("Error fatal: Tamaño no válido. Ingresaste '" + tamano + "', pero solo se permite 'N', 'M' o 'G'.");
        }
        this.tamano = tamano;
    }


    @Override
    public String getDescripcion() {
        return "Café Tostado Negro (" + tamano + ")";
    }

    @Override
    public double costo() {
        if (tamano.equals("G")) return 1.19;
        if (tamano.equals("M")) return 1.09;
        return 0.99;
    }

    @Override
    public String getTamano() {
        return tamano;
    }
}
