public class Profesor extends Persona {
    private String especialidad;

    public Profesor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy el profesor " + getNombre() + " y mi especialidad es " + especialidad + ".");
    }
}