package mcl;

public class CharInt implements Comparable<CharInt> {
	public Character key;
	public Integer val;

	public CharInt(Character key, Integer val) {

		this.key = key;
		this.val = val;
	}

	@Override
	public int compareTo(CharInt arg0) {
		if (this.val.equals(arg0.val)) {
			return this.key.compareTo(arg0.key);
		}
		return (arg0.val - this.val);
	}

	@Override
	public String toString() {
		return (key != null ? key + ": " : "") + (val != null ? val : "");
	}

}
