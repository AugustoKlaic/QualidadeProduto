public enum tipos {
	EQUILATERO(1), ESCALENO(2), ISOSCELES(3), INVALIDO(4);
	
	private final int value;
	
	tipos(int v) {
		this.value = v;
	}
	
	public int value() { return value;}
	
	

}
