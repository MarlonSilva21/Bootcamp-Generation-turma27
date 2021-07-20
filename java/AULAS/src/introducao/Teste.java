package introducao;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class Teste extends Soma {

	Soma so = new Soma();
	@Test
	void testSoma() {
		;
		assertEquals(20, so.soma());
	}

}
