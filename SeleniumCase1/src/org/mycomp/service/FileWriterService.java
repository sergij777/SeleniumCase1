package org.mycomp.service;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterService {

 private final String filePath;

 public FileWriterService() {
	 filePath = System.getProperty("user.dir") + 
			 System.getProperty("file.separator") +
			 "nameGoods.txt";	
 }
 
 public synchronized void writeTextToFile(String text, boolean toClean) {	 
	 FileWriter writer = null;
	 try {
		 writer = new FileWriter(filePath, toClean);
		 writer.write(text);
		 writer.flush();
	 } catch (IOException e) {
		 e.printStackTrace();
	 } finally {
		 try {
			 writer.close();
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	 }
 }
}
