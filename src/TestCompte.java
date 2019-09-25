import static org.junit.Assert.*;

import org.junit.Test;


public class TestCompte {

	@Test
	public void testInit() {
		//fail("Not yet implemented");
		Compte test = new Compte(500);
		assertNotNull("L'objet n'existe pas",test);
		int res = 500;
		assertEquals(res,test.getSolde());
	}
	@Test
	public void testGetSolde() {
		
		Compte test = new Compte(500);
		int res = 500;
		assertEquals(res,test.getSolde());
	}
	@Test
	public void testCredit() {
		
		Compte test = new Compte(500);
		int res = test.getSolde();
		test.credit(1000);
		res += 1000;
		assertEquals(res,test.getSolde());
		
	}
	@Test
	public void testDebit() {
		
		Compte test = new Compte(500);
		int deb = 200;
		int res = test.getSolde();
		test.debit(deb);
		res -= deb;
		
		assertEquals(res,test.getSolde());
		
	}
/*
	@Test
	public void testDebit2() {
		
		Compte test = new Compte(500);
		int deb = -200;
		int res = test.getSolde();
		test.debit(deb);
		res -= deb;
		
		assertEquals(res,test.getSolde());
		
	}
	*/
	
	@Test
	public void testVirement() {
		
		Compte test = new Compte(500);
		Compte test2 = new Compte(500);
		
		test.virement(test2, 200);
		assertTrue (test2.getSolde() == 700 && test.getSolde() == 300);
	}
	
	
	
}
