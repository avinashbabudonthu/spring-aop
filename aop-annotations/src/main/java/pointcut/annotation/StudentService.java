package pointcut.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@TestAnnotation
	public Student7 findStudent() {
		log.info("find student");
		return studentRepository.findStudent();
	}
}
