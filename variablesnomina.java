/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigosnomina;

/**
 *
 * @author Propietario
 */
public class variablesnomina {
    String Nombre;
    String Cargo;
    String Sueldo;
    

    public variablesnomina(String Nombre, String Cargo, String Sueldo) {
        
        this.Nombre = Nombre;
        this.Cargo = Cargo;
        this.Sueldo = Sueldo;
        
        
    }

      
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getSueldo() {
        return Sueldo;
    }

    public void setSueldo(String Sueldo) {
        this.Sueldo = Sueldo;
    }

        
}

    