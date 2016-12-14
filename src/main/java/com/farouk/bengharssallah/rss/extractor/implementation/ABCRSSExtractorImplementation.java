package com.farouk.bengharssallah.rss.extractor.implementation;

import java.util.LinkedList;

import org.springframework.stereotype.Service;

import com.farouk.bengharssallah.rss.extractor.ABCRSSExtractor;
import com.farouk.bengharssallah.rss.parser.abc.ABCINews;
import com.farouk.bengharssallah.rss.parser.abc.ABCIParser;
import com.farouk.bengharssallah.rss.parser.abc.ABCNews;
import com.farouk.bengharssallah.rss.parser.abc.ABCParser;

@Service ("aBCRSSExtractor")
public class ABCRSSExtractorImplementation implements  ABCRSSExtractor {
	
	private static final String abc_top_stories_rss = "http://www.abc.net.au/news/feed/45910/rss.xml";
	private static final String abc_world_news_rss = "http://www.abc.net.au/news/feed/52278/rss.xml";
	private static final String abc_sport_rss = "http://www.abc.net.au/radionational/feed/2891138/rss.xml";
	private static final String abc_entertainment_rss = "http://www.abc.net.au/news/feed/46800/rss.xml";
	private static final String abc_arts_rss = "http://www.abc.net.au/radionational/feed/2895774/rss.xml";
	private static final String abc_community_rss = "http://www.abc.net.au/radionational/feed/2889882/rss.xml";
	private static final String abc_family_rss = "http://www.abc.net.au/radionational/feed/2894880/rss.xml";
	private static final String abc_music_rss = "http://www.abc.net.au/radionational/feed/2886252/rss.xml";
	private static final String abc_money_rss = "http://www.abc.net.au/news/feed/51892/rss.xml";
	
	private static final String abci_technology_rss = "http://feeds.abcnews.com/abcnews/technologyheadlines";
	
	private LinkedList<ABCNews> abc_news_top_stories_list = null;
	private LinkedList<ABCNews> abc_news_world_list = null;
	private LinkedList<ABCNews> abc_news_sport_list = null;
	private LinkedList<ABCNews> abc_news_entertainment_list = null;
	private LinkedList<ABCNews> abc_news_arts_list = null;
	private LinkedList<ABCNews> abc_news_community_list = null;
	private LinkedList<ABCNews> abc_news_family_list = null;
	private LinkedList<ABCNews> abc_news_music_list = null;
	private LinkedList<ABCNews> abc_news_money_list = null;
	
	private LinkedList<ABCINews> abci_news_money_list = null;

	@Override
	public LinkedList<ABCNews> getABCTopStories()  {
									 if(abc_news_top_stories_list == null){
										                 abc_news_top_stories_list = new LinkedList<ABCNews>();
											             ABCParser parser = new ABCParser(abc_top_stories_rss);
											             abc_news_top_stories_list = parser.getNews();
							                                          }
							         return abc_news_top_stories_list;
	                      }
	
	@Override
	public LinkedList<ABCNews> getABCWorldNews()  {
									 if(abc_news_world_list == null){
										                 abc_news_world_list = new LinkedList<ABCNews>();
											             ABCParser parser = new ABCParser(abc_world_news_rss);
											             abc_news_world_list = parser.getNews();
											                          }
									 return abc_news_world_list;
						  }

	
	

	@Override
	public LinkedList<ABCNews> getABCSportNews()  {
									 if(abc_news_sport_list == null){
										                  abc_news_sport_list = new LinkedList<ABCNews>();
										                  ABCParser parser = new ABCParser(abc_sport_rss);
												          abc_news_sport_list = parser.getNews();
											                            }
							        return abc_news_sport_list;
						 }

	@Override
	public LinkedList<ABCNews> getABCEntertainmentNews()  {
									if(abc_news_entertainment_list == null){
										                    abc_news_entertainment_list = new LinkedList<ABCNews>();
												            ABCParser parser = new ABCParser(abc_entertainment_rss);
												            abc_news_entertainment_list = parser.getNews();
							                                              }
							       return abc_news_entertainment_list;
	                    }

	@Override
	public LinkedList<ABCNews> getABCArtsNews()  {
									if(abc_news_arts_list == null){
															abc_news_arts_list = new LinkedList<ABCNews>();
												            ABCParser parser = new ABCParser(abc_arts_rss);
												            abc_news_arts_list = parser.getNews();
							                                                }
							         return abc_news_arts_list;
	                     }

	@Override
	public LinkedList<ABCNews> getABCCommunityNews()  {
									 if(abc_news_community_list == null){
															 abc_news_community_list = new LinkedList<ABCNews>();
												             ABCParser parser = new ABCParser(abc_community_rss);
												             abc_news_community_list = parser.getNews();
							                                                }
							         return abc_news_community_list;
	                      }

	@Override
	public LinkedList<ABCNews> getABCFamilyNews()  {
									 if(abc_news_family_list == null){
															 abc_news_family_list = new LinkedList<ABCNews>();
												             ABCParser parser = new ABCParser(abc_family_rss);
												             abc_news_family_list = parser.getNews();
							                                                }
							          return abc_news_family_list;
	                     }

	@Override
	public LinkedList<ABCNews> getABCMusicNews()  {
									  if(abc_news_music_list == null){
										                    abc_news_music_list = new LinkedList<ABCNews>();
												            ABCParser parser = new ABCParser(abc_music_rss);
												            abc_news_music_list = parser.getNews();
												                           }
								      return abc_news_music_list;
	                      }

	@Override
	public LinkedList<ABCNews> getABCMoneyNews()  {
									  if(abc_news_money_list == null){
										                    abc_news_money_list = new LinkedList<ABCNews>();
												            ABCParser parser = new ABCParser(abc_money_rss);
												            abc_news_money_list = parser.getNews();
							                           }
							          return abc_news_money_list;
	                       }

	@Override
	public LinkedList<ABCINews> getABCITechnologyNews()  {
									  if(abci_news_money_list == null){
										                    abci_news_money_list = new LinkedList<ABCINews>();
							                                ABCIParser parser = new ABCIParser(abci_technology_rss);
							                                abci_news_money_list = parser.getNews();
							                            }
							           return abci_news_money_list;
							}

    }