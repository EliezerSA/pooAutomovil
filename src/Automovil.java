public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "Blanco";
    private double cilindrada;
    private int capacidadEstanque = 40;

    public String getFabricante(){
        return this.fabricante;
    }
    public void asignarFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getModel(){
        return modelo;
    }
    public void asignarModelo(String modelo){
        this.modelo = modelo;
    }

    public String getColor(){
        return color;
    }
    public void asignarColor(String color){
        this.color = color;
    }
    public double getCilindrada(){
        return cilindrada;
    }
    public void asignarCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }
    public int getcapacidadEstanque(){
        return capacidadEstanque;
    }
    public void asignarCapacidadEstanque(int capacidadEstanque){
        this.capacidadEstanque = capacidadEstanque;
    }

    public String verDetalle(){
        return "auto.fabricante = " + this.fabricante +
        "\nauto.modelo = " + this.modelo +
        "\nauto.color = " + this.color +
        "\nauto.cilindrada = " + this.cilindrada;
    }

    public String acelerar(int rpm){
        return "el auto " + this.fabricante + "acelerando a " + rpm + "rpm";
    }

    public String frenar(){
        return fabricante + " " + modelo + "frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina){
        return km/(capacidadEstanque*porcentajeGasolina);
    }

    public float calcularConsumo2(int km, int porcentajeGasolina){
        return km/(capacidadEstanque*porcentajeGasolina);
    }

}
