package agenciaviajes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Agencia {

    ArrayList<Persona> lista;
    int codigoViaje;
    LocalDate fecha;

    public Agencia() {
        lista=new ArrayList<>();
    }

    public boolean addPersona(Persona p) {
        boolean result = false;
        if (p != null) {
            if (!searchPersona(p)) {
                lista.add(p);
                result = true;
            }
        }
        return result;
    }

    public boolean deletePersona(Persona p) {
        boolean result = false;
        if (p != null) {
                lista.remove(p);
        }

        return result;
    }

    public boolean searchPersona(Persona p) {
        boolean result = false;
        //ITERATOR comprobando dni
        if (p != null) {
            Iterator<Persona> i = lista.iterator();

            while (i.hasNext() && !result) {
                if (i.next().getDni().toUpperCase().equals(p.getDni())) {
                    result = true;
                }
            }
        }

        return result;
    }

    public void mostrar() {
        //ordenar por apellido, si son iguales por dni
        Collections.sort(lista);
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

}
