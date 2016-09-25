package com.sidgs.wc.word_counter;

import java.io.InputStream;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
	public WordCounterService wcs;
	WordCountAggregatorService wcas;
	WordCountPrinter wcp;
	
	
    public static void main( String[] args )
    {
    	
    	App a = new App();
   
    	
    	for(int i = 0; i<args.length;i++){
    		InputStream in = Util.readFile(args[i] ;
    		HashMap<String, Long> wc = a.wcs.countWords(in);  		
    	}
        System.out.println( "Hello World!" );
    }
}


