/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo_s;
import java.io.Serializable;
/**
 *
 * @author Familia
 */
public class Persona implements Serializable {
                public int id;
                public String nombre;
                public String apellido;
                public Persona(int id, String nombre, String apellido) {
               this.id = id;
               this.nombre = nombre;
               this.apellido = apellido;
               }
                
                public int getId() {
               return id;
                }
                public void setId(int id) {
               this.id = id;
                }
                public String getNombre() {
               return nombre;
                }
                public void setNombre(String nombre) {
               this.nombre = nombre;
                }
                public String getApellido() {
               return apellido;
                }
                public void setApellido(String apellido) {
               this.apellido = apellido;
                }
                
                public String toString(){
               return "id: "+this.id+
               "; Nombre: "+this.nombre+
               "; Apellido: "+this.apellido;
                }
}