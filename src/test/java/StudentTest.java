import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {
	Student student = new Student("Rafael", "Silva",31,'M');

	@Test
	public void testSetAndGetAge() {
		student.setAge(30);
		assertEquals(student.getAge()== 30, true);
	}

}
