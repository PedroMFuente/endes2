package agenciaviajes;

public class AgenciaMain {
    public static void main(String[] args) {
        Agencia age=new Agencia();
        Persona p1=new Persona("123", "Pedro", "Fuente", 0, Esexo.V);
        Persona p2=new Persona("234", "Manu", "Illo", 0, Esexo.V);
        Persona p3=new Persona("345", "Sarah", "Garcia", 0, Esexo.M);
        Persona p4=new Persona("456", "Adri", "fuente", 0, Esexo.V);
        Persona p5=new Persona("987", "Alberto", "Si", 0, Esexo.V);
        
        age.addPersona(p1);
        age.addPersona(p2);
        age.addPersona(p3);
        age.addPersona(p4);
        age.addPersona(p5);
        
        if(age.searchPersona(p3)){
            System.out.println("Persona encontrada : "+p3);
        }
        System.out.println("----------------------");
        
        age.mostrar();
        
        age.deletePersona(p5);
        System.out.println("----------------------");
        age.mostrar();
    }
}
