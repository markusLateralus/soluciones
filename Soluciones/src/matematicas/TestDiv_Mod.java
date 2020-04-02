package matematicas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class TestDiv_Mod {

	
	
	
	@Test
public void calculaValorInvertido() {
	
	Div_Mod div=new Div_Mod();
	int entrada=345;
	int deseado=div.calculaValorInvertido(entrada);
	
	int esperado=543;
	assertEquals(deseado, esperado);
		
}
	
	@Test
	public void calcularIntercambioBilleteCheque() {
		Div_Mod div=new Div_Mod();
		int entrada=148;
		int deseado[]=div.calcularIntercambioBilleteCheque(entrada);
		int esperado[]=new int[] {3,1,0,2};
		assertArrayEquals(deseado, esperado);
				
		
	}
	
	@Test
	public void calculaExpresion() {
		Div_Mod div=new Div_Mod();
		int a=0;
		int b=0;
		int deseado=div.calculaExpresion(a, b);
		int esperado=0;
		assertEquals(deseado, esperado);
	}
	
	@Test
	public void calcularAreaYvolumenCilindro() {
		Div_Mod div=new Div_Mod();
		double altura=2.0;
		double radio=2.0;
		double[] deseado=div.calcularAreaYvolumenCilindro(radio, altura);
		double[] esperado=new double[] {50.26548245743669,25.132741228718345};
		assertArrayEquals(deseado, esperado);
	}
}
