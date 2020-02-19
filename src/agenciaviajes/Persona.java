package agenciaviajes;

import java.util.Objects;

public class Persona implements Comparable<Persona>{
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private Esexo sexo;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public Persona(String dni, String nombre, String apellidos, int edad, Esexo sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Esexo getSexo() {
        return sexo;
    }

    public void setSexo(Esexo sexo) {
        this.sexo = sexo;
    }
    
    public boolean equals(Object o){
        boolean result=false;
        
        if(o!=null){
            if(o instanceof Persona){
                Persona otro=(Persona)o;
                if(nombre.equals(otro.nombre)){
                    result=true;
                }
            }
        }
        
        return result;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", sexo=" + sexo + '}';
    }

    @Override
    public int compareTo(Persona otro) {
        int result=0;
        if(otro!=null){
            result=this.apellidos.toUpperCase().compareTo(otro.apellidos.toUpperCase());
            if(result==0){
                result=this.dni.toUpperCase().compareTo(otro.dni.toUpperCase());
            }
        }
        return result;
    }
    
    
}
