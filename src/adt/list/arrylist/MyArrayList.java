package adt.list.arrylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MyArrayList {


	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		ListIterator<String> stringListIterator = list.listIterator();

	}


	public void method(){

		 class Inner {
			 int i=1;

			 public void getInfo(){
				 System.out.println(i);
			 }
		}

		new Inner().getInfo();

	}


	public MyListIterator iter(){
		return new MyListIterator();
	}


	public class MyListIterator implements Iterator<String>{

		@Override
		public boolean hasNext() {
			return false;
		}

		@Override
		public String next() {
			return "OK";
		}
	}

}
