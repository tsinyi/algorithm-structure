package adt.list.arrylist;

import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList();


		Iterator iter = myArrayList.iter();



		if(!iter.hasNext()){
			System.out.println(iter.next());
		}


	}
}
