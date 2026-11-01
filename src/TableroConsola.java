
public class TableroConsola extends TableroAbstracto {
	
	public TableroConsola() {
		this.casilleros = new Casillero[maxX][maxY];
		for (int x=0; x<maxX; x++)
			for (int y=0; y<maxY; y++) {
				this.casilleros[x][y] = new Casillero(x,y);
			}
	}

	@Override
	public void dibujar() {
		System.out.println("  1   2   3   4   5   6   7   8 ");
		for (int x=0; x<maxX; x++) {
			System.out.print((char) (x+65));
			for (int y=0; y<maxY; y++) {
				casilleros[x][y].dibujar();
			}
			System.out.println();
		}
	}

	@Override
	public Casillero getCasillero(int x, int y) {
		return casilleros[x][y];
	}
}
