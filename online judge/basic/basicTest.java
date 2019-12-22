package basic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import basic.a001.a001;

class basicTest {

	@Test
	public void a001Test() throws Exception {
	    String input = "twelvefish";
	    assertEquals("hello, twelvefish", a001.method(input));
	}
}
