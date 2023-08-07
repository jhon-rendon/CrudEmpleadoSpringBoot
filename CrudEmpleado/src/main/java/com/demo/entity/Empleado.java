/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.demo.entity;

/**
 *
 * @author Jhon Rendon
 */
public class Empleado {
    
    private String identification;
    private String name;
    private Integer  age;
    private String position;

    /*public Empleado(String identification, String name, String position, int age) {

	this.identification = identification;
	this.name           = name;
	this.position       = position;
        this.age            = age;
    }*/

    public String getIdentificacion() {
        return this.identification;
    }
    public void setIdentificacion( String id) {
        this.identification = id;
    }

   public String getName() {
        return this.name;
   }
   public void setName( String name ) {
        this.name = name;
   }
   
   public Integer  getEdad() {
        return this.age;
   }
   public void setEdad( Integer  edad ) {
        this.age = edad;
   }

   public String getPosition() {
        return this.position;
   }
   public void setPosition( String position ) {
        this.position = position;
   }


/*public String toString(){
    return "Empleado [name="+name",position="+position+",age="+age+",identification="+identification"]";
}*/

}
