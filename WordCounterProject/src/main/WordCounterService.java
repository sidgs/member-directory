package com.sidgs.wc.word_counter;

import java.io.InputStream;
import java.util.HashMap;

public interface WordCounterService {
	
	public HashMap<String, java.lang.Long> countWords(InputStream in);
}
