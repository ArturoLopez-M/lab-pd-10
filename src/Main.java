public class Main {
    public static void main(String[] args) {

        // ---------------------------------------------------------
        // Pedido A
        // ---------------------------------------------------------
        System.out.println("\"café expreso con leche, soya, crema y moca\"");

        Cafe bebida1 = new Expresso();
        bebida1 = new Leche(bebida1);
        bebida1 = new Soya(bebida1);
        bebida1 = new Crema(bebida1);
        bebida1 = new Moca(bebida1);

        System.out.println(bebida1.getDescripcion());
        System.out.println("El Costo total de la bebida mas sus complementos: $" + String.format("%.2f", bebida1.costo()) + "\n");


        // ---------------------------------------------------------
        // Pedido B
        // ---------------------------------------------------------
        System.out.println("\"café descafeinado con doble moca, soya y leche\"");

        Cafe bebida2 = new Descafeinado();
        bebida2 = new Leche(bebida2);
        bebida2 = new Soya(bebida2);
        bebida2 = new Moca(bebida2);
        bebida2 = new Moca(bebida2);

        System.out.println(bebida2.getDescripcion());
        System.out.println("El Costo total de la bebida mas sus complementos: $" + String.format("%.2f", bebida2.costo()) + "\n");


        // ---------------------------------------------------------
        // Pedido C
        // ---------------------------------------------------------
        System.out.println("\"café batido con doble crema, doble leche, doble soya y doble moca\"");

        Cafe bebida3 = new Batido();
        bebida3 = new Crema(bebida3);
        bebida3 = new Crema(bebida3);
        bebida3 = new Leche(bebida3);
        bebida3 = new Leche(bebida3);
        bebida3 = new Soya(bebida3);
        bebida3 = new Soya(bebida3);
        bebida3 = new Moca(bebida3);
        bebida3 = new Moca(bebida3);

        System.out.println(bebida3.getDescripcion());
        System.out.println("El Costo total de la bebida mas sus complementos: $" + String.format("%.2f", bebida3.costo()) + "\n");


        // ---------------------------------------------------------
        // Pedido D
        // ---------------------------------------------------------
        System.out.println("\"café tostado negro con doble crema y triple soya\"");

        Cafe bebida4 = new TostadoNegro();
        bebida4 = new Crema(bebida4);
        bebida4 = new Crema(bebida4);
        bebida4 = new Soya(bebida4);
        bebida4 = new Soya(bebida4);
        bebida4 = new Soya(bebida4);

        System.out.println(bebida4.getDescripcion());
        System.out.println("El Costo total de la bebida mas sus complementos: $" + String.format("%.2f", bebida4.costo()) + "\n");
    }
}
