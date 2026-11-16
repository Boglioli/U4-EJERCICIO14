public class ControlVencimiento {
    public void procesarDevolucion(Prestable material, int dias) {
        double multa = material.calcularMultaDemora(dias);
        System.out.println("dias de atraso: " + dias);
        System.out.println("multa a pagar: " + multa);
        System.out.println("----------------------");
    }
}
