package com.stackroute.pe2;

import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public String readFile(String filePath) throws IOException {
        //Read a file from the given path
        FileReader fileread=new FileReader(filePath);
        int i;
        //Intialize a empty string
        String output="";
        while((i=fileread.read())!=-1)
            output=output+((char)i);
        //Close the file after reading
        fileread.close();
        int length;
        length=output.length();
        output=output+"length is "+length;
        //Return the string after converting to uppercase
        return output.toUpperCase();
    }

}
