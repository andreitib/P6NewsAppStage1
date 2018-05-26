package com.example.android.p6newsappstage1;

import java.util.Date;

/**
 * An {@link NewsFeed} object contains information related to a single news.
 */
public class NewsFeed {


    /**
     * Title of the newsfeed
     */
    private final String newsfeedTitle;

    /**
     * Section name of the newsfeed
     */
    private final String newsfeedSectionName;

    /**
     * Author name of the newsfeed
     */
    private final String newsfeedAuthorName;


    /**
     * Website URL of the newsfeed
     */
    private final String newsfeedUrl;



    /**
     * Constructs a new {@link NewsFeed} object.
     *
     * @param title           is the title of the newsfeed
     * @param section         is the section where the newsfeed happened
     * @param authorFullName  is the news author full name
     * @param url             is the website URL to find more details about the newsfeed
     */
    public NewsFeed(String title, String section, String authorFullName,  String url) {
        newsfeedTitle = title;
        newsfeedSectionName = section;
        newsfeedAuthorName = authorFullName;

        newsfeedUrl = url;

    }

    /**
     * Returns the magnitude of the newsfeed.
     */
    public String getTitle() {
        return newsfeedTitle;
    }

    /**
     * Returns the section name of the newsfeed.
     */
    public String getSectionName() {
        return newsfeedSectionName;
    }

    /**
     * Returns the author of the newsfeed.
     */
    public String getAuthorName() {
        return newsfeedAuthorName;
    }



    /**
     * Returns the website URL to find more information about the newsfeed.
     */
    public String getUrl() {
        return newsfeedUrl;
    }

}
