public class Descafeinado implements Cafe{
    private String tamano;

    public Descafeinado(String tamaño) {
        // Verificamos si la letra no es ninguna de las permitidas
        if (!tamano.equals("N") && !tamano.equals("M") && !tamano.equals("G")) {
            // Esto "lanza" el error rojo en la consola y detiene el programa
            throw new IllegalArgumentException("Error fatal: Tamaño no válido. Ingresaste '" + tamano + "', pero solo se permite 'N', 'M' o 'G'.");
        }
        this.tamano = tamano;
    }


    @Override
    public String getDescripcion() {
        return "Café Descafeinado (" + tamano + ")";
    }

    @Override
    public double costo() {
        if (tamano.equals("G")) return 1.25;
        if (tamano.equals("M")) return 1.15;
        return 1.05;
    }

    @Override
    public String getTamano() {
        return tamano;
    }
}