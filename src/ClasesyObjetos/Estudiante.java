package ClasesyObjetos;

public class Estudiante {
    String nombre;
    double nota;

    public Estudiante(double nota, String nombre) {
        this.nota = nota;
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre='" + nombre + '\'' + ", nota=" + nota + '}';
    }
}