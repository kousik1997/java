package com.Ccc;
import java.util.*;
public class Colours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
			list.add("Red");//Adding object in arraylist  
			list.add("Black");  
			list.add("whight");  
			list.add("Blue");  
			//Traversing list through Iterator  
			Iterator itr=list.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			}
		
	}

}
