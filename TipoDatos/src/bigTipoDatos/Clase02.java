package bigTipoDatos;
import java.awt.List;
import java.math.*;
import java.util.ArrayList;


public class Clase02 {
	
	public static void main(String[] args) {
		
		BigDecimal  bigDecimal1=new BigDecimal(5);
		BigDecimal  bigDecimal2=new BigDecimal("7");
		bigDecimal1=bigDecimal2;
		
		if(bigDecimal1==bigDecimal2) {
			System.out.println("Las posiciones de memoria son iguales");			
		}else {
			System.out.println("Las posiciones de objetos en memoria son diferentes");
		}
		System.out.println(bigDecimal1);
		System.out.println(bigDecimal2);
		
		BigDecimal  bigDecimal3=new BigDecimal(5);
		BigDecimal  bigDecimal4=new BigDecimal("5");
		
		if(bigDecimal3.compareTo(bigDecimal4)==0) {
			System.out.println("Los valores son iguales");
		}else {
			System.out.println("Los valores son diferentes");
		}
		
		Integer entero=new Integer("5");
		
		if(entero.intValue()==bigDecimal2.intValue()) {
			System.out.println("Los valores son iguales");
		}
		
		String cadena1=new String("Cadena");
		String cadena2=new String("Cadena");
		
		if(cadena1.equals(cadena2)){
			System.out.println("Textos iguales");
		}else {
			System.out.println("Textos diferentes");
		}
		
		Integer numero=new Integer(10);
		float  flotante=numero.floatValue();
		BigDecimal bigFloat=new BigDecimal(flotante);
		
		String[] cadenas1=new String[]{"valor1","valor2"};
		String[] cadenas2=new String[5];
		cadenas1[0]="valor3";
		System.out.println(cadenas1[0]);
		
		ArrayList<String> lista=new ArrayList<String>();
		lista.add("cadenas1");
		lista.add("cadenas2");
		
		ArrayList<Integer> listaNumero=new ArrayList<Integer>();
		listaNumero.add(15);
		listaNumero.add(20);
		
		ArrayList<Object> listaObject= new ArrayList<Object>();
		listaObject.add(15);
		listaObject.add("Objetocadena");
		
		for(Object obj: listaObject) {
			System.out.println(obj.toString());
		}
		
		for(Object obj: listaObject) {
		
			if(obj instanceof Integer) {
				System.out.println("Es entero");
			}
			if(obj instanceof String) {
				System.out.println("Es cadena");
			}
			System.out.println(obj.toString());
		}
		
		Integer[][] entertoMatriz=new Integer[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				entertoMatriz[i][j]=i+j;
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(""+entertoMatriz[i][j]);
			}
			System.out.println("\n");
		}
		
	}

}
