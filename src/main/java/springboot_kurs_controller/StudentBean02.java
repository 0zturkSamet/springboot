package springboot_kurs_controller;

import org.springframework.stereotype.Component;


//Pojo class
@Component
public class StudentBean02 implements StudentInterface{
	private String name;
	private int age;
	
	
	public StudentBean02() {
		System.out.println("Constructor without parameter is used");
	}
	public StudentBean02(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentBean02 [name=" + name + ", age=" + age + "]";
	}
	@Override
	public String study() {
		
		return "I am coming from StudentBean02...";
	}
	

}
