package com.farouk.bengharssallah.rss.extractor;

import java.util.LinkedList;

import com.farouk.bengharssallah.rss.parser.market.MarketNews;


public interface MarketRSSExtractor {
	
      public  LinkedList<MarketNews>  getMarketNews()  ;

}
