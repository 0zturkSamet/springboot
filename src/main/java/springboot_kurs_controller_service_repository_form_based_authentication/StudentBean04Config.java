package springboot_kurs_controller_service_repository_form_based_authentication;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // data send to sql
public class StudentBean04Config {
	//bu class ta data olusturup data base deki tablolara yolluyoruz
	
	
	
	@Bean
	CommandLineRunner commandLineRunner1(StudentBean04Repository studentRepo) {
		
		

		return args -> {

			StudentBean04 aliSun = new StudentBean04(101L, "Alie Sun", "as@gmail.com",
					LocalDate.of(2002, Month.JANUARY, 21));
			StudentBean04 valeyCannes = new StudentBean04(102L, "Valey Cannes", "vc@gmail.com",
					LocalDate.of(2000, Month.MAY, 2));
			StudentBean04 maryStar = new StudentBean04(103L, "Mary Star", "ms@gmail.com",
					LocalDate.of(2001, Month.FEBRUARY, 12));

			studentRepo.saveAll(List.of(aliSun, valeyCannes, maryStar));
		};
	}
	
	
}