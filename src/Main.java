public class Main {
    public static void main(String[] args) {
        // Ejemplo del Pedido D: Café Tostado Negro con doble crema y triple soya
        Cafe pedido = new TostadoNegro();
        pedido = new Crema(pedido);
        pedido = new Soya(pedido);
        pedido = new Soya(pedido);
        pedido = new Soya(pedido);

        // Aquí es donde se jala la descripción y el costo total que calculaste
        System.out.println("Descripción: " + pedido.getDescripcion());
        System.out.printf("Costo Total de la bebida más complementos: $%.2f\n", pedido.costo());
    }
}
