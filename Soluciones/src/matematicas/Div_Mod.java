package matematicas;

public class Div_Mod {

	
	
	//DIV, es el operador parte entera de la división --> /
	//MOD, es el operador que devuelve el residuo de una división  -->  %
	
	
	/*
	 * 
	 * ingresar un valor de 3 cifras y obtener el inverso de dicho numero
	 */

	public int calculaValorInvertido(int entrada) {
		//entrada=734;
		int modUnidades=entrada%10;  //calcula mod unidades

		int decenas=entrada/10;  //73
		int modDecenas=decenas%10; //3

		int centenas=entrada/100;  //7
		int modCentenas=centenas%10;

		int salida=modUnidades*100+modDecenas*10+modCentenas;
		return salida;
	}
		
	
	
	/*
	 * calcule el número de billetes de 20,10,5,1 dolares que necesita para cambiar un cheque
	 * considere que el valor del cheque es un numero entero
	 */
	
	public int [] calcularIntercambioBilleteCheque(int entrada) {
	
		//entrada=147;
	int unidades=entrada%10;  //sacamos el 7
		int modBilletes1=0;
		int modBilletes5=0;
		if(unidades>=5 && unidades<=9) {
			 modBilletes5=unidades/5;
			 modBilletes1=unidades%5;  //nos da 2
		}
		
		int dosCifras=entrada/10;   //sacamos el 13
		int decenas=dosCifras%10; // 3
		int modBilletes10=0;
		int modBilletes20=0;
		if(decenas>=2) {
			modBilletes20=decenas/2;
			modBilletes10=decenas%2;
		}

	System.out.println(entrada);	
	System.out.println("total billetes un dolar " + modBilletes1);   //2
	System.out.println("total billetes cinco dolar " + modBilletes5); 
	System.out.println("total billetes diez dolar " + modBilletes10);
	System.out.println("total billetes veinte dolar " + modBilletes20);
		int resultado[]=new int[]{modBilletes1, modBilletes5, modBilletes10, modBilletes20};
	return resultado;
	}
		

	/*
	 * escribe el resultado de la expresion:   (A+B)^2      ==a2+ b2 + 2ab 
	 *                                        --------- 
	 *                                        	 3
	 */
	
	public int calculaExpresion(int a, int b) {	
		int resultado=0;
		int formula=(int) ((Math.pow(a,2) + Math.pow(b, 2) + (2*a*b)));
		resultado=formula/3;
		return resultado;
	}
		
	
	/* calcula el ara y el volumnen de un cilindo
	 * conociendo el radio y la altura del cilindro
	 * 
	 * 
	 */
	public double[] calcularAreaYvolumenCilindro(double radio, double altura) {
		double formulaAreaCilindro= 2* Math.PI * radio* (radio + altura);
		double formulaVolumenCilindro= Math.PI * Math.pow(radio, 2) * altura;
		
		double area=formulaAreaCilindro;
		double volumen= formulaVolumenCilindro;
		double[] resultado=new double[] {area, volumen};
		return resultado;
	}
	/*
	 * una persona compró una estancia en un pais sudamericano.La estensión de la estancia está en acres
	 * construya un algoritmo, tal que dado como dato la extensioón del campo en "acres",
	 * calcule e imprima la extensión del mismo en hectáreas;
	 * 
	 * un acre=4042 m cuadrados
	 * una hectarea= 10000 m cuadrados
	 */
	
	public double convertidorHectarea(int acre) {
		
		final int acreEnMetrosCuadrados=4042;
		final int hectareaEnMetrosCuadrados=10000;
		//double diferenciaHectariaAcre=(double)(hectareaEnMetrosCuadrados/acreEnMetrosCuadrados);
		
		double hectarea=(double)(acre*acreEnMetrosCuadrados)/ hectareaEnMetrosCuadrados;
		return hectarea;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Div_Mod div=new Div_Mod();
	
		
		//System.out.println(resultado);
	}
	
}

