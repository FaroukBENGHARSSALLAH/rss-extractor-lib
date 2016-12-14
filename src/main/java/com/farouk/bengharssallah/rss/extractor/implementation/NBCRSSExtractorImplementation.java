package com.farouk.bengharssallah.rss.extractor.implementation;

import java.util.LinkedList;

import org.springframework.stereotype.Service;

import com.farouk.bengharssallah.rss.extractor.NBCRSSExtractor;
import com.farouk.bengharssallah.rss.parser.nbc.NBCNews;
import com.farouk.bengharssallah.rss.parser.nbc.NBCParser;

@Service ("nBCRSSExtractor")
public class NBCRSSExtractorImplementation implements NBCRSSExtractor {
	
	private static final String nbc_top_stories_rss = "http://www.nbcsandiego.com/news/top-stories/?rss=y&embedThumb=y&summary=y";
	private static final String nbc_sport_rss = "http://www.nbcsandiego.com/news/sports/?rss=y&embedThumb=y&summary=y";
	private static final String nbc_technology_rss = "http://www.nbcsandiego.com/news/tech/?rss=y&embedThumb=y&summary=y";
	
	private LinkedList<NBCNews> nbc_news_top_stories_list = null;
	private LinkedList<NBCNews> nbc_news_sport_list = null;
	private LinkedList<NBCNews> nbc_news_technology_list = null;
	

	@Override
	public LinkedList<NBCNews> getNBCTopStories()  {
										if(nbc_news_top_stories_list == null){
											                nbc_news_top_stories_list = new LinkedList<NBCNews>();
												            NBCParser parser = new NBCParser(nbc_top_stories_rss);
												            nbc_news_top_stories_list = parser.getNews();
								                                   }
								        return nbc_news_top_stories_list;
	                  }

	@Override
	public LinkedList<NBCNews> getNBCSportNews()  {
										if(nbc_news_sport_list == null){
											                nbc_news_sport_list = new LinkedList<NBCNews>();
												            NBCParser parser = new NBCParser(nbc_sport_rss);
												            nbc_news_sport_list = parser.getNews();
								                                    }
								        return nbc_news_sport_list;
	                   }

	@Override
	public LinkedList<NBCNews> getNBCTechnologyNews()  {
										if(nbc_news_technology_list == null){
											                 nbc_news_technology_list = new LinkedList<NBCNews>();
													         NBCParser parser = new NBCParser(nbc_technology_rss);
													         nbc_news_technology_list = parser.getNews();
								                    }
								        return nbc_news_technology_list;
	                   }

    }