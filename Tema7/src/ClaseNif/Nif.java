package ClaseNif;

public class Nif {
	long numero;
	char letra;
	Nif(){
		this.numero=0;
		this.letra=' ';
		
	}
	Nif(int numDni){
		this.letra=calcularletra();
		this.numero=numDni;
		}
	char calcularletra(){
		char[]letras= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int num =(int) (this.numero % 23);
		return this.letra=letras[num];
	}
	public void mostrar() {
		System.out.println(String.format("%08d-%s",this.numero, this.letra));
	}
}
