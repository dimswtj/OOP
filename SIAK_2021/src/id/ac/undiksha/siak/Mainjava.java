package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Studentjava;
import id.ac.undiksha.siak.entities.Staff;
import id.ac.undiksha.siak.entities.Lecture;
import id.ac.undiksha.siak.entities.*;

public class Mainjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Studentjava stdl = new Studentjava();
		stdl.setName("Dimmy");
		stdl.setAddress("Singaraja");
		
		//stdl.printAllInfo();
		//System.out.println(stdl.getName());
		Studentjava std2 = new Studentjava(
				"123456",
				"Budi",
				"Singaraja",
				true,
				"Computer Science",
				"Informatics",
				"FTK");
		
		std2.printAllInfo();
		
		Staff std3 = new Staff(
				"112345",
				"Tejo",
				"Singaraja",
				true,
				"FTK");

		std3.printAllInfo();
		
		Lecture std4 = new Lecture(
				"122345",
				"Dika",
				"Singaraja",
				true,
				"Informatics",
				"FTK");

		std4.printAllInfo();*/
		/*
		Person prs1 = new Person();
		prs1.setName("Adi");
		System.out.println(prs1.getName());
		
		Studentjava.std1 = new Studentjava();
		std1.setNim("12345");
		std1.printAllInfo();
		*/
		
		Person siX = new Studentjava();
		
		siX.getName();
		//siX.get
		
		//Studentjava siY = new Person();
		//Person siY = new Person("Caca","Denpasar",false);
		Studentjava siZ = new Studentjava ("12345","ILKOM","TI","FTK");
		Studentjava siA = new Studentjava ("12345","Caca","Denpasar", false,"ILKOM","TI", "FTK");
		Lecture siY = new Lecture ("13425","Andika","Singaraja",true,"TI","FTK");
		Staff siB = new Staff ("11245","Yanto","Singaraja",true,"FTK");
		siA.printAllInfo();
		siY.printAllInfo();
		siB.printAllInfo();
		
	}

}
