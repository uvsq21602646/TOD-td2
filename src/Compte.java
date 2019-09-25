
public class Compte {
	
	private int solde;
	
	
	public Compte(int soldeinit){
		
		this.solde = soldeinit;
	}

	public int getSolde() {
		
		return this.solde;
	}
	
	public void credit(int cred) {
		/*if(cred < 0) {
			System.out.println("ne peut pas créditer");
			System.exit(-1);	
		}*/
		this.solde += cred;
	}
	public void debit(int deb) {
		
	/*	if(this.solde-deb < 0 || deb < 0) {
			System.out.println("ne peut pas débiter");
			System.exit(-1);
		}*/
		this.solde -= deb;
	}
	
	public void virement(Compte dest, int montant) {
		
		this.debit(montant);
		dest.credit(montant);
	}
}
