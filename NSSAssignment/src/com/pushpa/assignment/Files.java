/*
2) Write a program to scan a given folder and print the counts of files grouped by created month(i.e the month in which it is created, like Jan, Feb etc)
2.1) Write the example output of the above program first.

Sample output:
{January=8, February=9, July=10, August=11}

2.2) Then write the actual implementation.*/
package com.pushpa.assignment;

import java.io.File;
import java.time.ZoneId;
import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Files {

	public static void main(String[] args) {
  String path="D://test";  //our path
  File folder =new File(path);
  Map<String,Integer> count=new HashMap<>();
  DateFormatSymbols dfs=new DateFormatSymbols();
  if(folder.exists()&&folder.isDirectory()) {
	  for(File file:folder.listFiles()) {
		  Date date=new Date(file.lastModified());
		  LocalDate localDate=date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		  String month=dfs.getMonths()[localDate.getMonthValue()-1];
		  if(!count.containsKey(month))
			  count.put(month, 0);
		  count.put(month,count.get(month)+1 );
		  }
	  }
  System.out.println(count);
  }


}
