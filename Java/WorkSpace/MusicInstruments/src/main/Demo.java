package main;


import percussion.Drums;
import percussion.Tambourine;
import shop.MusicShop;
import strings.Guitar;
import strings.Violin;

public class Demo {

	public static void main(String[] args) {
		MusicShop musicWorld = new MusicShop("Music World", 150000);
		musicWorld.addInstrument(new Violin("Violin", 2000, 3));
		musicWorld.addInstrument(new Violin("Conzert violin", 2000, 6));

		musicWorld.addInstrument(new Guitar("BlackG", 1400, 5));
		musicWorld.addInstrument(new Drums("Drum-dum", 700, 5));
		musicWorld.addInstrument(new Tambourine("Tambu-bu", 1000, 10));


		System.out.println(musicWorld);
		musicWorld.sell(new Violin("Conzert violin", 0, 3) );
musicWorld.sell(new Tambourine("Tambu-bu", 0, 10) );
musicWorld.sell(new Tambourine("Tambu-bu", 0, 10) );
		System.out.println(musicWorld);

	}

}
