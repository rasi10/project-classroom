import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {
	Person p = new Person("Rafael", "Silva", 30,'M');
	
	@Test
	public void testSetAndGetFirstName() {
		p.setFirstName("Rafael");
		assertEquals(p.getFirstName().equals("Rafael"),true);
	}
	@Test
	public void testSetAndGetAge() {
		p.setAge(31);
		assertEquals(p.getAge()==31,true);
	}
	
	@Test
	public void testSetAndGetLastName() {
		p.setLastName("Silva");
		assertEquals(p.getLastName().equals("Silva"),true);
	}
	
	@Test
	public void testSetAndGetGender() {
		p.setGender('M');
		assertEquals(p.getGender() =='M',true);
	}

}
