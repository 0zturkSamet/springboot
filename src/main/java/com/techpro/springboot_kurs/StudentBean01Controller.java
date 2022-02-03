package com.techpro.springboot_kurs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller //musteri request yolladiginda springBoot bu class ta arayacak get mi post mu oldugunu
@RestController
public class StudentBean01Controller {
//	@RequestMapping(method = RequestMethod.GET, path = "/getRequest") // musterinin istegini bu methodla karsilastir
//	@ResponseBody // Methodun return ettigi datayi görmek icin bu annotation kullanilir
//
//	 public String getMethod1(){
//		return "GET request method run";
//	}
//	

	@GetMapping(path = "/getString")
	public String getMethod1() {
		return "GET request method run";
	}

	// tight coupling
	@GetMapping(path = "/getObjectTight")
	public StudentBean01 getMethod2() {
		return new StudentBean01("Jack Jones", 33, "AC202203");
	}

	// loose coupling
	@Autowired // it take the object from IOC container then put into the s container
				// Autowired looks like a "=" assignment
	StudentBean01 s;

	@GetMapping(path = "/getObjectLoose")
	public StudentBean01 getMethod3() {
		s.setName("John Conor");
		s.setAge(13);
		s.setId("AC202103");
		return s;
	}
	// Tight Coupling with parameter

	@GetMapping(path = "/getObjectParameter1/{school}")
	public StudentBean01 getMethod4(@PathVariable String school) {
		return new StudentBean01("Daniel Bo", 50, String.format("VH2021%s45", school));
	}

	// Loose coupling with parameter
	@GetMapping(path = "/getObjectParameter/{school}")
	public StudentBean01 getMethod5(@PathVariable String school) {
		s.setName("Leo Messi");
		s.setAge(45);
		s.setId(String.format("VH2021%s45", school));

		return s;
	}

	// Tight Coupling with List
	@GetMapping(path = "/getObjectList")
	public List<StudentBean01> getMethod6() {
		return List.of(new StudentBean01("Daniel Bo", 22, "VH202122"), new StudentBean01("Daniel Bone", 23, "VH202123"),
				new StudentBean01("Daniel Bonus", 24, "VH202124"));
	}

	// Loose Coupling kullanarak study(); methoda ulasma
	@Autowired
	StudentBean01 t;// Class ismini yazarak IOC Container dan istediginiz objeyi alabilirsiniz.

	@GetMapping(path = "/getStudy1")
	public String getMethod7() {
		return t.study();
	}
	
	@Autowired
	@Qualifier(value="studentBean02")// javaya bu sekilde hangisini getirecegini söylüyoruz
	StudentInterface u;//2 tane child i var.Hangisini verecegini java bilemez ve hata verir.
	//Application failed to Start

	@GetMapping(path = "/getStudy2")
	public String getMethod8() {
		return u.study();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
