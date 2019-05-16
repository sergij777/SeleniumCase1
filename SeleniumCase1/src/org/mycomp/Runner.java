package org.mycomp;

import java.util.ArrayList;
import java.util.List;

import org.mycomp.model.Good;
import org.mycomp.service.FileWriterService;
import org.mycomp.service.Parser;
import org.openqa.selenium.WebDriver;

public class Runner {

	public static void main(String[] args) {
		Parser parser = new Parser();
		List<Good> goods = new ArrayList();
		goods = parser.selectListGoods("Смартфоны, ТВ и электроника", "Телефоны", "Смартфоны", 3);
		
		FileWriterService file = new FileWriterService();
		file.writeTextToFile("", false);
		   for (Good good : goods) {
			   String textToWrite = good.getGoodName() + "\r\n";
			   file.writeTextToFile(textToWrite, true);
		   } 
	}
}
