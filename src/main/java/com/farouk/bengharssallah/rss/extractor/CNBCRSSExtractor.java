package com.farouk.bengharssallah.rss.extractor;

import java.util.LinkedList;

import com.farouk.bengharssallah.rss.parser.cnbc.CNBCNews;


public interface CNBCRSSExtractor {
	
     public  LinkedList<CNBCNews>  getCNBCTopStories()  ;
	
	 public  LinkedList<CNBCNews>  getCNBCMoneyNews()  ;

}
