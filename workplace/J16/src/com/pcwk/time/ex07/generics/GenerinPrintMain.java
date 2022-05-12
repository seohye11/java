package com.pcwk.time.ex07.generics;

public class GenerinPrintMain {

	public static void main(String[] args) {
		
		//Powder type GenericPrint 생성
		//GenericPrint<Powder> powserPrinter = new GenericPrint<>();
		
		//Powder getXXX(), setXXX()
		GenericPrint<Powder> powderPrinter = new GenericPrint<Powder>();
		
		//setMaterial
		powderPrinter.setMaterial(new Powder());
		
		//getXXX()
		Powder powder = powderPrinter.getMaterial();
		
		System.out.println("powder : "+ powder);

		System.out.println(powderPrinter.toString());
		
		
		//Plastic getXXX(), setXXX()
		GenericPrint<Plastic> plasticPrint = new GenericPrint<>();
		plasticPrint.setMaterial(new Plastic());
		
		System.out.println("plastiPrint : " + plasticPrint);
		
		Plastic plastic = plasticPrint.getMaterial();
		System.out.println("plastic : "+ plastic); //plastic.toString()
		

	}

}
