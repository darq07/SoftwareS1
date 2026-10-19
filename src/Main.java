public class Main {

    void main() {

        Dispositivo dispositivo1 = new Dispositivo();
        Dispositivo dispositivo2 = new Dispositivo();

        dispositivo1.setNombre("Computadora");
        dispositivo1.setTipo("Portatil");
        dispositivo1.setActivo(true);

        dispositivo2.setNombre("Impresora");
        dispositivo2.setTipo("Laser");
        dispositivo2.setActivo(false);

        dispositivo1.mostrarInformacion();
        dispositivo1.mostrarEstado();

        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarEstado();

        dispositivo1.setNombre("Laptop");

        dispositivo1.mostrarInformacion();
        dispositivo2.mostrarInformacion();
    }
}
