
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alán
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Persona> miLista = new LinkedList();
        miLista.add(new Persona("Juan", "Lopez", 34, 2300, true));
        miLista.add(new Persona("Pedro", "Paramo", 57, 800, true));
        miLista.add(new Persona("Juana", "Domiguez", 45, 5000, false));
        miLista.add(new Persona("Ana", "Perez", 25, 2500, false));
        miLista.add(new Persona("Roberto", "Gomez", 30, 1900, true));
        miLista.add(new Persona("Raul", "Gomez", 28, 2850, true));
        miLista.add(new Persona("Roberto", "Perez", 36, 5600, true));
        miLista.add(new Persona("Rob", "Perez", 15, 5600, true));
        miLista.add(new Persona("Robe", "Perez", 45, 5600, true));
        miLista.add(new Persona("Robed", "Periz", 45, 5600, true));
        System.out.println("Por Orden de Agregacion" + "\n");
        for (Persona persona : miLista) {
            System.out.println("Nombre: " + persona.getNombre() + "\n"
                    + "Apellido: " + persona.getApellido() + "\n"
                    + "Edad :" + persona.getEdad() + "\n"
                    + "Salario: " + persona.getSalario() + "\n"
                    + "Sexo: " + persona.isSexo() + "\n");
        }
        //Ordenar por edad
        Comparator miComp = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1, p2;
                p1 = (Persona) o1;
                p2 = (Persona) o2;
                //Ordenar por edad
                int e1, e2;
                e1 = p1.getEdad();
                e2 = p2.getEdad();
                return e1 - e2;
            }
        };
        System.out.println("Por edad" + "\n");
        Collections.sort(miLista, miComp);
        for (Persona persona : miLista) {
            System.out.println("Nombre: " + persona.getNombre() + "\n"
                    + "Apellido: " + persona.getApellido() + "\n"
                    + "Edad :" + persona.getEdad() + "\n"
                    + "Salario: " + persona.getSalario() + "\n"
                    + "Sexo: " + persona.isSexo() + "\n");
        }
        Comparator miComp2 = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1, p2;
                p1 = (Persona) o1;
                p2 = (Persona) o2;
                //Ordenar por Salario
                double s1, s2;
                s1 = p1.getSalario();
                s2 = p2.getSalario();
                return (int) (s1 - s2);
            }
        };
        System.out.println("Por Salario" + "\n");
        Collections.sort(miLista, miComp2);
        for (Persona persona : miLista) {
            System.out.println("Nombre: " + persona.getNombre() + "\n"
                    + "Apellido: " + persona.getApellido() + "\n"
                    + "Edad :" + persona.getEdad() + "\n"
                    + "Salario: " + persona.getSalario() + "\n"
                    + "Sexo: " + persona.isSexo() + "\n");
        }
        Comparator miComp3 = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1, p2;
                p1 = (Persona) o1;
                p2 = (Persona) o2;
                //Ordenar por Salario
                String cad1, cad2;
                cad1 = p1.getApellido();
                cad2 = p2.getApellido();
                char c1, c2;
                c1 = cad1.charAt(0);
                c2 = cad2.charAt(0);
                if (cad1.equals(cad2)) {
                    int e1, e2;
                    e1 = p1.getEdad();
                    e2 = p2.getEdad();
                    return e1 - e2;
                } else {
                    return c1 - c2;
                }
            }
        };
        System.out.println("Por Apellido-Edad" + "\n");
        Collections.sort(miLista, miComp3);
        for (Persona persona : miLista) {
            System.out.println("Nombre: " + persona.getNombre() + "\n"
                    + "Apellido: " + persona.getApellido() + "\n"
                    + "Edad :" + persona.getEdad() + "\n"
                    + "Salario: " + persona.getSalario() + "\n"
                    + "Sexo: " + persona.isSexo() + "\n");
        }
        Comparator miComp4 = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1, p2;
                p1 = (Persona) o1;
                p2 = (Persona) o2;
                //Ordenar por edad
                char cad1, cad2;
                cad1 = p1.getApellido().charAt(0);
                cad2 = p2.getApellido().charAt(0);
                int aux=cad1-cad2;
                if(aux==0){
                int i=1;
                while (aux==0){
                cad1=p1.getApellido().charAt(i);
                cad1=p2.getApellido().charAt(i);
                i++;
                aux=cad1-cad2;
                }
                return aux;
                }
                else return aux;
             
            }
            
        };
        System.out.println("Por Apellido completo" + "\n");
        Collections.sort(miLista, miComp4);
        for (Persona persona : miLista) {
            System.out.println("Nombre: " + persona.getNombre() + "\n"
                    + "Apellido: " + persona.getApellido() + "\n"
                    + "Edad :" + persona.getEdad() + "\n"
                    + "Salario: " + persona.getSalario() + "\n"
                    + "Sexo: " + persona.isSexo() + "\n");
        }

    }

}

class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    private boolean sexo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public boolean isSexo() {
        return sexo;
    }

    public Persona() {
        nombre = "";
        apellido = "";
        edad = 0;
        salario = 0;
        sexo = false;
    }

    public Persona(String n, String a, int e, double s, boolean sx) {
        nombre = n;
        apellido = a;
        edad = e;
        salario = s;
        sexo = sx;
    }

}
