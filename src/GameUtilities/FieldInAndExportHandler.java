package GameUtilities;

import GameUtilities.PlayingField;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FieldInAndExportHandler {
	
    public PlayingField importField(File saveState){
    	
    	
    	return null;
    }
    
    public void exportField(PlayingField playingField){
    	
    	  FileWriter writer;
    	  File file;
    	
    	  file = new File("FileWriterTest.txt");
    	     try {
    	   
    	       writer = new FileWriter(file ,false);
    	       
    	       for(char i : playingField.getFieldCells()){
    	    	   writer.write(i+",");
    	       }
    	       
    	       writer.flush();
    	       
    	       writer.close();
    	    } catch (IOException e) {
    	      e.printStackTrace();
    	    }
    	  }
}
