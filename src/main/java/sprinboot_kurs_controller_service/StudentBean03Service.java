package sprinboot_kurs_controller_service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StudentBean03Service {
	List<StudentBean03> listofStudents = List.of(
			new StudentBean03(101L, "Jackie Jack", "jj@gmail.com", LocalDate.of(2000, 8, 8)),
			new StudentBean03(102L, "Backie Back", "bj@gmail.com", LocalDate.of(1999, 9, 9)),
			new StudentBean03(103L, "Mackie Mack", "mj@gmail.com", LocalDate.of(1998, 1, 1))

	);

	// as user login
	public StudentBean03 getStudentById(Long id) {
		if(listofStudents.stream().filter(t -> t.getId() == id).collect(Collectors.toList()).isEmpty()) {
			return new StudentBean03();
			
		}
		return listofStudents.stream().filter(t -> t.getId() == id).findFirst().get();
		
	}
	
	public List<StudentBean03> getAllStudents(){
		return listofStudents;
	}
}
