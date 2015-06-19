package ba.bitcamp.vedadpredavanja.thissuper;

import java.util.Scanner;

public class Igrica {
	
	public static void main(String[] args) {
		int maxBroj = 100;
		int zamisljeni = (int) (Math.random() * maxBroj);

		System.out.println("Zamislio sam broj od 0 do " + maxBroj);
		int pokusaj,counter = 0, maxBrojPokusaja = maxBroj/100 + 1;
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
				break;
			}
		} while (pokusaj != zamisljeni && counter<=maxBrojPokusaja);
		System.out.println("Izgubili ste !");
		

	}

}
