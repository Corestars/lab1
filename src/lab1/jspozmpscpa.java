package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class jspozmpscpa {

	@Test
	public void testRead() {
		String customs=readin.read("1");
		System.out.println(customs);
		String customss=readin.read("5");
		System.out.println(customss);
		String customssss=readin.read("3");
		System.out.println(customssss);
		String customssssss=readin.read("4");
		System.out.println(customssssss);
	}

}
