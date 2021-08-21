package com.chatbot.chatBot;
import java.io.File;
import org.alicebot.ab.*;
import org.alicebot.ab.utils.*;

public class VmxCB {	    
	    private static final boolean TRACE_MODE=false;
	    public static void main(String args[]){
	        String textline="";
	        String resourcepath=getpath();
	        MagicBooleans.trace_mode=TRACE_MODE;
	        Bot b=new Bot("super",resourcepath);
	        Chat chatsession=new Chat(b);
	        while(true) {
	            System.out.println("User: ");
	            textline=IOUtils.readInputTextLine();
	            if(textline==null || textline.length()<1) {
	                textline=MagicStrings.null_input;
	            } else if(textline.equals("q")) {
	                System.exit(0);
	            } else {
	                String request=textline;
	                String response=chatsession.multisentenceRespond(request);
	                System.out.println("BotGaladiano: "+response);
	            }
	        }
	    }
	    private static String getpath() {
	        File currd=new File(".");
	        String path=currd.getAbsolutePath();
	        String resourcepath=path + File.separator+"src"+File.separator+"main"+File.separator+"resources";
	        return resourcepath;
	    }
	}
	
