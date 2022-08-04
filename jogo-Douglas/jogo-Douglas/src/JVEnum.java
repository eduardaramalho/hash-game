
public enum JVEnum {
	
	EMPTY,
	X,
	O;
	
	@Override
	public String toString() {
		return this.toString(" ");
	}
	
	public String toString(String defaultWhenEmpty) {
		if(this == EMPTY) {
			return defaultWhenEmpty;
		} 
		if (this == O) {
			return "O";
		}
		return "X";
	}
}
