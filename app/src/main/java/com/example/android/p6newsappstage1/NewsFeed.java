package com.example.android.p6newsappstage1;

import java.util.Date;

/**
 * An {@link NewsFeed} object contains information related to a single news.
 */
public class NewsFeed {


    /**
     * Title of the newsfeed "webTitle"
     */
    private final String newsfeedTitle;

    /**
     * Section name of the newsfeed "sectionName"
     */
    private final String newsfeedSectionName;

    /**
     * Publication date of the newsfeed "webPublicationDate"
     */
    private final Date newsfeedPublicationDate;

    /**
     * Website URL of the newsfeed "webUrl"
     */
    private final String newsfeedUrl;



    /**
     * Constructs a new {@link NewsFeed} object.
     *
     * @param title           is the title of the newsfeed
     * @param section         is the section where the newsfeed happened
     * @param publicationDate is the news publication date
     * @param url             is the website URL to find more details about the newsfeed
     */
    public NewsFeed(String title, String section, Date publicationDate, String url) {
        newsfeedTitle = title;
        newsfeedSectionName = section;

        newsfeedPublicationDate = publicationDate;
        newsfeedUrl = url;

    }

    /**
     * Returns the Title of the newsfeed.
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
     * Returns the publication date of the newsfeed.
     */
    public Date getPublicationDate() {
        return newsfeedPublicationDate;
    }

    /**
     * Returns the website URL to find more information about the newsfeed.
     */
    public String getUrl() {
        return newsfeedUrl;
    }

}
