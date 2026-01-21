package Tiempo;

public class tiempo {
	
	private int seg;

	tiempo(int seg, int min, int horas) {
	this.seg=horas*3600+min*60+seg;
	}
	tiempo(int seg) {
	this.seg=seg;
	}
	tiempo restarTiempo(tiempo t2) {
		//return tiempo=(t1.seg-t2.seg)
		int restaSegundos=this.seg-t2.seg;
		tiempo t_resta=new tiempo(restaSegundos);
		return t_resta;
	}
	tiempo sumarTiempo(tiempo t2) {
		//return tiempo=(t1.seg+t2.seg)
		int sumarSegundos=this.seg+t2.seg;
		tiempo t_suma=new tiempo(sumarSegundos);
		return t_suma;
	}
	void sumaActual(tiempo t2){
		int sumaSegundos=this.seg+ t2.seg;
	}
}
