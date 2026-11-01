
public abstract class Pieza {

	protected final Color color;
	protected Casillero casillero;
	
	public abstract String dibujar();
	
	public Pieza(Color color, Casillero casillero) throws CasilleroOcupadoException {
		this.color = color;
		this.casillero = casillero;
		casillero.setPieza(this);
	}
}	
