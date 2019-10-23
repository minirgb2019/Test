package coding;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Concat {

	@Test
	void Concattest() {
		MyJunit junit=new MyJunit();
		String result=junit.ConCat("Hold", "Hands");
		assertEquals("HoldHands", result);
	}

}
