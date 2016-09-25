package com.sidgs.wc.word_counter;

import java.util.HashMap;
import java.util.List;

public interface WordCountAggregatorService {
	
	public HashMap<String, java.lang.Long> aggregator(List<HashMap<String, java.lang.Long>> list  );

}
