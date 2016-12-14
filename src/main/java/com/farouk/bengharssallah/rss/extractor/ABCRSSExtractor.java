package com.farouk.bengharssallah.rss.extractor;

import java.util.LinkedList;

import com.farouk.bengharssallah.rss.parser.abc.ABCINews;
import com.farouk.bengharssallah.rss.parser.abc.ABCNews;


public interface ABCRSSExtractor {
	
         public  LinkedList<ABCNews>  getABCTopStories()  ;
         
         public  LinkedList<ABCNews>  getABCWorldNews()  ;
	
	     public  LinkedList<ABCNews>  getABCSportNews()  ;
	     
	     public  LinkedList<ABCNews>  getABCEntertainmentNews()  ;
	     
	     public  LinkedList<ABCNews>  getABCArtsNews()  ;
	     
	     public  LinkedList<ABCNews>  getABCCommunityNews()  ;
	     
	     public  LinkedList<ABCNews>  getABCFamilyNews()  ;
	     
	     public  LinkedList<ABCNews>  getABCMusicNews()  ;
	     
	     public  LinkedList<ABCNews>  getABCMoneyNews()  ;
	     
	     public  LinkedList<ABCINews>  getABCITechnologyNews()  ;

}
