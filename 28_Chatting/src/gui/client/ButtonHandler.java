package gui.client;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ButtonHandler implements ActionListener {
	
	ChattingService service;
	ButtonHandler(ChattingService service){
		this.service = service;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//
		FileDialog fd = new FileDialog(service.f,"파일저장", FileDialog.SAVE);
		fd.setVisible(true);
		
		String fileName = fd.getDirectory()+fd.getFile();
		try {
			fileWriting(fileName);
		}catch(Exception e1) {
			
		}		
	}//
	
	
	public void fileWriting(String filename)throws Exception {
		PrintWriter pw = new PrintWriter(new FileWriter(filename));
		pw.println(service.ta.getText());
		pw.close();
	}
}





















