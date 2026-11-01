
public class Torre extends Pieza {

	public Torre(Color color, Casillero casillero) throws CasilleroOcupadoException {
		super(Color.BLANCO, casillero);
	}

	@Override
	public String dibujar() {
		if (color == Color.BLANCO)
			return "\u2656" ;
		else
			return "\u265C";
	}
}
