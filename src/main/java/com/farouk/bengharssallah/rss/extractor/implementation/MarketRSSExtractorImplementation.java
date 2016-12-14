package com.farouk.bengharssallah.rss.extractor.implementation;

import java.util.LinkedList;

import org.springframework.stereotype.Service;

import com.farouk.bengharssallah.rss.extractor.MarketRSSExtractor;
import com.farouk.bengharssallah.rss.parser.market.MarketNews;
import com.farouk.bengharssallah.rss.parser.market.MarketParser;

@Service ("marketRSSExtractor")
public class MarketRSSExtractorImplementation implements MarketRSSExtractor {
	
	private static final String market_rss = "http://moneymovesmarkets.com/journal/rss.xml";
	
	private LinkedList<MarketNews> market_news_list = null;
	

	@Override
	public LinkedList<MarketNews> getMarketNews()  {
										if(market_news_list == null){
											                market_news_list = new LinkedList<MarketNews>();
												            MarketParser parser = new MarketParser(market_rss);
												            market_news_list = parser.getNews();
								                                   }
								        return market_news_list;
	                  }

    }
