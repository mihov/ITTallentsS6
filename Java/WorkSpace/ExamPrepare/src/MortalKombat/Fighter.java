package MortalKombat;

import java.util.Random;

public class Fighter {
	private final int MIN_LIVE = 0;
	private final int MAX_LIVE = 100;

	private final int MIN_PROTECTION = 0;
	private final int MAX_PROTECTION = 100;

	private final int MIN_POWER = 0;
	private final int MAX_POWER = 100;

	private final int MIN_Proficiency = 0;
	private final int MAX_Proficiency = 100;

	private int life;
	private int protection;
	private int power;
	private int proficiency;
	private Fighter enemy;
	private String name;
	private Random rnd;

	public Fighter(String name, int life, int protection, int power, int proficiency) {
		this.setLife(life);
		this.setProtection(protection);
		this.setPower(power);
		this.setProficiency(proficiency);
		this.setName(name);
		rnd = new Random();
	}

	public Fighter getEnemy() {
		return enemy;
	}

	public boolean alive() {
		return this.life > 0;
	}

	public void setEnemy(Fighter enemy) {
		if (enemy != null) {
			this.enemy = enemy;
			// this.enemy.setEnemy(this);
		}
	}

	public int getLife() {
		return life;
	}

	public int getProtection() {
		return protection;
	}

	public int getPower() {
		return power;
	}

	public String getName() {
		return name;
	}

	public int getProficiency() {
		return this.proficiency;
	}

	private void setLife(int life) {
		if (life <= this.MAX_LIVE && life >= this.MIN_LIVE)
			this.life = life;
		if (life < 0) {
			this.life = 0;
		}
	}

	private void setProtection(int protection) {
		if (life <= this.MAX_PROTECTION && life >= this.MIN_PROTECTION)
			this.protection = protection;
	}

	private void setProficiency(int proficiency) {
		if (proficiency <= this.MAX_Proficiency && proficiency >= this.MIN_Proficiency)
			this.proficiency = proficiency;
	}

	private void setPower(int power) {
		if (life <= this.MAX_POWER && life >= this.MIN_POWER)
			this.power = power;
	}

	private void setName(String name) {
		if (name.length() > 0)
			this.name = name;
	}

	public void doHit() {
		if (this.alive()) {
			System.out.println(this.getName() + "\t[" + this.getLife() + "]\t > hit.");
			this.getEnemy().punched(this.getPower());
		}
	}

	public void punched(int power) {
		System.out.print(this.getName() + "\t[" + this.getLife() + "]\t > ");

		if (this.doDodge()) {
			System.out.println("dodge.");
		} else {
			if (this.doBlock()) {
				System.out.println("block.");
				this.setLife(this.getLife() - (int) (power / 100f * this.getProtection()));
			} else {
				System.out.println("punched.");
				this.setLife(this.getLife() - power);
			}
		}

		if (this.doCounterAttack()) {
			System.out.println("[counterattack].");
			this.doHit();
		}
	}

	private boolean doDodge() {
		return this.rnd.nextInt(this.MAX_LIVE + this.MAX_PROTECTION) < this.life + this.getProtection();
	}

	private boolean doBlock() {
		return this.rnd.nextInt(this.MAX_PROTECTION) < this.getProtection();
	}

	private boolean doCounterAttack() {
		return this.rnd.nextInt(this.MAX_Proficiency + this.MAX_LIVE + this.MAX_POWER) < (this.getProficiency()
				+ this.getLife() + this.getPower());
	}

}
/*
 * INTELLIGENCE
 * 
 * The ability to think and process information 1 = Slow / Impaired 2 = Normal 3
 * = Learned 4 = Gifted 5 = Genius 6 = Super-Genius 7 = Omniscient
 * 
 * STRENGTH
 * 
 * The maximum ability to lift (press) weight over one's head (under optimal
 * conditions) 1 = Weak: cannot lift own body weight. 2 = Normal: able to lift
 * over own body weight, up to twice own body weight. 3 = Peak human: able to
 * lift over twice own body weight, up to 800 lbs. 4 = Superhuman: Able to lift
 * over 800 lbs., up to 25 tons. This range includes "enhanced human" (800 lbs
 * to 2 tons), Class 10 (2 tons to 10 tons) and Class 25 (10 tons to 25 tons). 5
 * = Superhuman: Able to lift over 25 tons, up to 75 tons. This range includes
 * Class 50 (up to 50 tons) and Class 75 (up to 75 tons). 6 = Superhuman: Able
 * to lift over 75 tons, up to 100 tons. 7 = Incalculable: Able to lift in
 * excess of 100 tons.
 * 
 * SPEED The ability to move over land by running or flight 1 = Below normal 2 =
 * Normal 3 = Subsonic Superhuman: peak velocity below Mach-1 (approximately 760
 * miles per hour) 4 = Speed of sound: peak velocity between Mach-1 to Mach-2 5
 * = Supersonic: peak velocity between Mach-2 to Orbital Velocity approximately
 * 17,000 mph) 6 = Speed of light: peak velocity up to 186,000 miles per second
 * 7 = Warp speed: transcending light speed or a teleporter(instantaneous
 * travel)
 * 
 * DURABILITY The ability to resist or recover from bodily injury 1 = Weak 2 =
 * Normal 3 = Enhanced 4 = Regenerative 5 = Bulletproof 6 = Superhuman 7 =
 * Virtually indestructible
 * 
 * ENERGY PROJECTION The ability to discharge energy 1 = None 2 = Ability to
 * discharge energy on contact 3 = Short range, short duration, single energy
 * type 4 = Medium range, medium duration, single energy type 5 = Long range,
 * long duration, single energy type 6 = Able to discharge multiple forms of
 * energy 7 = Virtually unlimited command of all forms of energy FIGHTING
 * ABILITY
 * 
 * Proficiency (skill) in combat 1 = Poor 2 = Normal 3 = Some training 4 =
 * Experienced fighter 5 = Master of a single form of combat 6 = Master of
 * several forms of combat 7 = Master of virtually all conventional forms of
 * combat
 * 
 * 
 * 
 * More on Marvel.com:
 * http://marvel.com/universe/OHOTMU:Power_Grids#ixzz4EnGp7dqA
 */