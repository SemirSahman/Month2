package ba.bitcamp.vedadpredavanja.thissuper;

import java.util.Scanner;

public class PogodiBroj {
	
	public int maxBroj;
	public int maxBrojPokusaja;
	
	public PogodiBroj(int maxBroj, int maxBrojPokusaja) {
		super();
		this.maxBroj = maxBroj;
		this.maxBrojPokusaja = maxBrojPokusaja;
		
		
		
	}
	
	public PogodiBroj(int maxBroj) {
		this(maxBroj, maxBroj / 100 + 1);		
	}

	public PogodiBroj() {
		this(1000,10);
		
	}

	public void igraj(){
		int zamisljeni = (int) (Math.random() * maxBroj);

		System.out.println("Zamislio sam broj od 0 do " + maxBroj);
		int pokusaj,counter = 0 ;
		Scanner ulaz = new Scanner(System.in);
		do {
			counter++;
			pokusaj = ulaz.nextInt();
			if (pokusaj > zamisljeni) {
				System.out.println("Unesi manji broj :");
			} else if (pokusaj < zamisljeni) {
				System.out.println("Unesi veci broj :");
			}else if(pokusaj == zamisljeni){
				System.out.println("Pogodjen broj " + zamisljeni + " u " + counter
						+ " pokusaja");
				System.exit(0);
			}
		} while (pokusaj != zamisljeni && counter<maxBrojPokusaja);
		System.out.println("Izgubili ste !");
	}

}
