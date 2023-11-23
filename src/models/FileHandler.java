/*
 * File: FileHandler.java
 * Created Date: 2020-09-15
 * Author: Nagy János
 * Github: https://github.com/Tomasman05
 * Copyright (c) 2020-2022 Nagy János
 * refaktor: Vitovszki Tamás
 * GNU GPL v2
 */
package models;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileHandler {
    String fileName;
    public FileHandler() {
        this.fileName = "adat.txt";
    }

    
    public void writeFile(String line) {
        try {
            tryWriteFile(line);
        } catch (IOException e) {
            System.err.println("Hiba, a fájlba írás sikertelen.");
        }
    }
    public void tryWriteFile(String line) throws IOException{
        
        FileWriter fw = new FileWriter(this.fileName, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(line);
        pw.close();
    }
}
