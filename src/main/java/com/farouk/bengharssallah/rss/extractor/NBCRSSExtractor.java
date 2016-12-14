package com.farouk.bengharssallah.rss.extractor;

import java.util.LinkedList;

import com.farouk.bengharssallah.rss.parser.nbc.NBCNews;


public interface NBCRSSExtractor {
	
			    public  LinkedList<NBCNews>  getNBCTopStories()  ;
				
				public  LinkedList<NBCNews>  getNBCSportNews()  ;
				
				public  LinkedList<NBCNews>  getNBCTechnologyNews()  ;

}
