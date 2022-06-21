package resume_matcher;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.io.FilenameUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;





public class Main {

	//static String path  = "C:\\Users\\SWLAXMIK\\eclipse-workspace\\pdf_reader\\Data\\sample.pdf";
	
	static String path = "";
	public static void main(String[] args) throws Exception {
   
		String s1 = "pdf";
		String s2 = "docx";
		String s3 = "txt";
		
		Scanner sc = new Scanner(System.in);	
	       path = sc.nextLine();
	      System.out.println("Path for resume file :-" +path);
		
		String ext1 = FilenameUtils.getExtension(path);
		System.out.println("Resume Format is :-" +ext1);
		
		if (ext1.equals(s1))
		{
			pdf_data_reader p = new pdf_data_reader();
		     p.example();
		}
		
		else if(ext1.equals(s2)) 
		{ 
			Word_File_Reader q = new Word_File_Reader();
			q.example1();
		}
		
		else if(ext1.equals(s3))
		{
			Text_File_Reader r = new Text_File_Reader();
			r.example2();
		}
		
		else {
			System.out.println("Sorry ");
		}
		 
		
		






}
}
