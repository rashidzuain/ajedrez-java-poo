import java.util.ArrayList;

public class Juego {
	
	private ITablero tablero;
	private final ArrayList<Pieza> piezas; 

	public Juego() {
		piezas = new ArrayList<>();
		iniciar();
	}
	
	public void iniciar() {
		tablero = new TableroConsola();
		tablero.dibujar();
		try {
			piezas.add(new Torre(Color.BLANCO, tablero.getCasillero(1,1)));
		} catch (CasilleroOcupadoException e) {
			System.out.println("Casillero Ocupado!! "+e.getMessage());
		}
		tablero.dibujar();
		try {
			piezas.add(new Torre(Color.NEGRO, tablero.getCasillero(1,1)));
		} catch (CasilleroOcupadoException e) {
			System.out.println("Casillero Ocupado!! "+e.getMessage());
		}
		tablero.dibujar();
				
	}
}
