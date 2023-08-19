package examen1progra2_carlosnoé;

import java.util.ArrayList;

public class Equipos {

    public String Nombre;
    public String Nacionalidad;
    public double Rating;
    public ArrayList<Jugadores> Plantilla;

    public Equipos() {
    }

    public Equipos(String Nombre, String Nacionalidad, int Rating, ArrayList<Jugadores> Plantilla) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.Plantilla = Plantilla;
        this.Rating = setRating();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public double getRating() {
        return Rating;
    }

    public double setRating() {
        double Prom = 0;
        for (int i = 0; i < Plantilla.size(); i++) {
            Prom += Plantilla.get(i).getRating();
        }
        Prom = Prom / Plantilla.size();
        return Prom;

    }

    public ArrayList<Jugadores> getPlantilla() {
        return Plantilla;
    }

    public void setPlantilla(ArrayList<Jugadores> Plantilla) {
        this.Plantilla = Plantilla;
    }

    @Override
    public String toString() {
        return Nombre + Nacionalidad + Rating  + Plantilla ;
    }

}
