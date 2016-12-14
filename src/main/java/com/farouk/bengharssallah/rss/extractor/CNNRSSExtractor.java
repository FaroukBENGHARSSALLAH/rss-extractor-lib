package com.farouk.bengharssallah.rss.extractor;

import java.util.LinkedList;

import com.farouk.bengharssallah.rss.parser.cnn.CNNINews;
import com.farouk.bengharssallah.rss.parser.cnn.CNNNews;


public interface CNNRSSExtractor  {
	
	public  LinkedList<CNNNews>  getCNNTopStories()  ;
	
	public  LinkedList<CNNNews>  getCNNWorldNews()  ;
	
	public  LinkedList<CNNNews>  getCNNSportNews()  ;
	
	public  LinkedList<CNNINews>  getCNNTechnologyNews()  ;
	
	public  LinkedList<CNNNews>  getCNNTravelNews()  ;

}
