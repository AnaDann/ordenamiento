
package MergeSort;


public class Persona {
    private String nombre;
    private Double edad;
    
    public Persona(String nombre,Double edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getEdad() {
        return edad;
    }

    public void setEdad(Double edad) {
        this.edad = edad;
    }



    @Override
    public String toString() {
        return nombre + ", " + edad;
    }
    
}
