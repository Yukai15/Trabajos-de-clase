import java.util.Scanner;

public class PrecioDeCompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		final int VIP=1;
		final int Regular=2;
		System.out.println("Tipo de cliente [1 VIP],[2 Regular]");
		int TipoCliente=leer.nextInt();
		System.out.println("Importe de la compra: ");
		double importe=leer.nextDouble();
		System.out.println("Es fin de semana? [0 No], [1 Sí]");
		boolean Finde=(leer.nextInt()==1);//Boolear Finde=leer.nextboolear();
		
		double descuento=0;
		if(TipoCliente==VIP && importe>100) {
			descuento=0.10;
		}
		else if(TipoCliente==Regular && importe>200 ) {
			descuento=0.05;
		}
		double importeTotal= importe - (descuento * importe);
		
		if (importe < 50) {
			importeTotal= 2 + importeTotal;
		}
		if (TipoCliente==VIP && importe >150 && Finde==true) {
			System.out.println("Oferta especial");
		}
		
		System.out.println("El impote total es de : " + importeTotal);
		leer.close();
	}

}
