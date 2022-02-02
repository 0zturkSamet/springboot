package com.techpro.springboot_kurs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //musteri request yolladiginda springBoot bu class ta arayacak get mi post mu oldugunu 
public class StudentBean01Controller {
	@RequestMapping(method=RequestMethod.GET,path="/getRequest")//musterinin istegini bu methodla karsilastir
	@ResponseBody //Methodun return ettigi datayi görmek icin bu annotation kullanilir
	public String getMethod(){
		return "GET request method run";
	}

}
