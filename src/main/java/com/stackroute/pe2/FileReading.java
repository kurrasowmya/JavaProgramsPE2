package com.stackroute.pe2;

import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public String readFile(String filePath) throws IOException {
        FileReader fileread=new FileReader(filePath);
        int i;
        String output="";
        while((i=fileread.read())!=-1)
            output=output+((char)i);
        fileread.close();
        int length;
        length=output.length();
        output=output+"length is "+length;
        return output.toUpperCase();
    }

}
