
public class Casillero {
	
	private final int x,y;
	private Pieza pieza;
//	private final Color color;
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_YELLOW = "\u001B[33m";
	private static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	
	public Casillero(int x, int y) {
		this.x = x;
		this.y = y;
		this.pieza = null;
	}

	public void setPieza(Pieza pieza) throws CasilleroOcupadoException {
		if (this.pieza != null)
			throw new CasilleroOcupadoException(pieza.dibujar());
		this.pieza = pieza;
	}
	
	public void dibujar() {
		
		String piezaDibujo = pieza != null ? pieza.dibujar() : " ";
		
		if (((x+y)% 2) == 0)
			System.out.print(ANSI_RED_BACKGROUND+"|" + piezaDibujo + "|"+ANSI_RESET);
		else
			System.out.print(ANSI_YELLOW_BACKGROUND+"|" + piezaDibujo + "|"+ANSI_RESET);
	}

}
