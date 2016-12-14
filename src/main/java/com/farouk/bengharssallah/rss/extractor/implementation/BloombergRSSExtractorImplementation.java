package com.farouk.bengharssallah.rss.extractor.implementation;

import java.util.LinkedList;

import org.springframework.stereotype.Service;

import com.farouk.bengharssallah.rss.extractor.BloombergRSSExtractor;
import com.farouk.bengharssallah.rss.parser.bloomberg.BloombergNews;
import com.farouk.bengharssallah.rss.parser.bloomberg.BloombergParser;


@Service ("bloombergRSSExtractor")
public class BloombergRSSExtractorImplementation implements BloombergRSSExtractor {
	
	private static final String bloomberg_etf_stories_rss = "http://www.bloomberg.com/feeds/podcasts/etf_report.xml";
	
	private LinkedList<BloombergNews> bloomberg_etf__stories_list = null;

	@Override
	public LinkedList<BloombergNews> getBloombergETFStories()  {
												if(bloomberg_etf__stories_list == null){
													            bloomberg_etf__stories_list = new LinkedList<BloombergNews>();
													            BloombergParser parser = new BloombergParser(bloomberg_etf_stories_rss);
													            bloomberg_etf__stories_list = parser.getNews();
										                                  }
										return bloomberg_etf__stories_list;
	                                }

           }
