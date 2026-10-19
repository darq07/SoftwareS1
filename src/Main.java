public class Main {

    public void main() {

        Dispositivo dispositivo1 = new Dispositivo();
        Dispositivo dispositivo2 = new Dispositivo();

        dispositivo1.nombre = "Computadora";
        dispositivo1.tipo = "Portatil";
        dispositivo1.activo = true;

        dispositivo2.nombre = "Impresora";
        dispositivo2.tipo = "Laser";
        dispositivo2.activo = false;

        dispositivo1.mostrarInformacion();
        dispositivo1.mostrarEstado();

        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarEstado();

        dispositivo1.nombre = "Laptop";

        dispositivo1.mostrarInformacion();
        dispositivo2.mostrarInformacion();
    }
}
