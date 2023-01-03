package utils;

public class Calculos {
	public static final double  IOF = 0.06;
	public static double conversor(double dolar,double quantidade){
	 double real = dolar * quantidade;
	 return real += real*IOF;
	}
	
	
}
