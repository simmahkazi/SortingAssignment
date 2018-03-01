package com.net;
import java.util.*;

public class DataSorter {

	public String sort(String input) {
		
		HashMap<String,Object> sort=new HashMap<String,Object>();
		String ip[]=input.split(" ");
		 for(String n:ip)
				sort.put( n.split("=")[0],n.split("=")[1]);
		String key[]=new String[ip.length];
		 double value[]=new double[ip.length];
		 for(int i=0;i<ip.length;i++)
		 {	
			key[i]=ip[i].split("=")[0];
			value[i]=Float.parseFloat(ip[i].split("=")[1]);
		 }
		 String temp="";
		 double temp1=0;
		 
		
		 System.out.println();
		 for(int i=0;i<key.length;i++)
		 {
			 for(int j=0;j<key.length-i-1;j++)
			 {
				 if(value[j]<value[j+1])
				 {
					 
					 temp=key[j];
					 key[j]=key[j+1];
					 key[j+1]=temp;
					 temp1=value[j];
					 value[j]=value[j+1];
					 value[j+1]=temp1;
				 }
				 
				 else if(value[j]==value[j+1])
				 {
					 if(key[j].compareTo(key[j+1])>0)
					 {
						 temp=key[j];
						 key[j]=key[j+1];
						 key[j+1]=temp;
						 temp1=value[j];
						 value[j]=value[j+1];
						 value[j+1]=temp1;
					 }
				 }
				 
				 }
			 }
		 String output="";
		/* for(int i=0;i<key.length;i++)
		 {
			 if((Math.ceil(value[i])==Math.floor(value[i])))
			 {
				 
				 output+=(key[i]+"="+(int)value[i]+";");

			 }
			 else
			 {
				 output+=key[i]+"="+value[i]+";";
			 }	
		 
		 	}
		*/
		 for(int i=0;i<key.length;i++)
		 {
			 if((Math.ceil(value[i])==Math.floor(value[i])))
			 {
				 
				 output+=(key[i]+"="+Integer.parseInt((String)sort.get(key[i]))+";");

			 }
			 else
			 {
				 output+=key[i]+"="+sort.get(key[i])+";";
			 }	 
		 }
		
		return output;
	}

}
