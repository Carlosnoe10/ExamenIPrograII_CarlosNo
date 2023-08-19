package examen1progra2_carlosnoé;

public class Estadios {
    public String Nombre;
    public String Cuidad;
    public int Capacidad;
    public Equipos Perte;

    public Estadios() {
    }

    public Estadios(String Nombre, String Cuidad, int Capacidad, Equipos Perte) {
        this.Nombre = Nombre;
        this.Cuidad = Cuidad;
        this.Capacidad = Capacidad;
        this.Perte = Perte;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCuidad() {
        return Cuidad;
    }

    public void setCuidad(String Cuidad) {
        this.Cuidad = Cuidad;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public Equipos getPerte() {
        return Perte;
    }

    public void setPerte(Equipos Perte) {
        this.Perte = Perte;
    }

    @Override
    public String toString() {
        return  Nombre  + Cuidad +  Capacidad  + Perte ;
    }
    
    
    
}
