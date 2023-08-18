package examen1progra2_carlosnoé;

abstract public class Jugadores {
    public String Nombre;
    public int edad;
    public String Nacionalida;
    public boolean Pie;
    public int Rating;

    public Jugadores(String Nombre, int edad, String Nacionalida, boolean Pie, int Rating) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.Nacionalida = Nacionalida;
        this.Pie = Pie;
        this.Rating = Rating;
    }

    public Jugadores() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalida() {
        return Nacionalida;
    }

    public void setNacionalida(String Nacionalida) {
        this.Nacionalida = Nacionalida;
    }

    public boolean isPie() {
        return Pie;
    }

    public void setPie(boolean Pie) {
        this.Pie = Pie;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "Nombre=" + Nombre + ", edad=" + edad + ", Nacionalida=" + Nacionalida + ", Pie=" + Pie + ", Rating=" + Rating + '}';
    }
        
    
    
    
}
