public class EjemploAutomovil {
    public static void main(String [] args ){
        Automovil subaru = new Automovil();
        subaru.asignarFabricante("Subaru");
        subaru.asignarModelo("Impresa");
        subaru.asignarCilindrada(2.0);
        subaru.asignarColor("Blanco");


        Automovil mazda = new Automovil();
        mazda.asignarFabricante("Mazda");
        mazda.asignarModelo("BT-50");
        mazda.asignarCilindrada(3.0);
        mazda.asignarColor("Rojo");
        System.out.println("mazda.fabricante = " + mazda.getCilindrada());
        System.out.println("mazda.color = " + mazda.getColor());
        System.out.println("mazda.modelo = " + mazda.getModel());

        /**
        subaru.detalle();
        mazda.detalle();**/

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilometros por litro: " + subaru.calcularConsumo(300,0.75f));
        System.out.println("Kilometros por litro: " + subaru.calcularConsumo(300, 60));




    }
}
