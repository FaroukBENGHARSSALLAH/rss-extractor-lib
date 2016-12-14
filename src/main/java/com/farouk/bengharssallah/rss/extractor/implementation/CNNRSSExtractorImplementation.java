package com.farouk.bengharssallah.rss.extractor.implementation;

import java.util.LinkedList;

import org.springframework.stereotype.Service;

import com.farouk.bengharssallah.rss.extractor.CNNRSSExtractor;
import com.farouk.bengharssallah.rss.parser.cnn.CNNINews;
import com.farouk.bengharssallah.rss.parser.cnn.CNNIParser;
import com.farouk.bengharssallah.rss.parser.cnn.CNNNews;
import com.farouk.bengharssallah.rss.parser.cnn.CNNParser;


@Service ("cNNRSSExtractor")
public class CNNRSSExtractorImplementation implements CNNRSSExtractor {
	
	private static final String cnn_top_stories_rss = "http://rss.cnn.com/rss/edition.rss?format=xml";
	private static final String cnn_world_rss = "http://rss.cnn.com/rss/edition_world.rss?format=xml";
	private static final String cnn_sport_rss = "http://rss.cnn.com/rss/edition_sport.rss?format=xml";
	private static final String cnn_technology_rss = "http://rss.cnn.com/rss/edition_technology.rss?format=xml";
	private static final String cnn_travel_rss = "http://rss.cnn.com/rss/edition_travel.rss?format=xml";
	
	private LinkedList<CNNNews> cnn_news_top_stories_list = null;
	private LinkedList<CNNNews> cnn_news_world_list = null;
	private LinkedList<CNNNews> cnn_news_sport_list = null;
	private LinkedList<CNNINews> cnn_news_technology_list = null;
	private LinkedList<CNNNews> cnn_news_travel_list = null;
	
	@Override
	public LinkedList<CNNNews> getCNNTopStories()  {
		                              if(cnn_news_top_stories_list == null){
		                            	                           cnn_news_top_stories_list = new LinkedList<CNNNews>();
		                                                           CNNParser parser = new CNNParser(cnn_top_stories_rss);
		                                                           cnn_news_top_stories_list = parser.getNews();
		                                                 }
		                              return cnn_news_top_stories_list;
	                        }
	
	
	@Override
	public LinkedList<CNNNews> getCNNWorldNews()  {
										if(cnn_news_world_list == null){
											                        cnn_news_world_list = new LinkedList<CNNNews>();
											                        CNNParser parser = new CNNParser(cnn_world_rss);
														            cnn_news_world_list = parser.getNews();
														 }
								       return cnn_news_world_list;
						    }
									
	
	@Override
	public LinkedList<CNNNews> getCNNSportNews()  {
									  if(cnn_news_sport_list == null){
										                          cnn_news_sport_list = new LinkedList<CNNNews>();
										                          CNNParser parser = new CNNParser(cnn_sport_rss);
														          cnn_news_sport_list = parser.getNews();
							                              }
							          return cnn_news_sport_list;
	                          }
	
	
	@Override
	public LinkedList<CNNINews> getCNNTechnologyNews()  {
									  if(cnn_news_technology_list == null){
										                          cnn_news_technology_list = new LinkedList<CNNINews>();
														          CNNIParser iparser = new CNNIParser(cnn_technology_rss);
														          cnn_news_technology_list = iparser.getNews();
							                              }
							          return cnn_news_technology_list;
	                          }


	@Override
	public LinkedList<CNNNews> getCNNTravelNews()  {
									  if(cnn_news_travel_list == null){
										                          cnn_news_travel_list = new LinkedList<CNNNews>();
										                          CNNParser parser = new CNNParser(cnn_travel_rss);
														          cnn_news_travel_list = parser.getNews();
							                                }
							          return cnn_news_travel_list;
							   }

            }