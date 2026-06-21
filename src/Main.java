import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Café Expresso con leche, soya, crema y moca
        Cafe pedido1 = new Expresso("N");
        pedido1 = new Leche(pedido1);
        pedido1 = new Soya(pedido1);
        pedido1 = new Crema(pedido1);
        pedido1 = new Moca(pedido1);
        imprimirPedido(pedido1);

        // 2. Café Descafeinado con doble moca, soya y leche
        Cafe pedido2 = new Descafeinado("N");
        pedido2 = new Moca(pedido2);
        pedido2 = new Moca(pedido2); // doble moca
        pedido2 = new Soya(pedido2);
        pedido2 = new Leche(pedido2);
        imprimirPedido(pedido2);

        // 3. Café Batido con doble crema, doble leche, doble soya y doble moca
        Cafe pedido3 = new Batido("N");
        pedido3 = new Crema(pedido3);
        pedido3 = new Crema(pedido3);
        pedido3 = new Leche(pedido3);
        pedido3 = new Leche(pedido3);
        pedido3 = new Soya(pedido3);
        pedido3 = new Soya(pedido3);
        pedido3 = new Moca(pedido3);
        pedido3 = new Moca(pedido3);
        imprimirPedido(pedido3);

        // 4. Café Tostado Negro con doble crema y triple soya
        Cafe pedido4 = new TostadoNegro("N");
        pedido4 = new Crema(pedido4);
        pedido4 = new Crema(pedido4); // doble crema
        pedido4 = new Soya(pedido4);
        pedido4 = new Soya(pedido4);
        pedido4 = new Soya(pedido4);  // triple soya
        imprimirPedido(pedido4);
    }


    // Método para hacer el print con el formato correcto
    public static void imprimirPedido(Cafe pedido) {
        String descripcionFinal = agruparIngredientes(pedido.getDescripcion());
        System.out.println(descripcionFinal);
        System.out.printf("El costo total de la bebida más sus complementos: $%.2f\n\n", pedido.costo());
    }


    // Método para agrupar textos en un nuevo formato según el caso.
    public static String agruparIngredientes(String descripcionCruda) {
        String[] partes = descripcionCruda.split(", ");
        String base = partes[0];

        if (partes.length == 1) return base;

        Map<String, Integer> conteo = new LinkedHashMap<>();
        for (int i = 1; i < partes.length; i++) {
            String ingrediente = partes[i];
            conteo.put(ingrediente, conteo.getOrDefault(ingrediente, 0) + 1);
        }

        List<String> listaIngredientes = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : conteo.entrySet()) {
            String nombre = entry.getKey();
            int cantidad = entry.getValue();

            if (cantidad == 1) listaIngredientes.add(nombre);
            else if (cantidad == 2) listaIngredientes.add("doble " + nombre);
            else if (cantidad == 3) listaIngredientes.add("triple " + nombre);
            else if (cantidad == 4) listaIngredientes.add("cuádruple " + nombre);
            else listaIngredientes.add(cantidad + "x " + nombre);
        }

        String unidos;
        if (listaIngredientes.size() == 1) {
            unidos = listaIngredientes.get(0);
        } else {
            List<String> todosMenosUltimo = listaIngredientes.subList(0, listaIngredientes.size() - 1);
            String ultimo = listaIngredientes.get(listaIngredientes.size() - 1);
            unidos = String.join(", ", todosMenosUltimo) + " y " + ultimo;
        }

        return base + " con " + unidos;
    }
}
