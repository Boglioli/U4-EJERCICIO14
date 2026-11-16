public class Main {
    public static void main(String[] args) {
        ControlVencimiento control = new ControlVencimiento();
        Prestable m1 = new LibroPrestamo();
        Prestable m2 = new RevistaPrestamo();
        Prestable m3 = new TesisPrestamo();
        control.procesarDevolucion(m1, 3);
        control.procesarDevolucion(m2, 6);
        control.procesarDevolucion(m3, 9);
    }
}
