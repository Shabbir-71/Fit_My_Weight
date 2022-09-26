
package com.mycompany.dnd;

import java.io.*;

public class StringBuffer {
    
    public String buffer(String s) throws FileNotFoundException, IOException{
        String fileName = s;
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        String output = "";
        while((line = br.readLine()) != null){
            output += line;
            output += "\r\n";
        }
        return output;
    }
   
}
