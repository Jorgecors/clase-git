public class Estudiante extends Persona {
    private int codigoEstudiante;

    public Estudiante(String nombre, int edad, int codigoEstudiante) {
        super(nombre, edad);
        this.codigoEstudiante = codigoEstudiante;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy " + getNombre() + " y soy estudiante.");
    }
}