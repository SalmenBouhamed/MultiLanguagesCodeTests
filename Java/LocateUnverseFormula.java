package com.practice.main;

import java.io.File;

public class LocateUnverseFormula {

	public String locate_universe_formula(File dir,String afile){
		
		 String fileFounded = "file not found"; 
		
//		 File dir = new File("/tmp/documents");
		 File[] children = dir.listFiles();
		 for (File file : children) {
			if(file.isDirectory()) {
				fileFounded = locate_universe_formula(file,afile);
			}else {
				if (afile.equals(file.getName())){
					fileFounded = file.getAbsolutePath();
					System.out.println(file.getName());
					return fileFounded;
				}
			}
		}
		return fileFounded;
	}

}
