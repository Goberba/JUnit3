import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplosNumero1hastaMTest extends MultiplosNumero1hastaM {

	@Test
	void testLeerN() {
		int n=leerN();
		boolean result = false;
		if(n>0) {
			result=true;
		}
		
		assertTrue(result==true);
	}

	@Test
	void testLeerM() {
		int n=leerN();
		int m=leerM(n);
		boolean result=false;
		if(m>0 && m>n) {
			result=true;
		}
		assertTrue(result==true);
	}

	@Test
	void testMultiplosNyM() {
		int n=leerN();
		int m=leerM(n);
		boolean resultado=false;
		String a=multiplosNyM(n,m);
		if(a!=null) {
			resultado=true;
		}
			
		assertTrue(resultado==true);
	}

}
