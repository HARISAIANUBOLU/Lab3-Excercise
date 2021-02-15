package org;
import java.io.*;

public class CountType {
	public static void main(String[] args) throws IOException 
    { 
        File file = new File("E:\\CAPG TRAINING\\labx3.text"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          
        String line; 
          
        // Initializing counters 
        int Wordcount = 0; 
        int sentenceCount = 0; 
        int charCount = 0; 
        int paraCount = 1; 
        int whitespaceCount = 0; 
          
        // Reading line by line from the  
        // file until a null is returned 
        while((line = reader.readLine()) != null) 
        { 
            if(line.equals("")) 
            { 
                paraCount++; 
            } else { 
                charCount += line.length(); 
                  
                // \\s+ is the space delimiter in java 
                String[] wordList = line.split("\\s+"); 
                  
                Wordcount += wordList.length; 
                whitespaceCount += Wordcount -1; 
                  
                // [!?.:]+ is the sentence delimiter in java 
                String[] sentenceList = line.split("[!?.:]+"); 
                  
                sentenceCount += sentenceList.length; 
            } 
        } 
          
        System.out.println("Total number of words = " + Wordcount); 
        System.out.println("Total no. of sentences = " + sentenceCount); 
        System.out.println("Total number of characters = " + charCount); 
        System.out.println("Total paragraphs = " + paraCount); 
        System.out.println("Number of whitespaces = " + whitespaceCount); 
        reader.close();
    } 
}
