package examen1progra2_carlosnoé;

import java.util.Random;

public final class Jugadores {

    public String Nombre;
    public int edad;
    public String Nacionalida;
    public String Posicion;
    public boolean Pie;
    public double Rating;
    public int Agarre;
    public int Lanzamiento;
    public int Fisico;
    public int Ritmo;
    public int Entrada;
    public int Vision;
    public int Passing;
    public int Regate;
    public int Disparo;

    public Jugadores(String Nombre, int edad, String Nacionalida, String Posicion, boolean Pie, double Rating) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.Nacionalida = Nacionalida;
        this.Posicion = Posicion;
        this.Pie = Pie;
        this.Rating = rate();
    }



    public Jugadores(int Agarre, int Lanzamiento, int Fisico, int Ritmo, int Entrada, int Vision, int Passing, int Regate, int Disparo) {
        this.Agarre = Agarre;
        this.Lanzamiento = Lanzamiento;
        this.Fisico = Fisico;
        this.Ritmo = Ritmo;
        this.Entrada = Entrada;
        this.Vision = Vision;
        this.Passing = Passing;
        this.Regate = Regate;
        this.Disparo = Disparo;
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

    public double getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "Nombre=" + Nombre + ", edad=" + edad + ", Nacionalida=" + Nacionalida + ", Pie=" + Pie + ", Rating=" + Rating + '}';
    }

    public double rate() {

        if (Nacionalida.equalsIgnoreCase("Portero")) {
            this.Agarre = NumeroRandomAlto();
            this.Lanzamiento = NumeroRandomAlto();
            this.Fisico = NumeroRandomBajo();
            this.Ritmo = NumeroRandomBajo();
            this.Entrada = NumeroRandomBajo();
            this.Vision = NumeroRandomBajo();
            this.Passing = NumeroRandomAlto();
            this.Regate = NumeroRandomBajo();
            this.Disparo = NumeroRandomBajo();

        } else if (Nacionalida.equalsIgnoreCase("Defensa")) {
            this.Agarre = NumeroRandomBajo();
            this.Lanzamiento = NumeroRandomBajo();
            this.Fisico = NumeroRandomAlto();
            this.Ritmo = NumeroRandomAlto();
            this.Entrada = NumeroRandomAlto();
            this.Vision = NumeroRandomBajo();
            this.Passing = NumeroRandomBajo();
            this.Regate = NumeroRandomBajo();
            this.Disparo = NumeroRandomBajo();

        } else if (Nacionalida.equalsIgnoreCase("MedioCampista")) {
            this.Agarre = NumeroRandomBajo();
            this.Lanzamiento = NumeroRandomBajo();
            this.Fisico = NumeroRandomBajo();
            this.Ritmo = NumeroRandomBajo();
            this.Entrada = NumeroRandomBajo();
            this.Vision = NumeroRandomAlto();
            this.Passing = NumeroRandomAlto();
            this.Regate = NumeroRandomAlto();
            this.Disparo = NumeroRandomBajo();

        } else if (Nacionalida.equalsIgnoreCase("Delantero")) {
            this.Agarre = NumeroRandomBajo();
            this.Lanzamiento = NumeroRandomBajo();
            this.Fisico = NumeroRandomBajo();
            this.Ritmo = NumeroRandomAlto();
            this.Entrada = NumeroRandomBajo();
            this.Vision = NumeroRandomBajo();
            this.Passing = NumeroRandomBajo();
            this.Regate = NumeroRandomAlto();
            this.Disparo = NumeroRandomAlto();
        }
        
double Prom= (Agarre+Lanzamiento+Fisico+Ritmo+Entrada+Vision+Passing+Regate+Disparo/9)*100;
      return Prom;  

    }

    public int NumeroRandomAlto() {
        Random random = new Random();
        int Random1 = random.nextInt(12 - 1) + 1;
        int Respu = Random1 * 12;
        if (Respu > 70) {
            return Respu;
        } else {
            return NumeroRandomAlto();
        }

    }

    public int NumeroRandomBajo() {
        Random random = new Random();
        int Random1 = random.nextInt(5 - 1) + 1;
        int Respu = Random1 * 13;
        return Respu;

    }

}
