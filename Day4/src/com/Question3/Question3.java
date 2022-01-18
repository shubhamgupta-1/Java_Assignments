package com.Question3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name,id;
	private String address;
	private transient double salary;		
	public Employee(String name, String id, String address, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Name: "+ name);
		System.out.println("ID: "+ id);
		System.out.println("Address: "+address);
		System.out.println("Salary: "+salary);
	}
}

public class Question3 {
		//SERIALIZATION
		public static void serialize(Employee employee, String filename) {
			try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))){
				out.writeObject(employee);
				System.out.println("Object has been serialized");
			}catch(IOException ex) {
				ex.getMessage();
			}
		}
		//DESERIALIZATION
		public static void deserialize(String filename) {
			Employee emp = null;
			try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))){
				emp = (Employee)in.readObject();
				System.out.println("Object has been deserialized");
				emp.display();
			}catch(IOException ex)  {
				ex.getMessage();
			}
			catch(ClassNotFoundException  ex)  {
				ex.getMessage();
			}
		}
	public static void main(String[] args) {
		Employee employee = new Employee("Shubham","YM315","Sonipat",50000.00);
		String filename = "employee.txt";
		serialize(employee,filename);
		deserialize(filename);

	}

}
