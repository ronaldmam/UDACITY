package oop1.pro2.uml.domain;

public class Customer {
	private String name;
	private int edad;
	private int id;
	
	public Customer()
	{
		
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String toString(){
		String s="Nombre: "+this.name+" edad:"+this.edad+" id:"+this.id;
		return s;
	}

}
