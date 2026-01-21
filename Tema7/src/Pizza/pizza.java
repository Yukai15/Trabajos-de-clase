package Pizza;

public class pizza {
	private String size;
	private String tipo;
	private String estado;
	
	static int totalPedidas;
	static int totalServidas;
	
	public pizza(String size, String tipo) {
		this.size=size;
		this.tipo=tipo;
		this.estado="pedidas";
	}
	public static int totalPedidas() {
		return totalPedidas;
	}
}
