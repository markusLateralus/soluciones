package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class prueba implements Comparable<prueba>{
int edad;
	public prueba(int edad) {
		this.edad=edad;
	}
public String toString() {
	return ""+ edad;
}
public static void main(String[] args) {
//	Collectionlista;
	List listado;
	
	ArrayList  <prueba>lista=new ArrayList <prueba>();
	lista.add (new prueba(3));
	lista.add (new prueba(1));
	lista.add (new prueba(2));
	
	for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
		Object object = (Object) iterator.next();
		System.out.println(object);
	}
	Collections.sort( lista);
	
	prueba nuevo=new prueba(4);
	for (ListIterator listIterator = lista.listIterator(); listIterator.hasNext();) {
		prueba prueba = (prueba) listIterator.next();
		if(prueba.compareTo(nuevo)>0) {
			listIterator.add(nuevo);
		}
	}
	for (prueba prue : lista) {
		System.out.println(prue);
	}
}


@Override
public int compareTo(prueba o) {
	// TODO Auto-generated method stub
	return 0;
}
}
