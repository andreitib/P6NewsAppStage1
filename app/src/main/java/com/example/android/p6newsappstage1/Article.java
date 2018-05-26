package com.example.android.p6newsappstage1;

/**
 * An {@link Article} object contains information related to a single news.
 */
public class Article {
    /**
     * Article title for news
     */
    private String article_title;
    /**
     * Article section for the news
     */
    private String article_section;
    /**
     * Date of the article news
     */
    private String date;
    /**
     * Author of the article news
     */
    private String author;
    /**
     * Website URL of the article news
     */
    private String url;

    /**
     * Constructs a new {@link Article} object
     *
     * @param articleTitle   is the title of the article
     * @param articleSection is the Section of the article news
     * @param date           is the date of publication of the news on the GUARDIAN website
     * @param author         is the author of the article
     * @param url            is the url of the article news
     */
    Article(String articleTitle, String articleSection, String date, String author, String url) {
        article_title = articleTitle;
        article_section = articleSection;
        this.date = date;
        this.author = author;
        this.url = url;
    }

    /**
     * Returns the article title of the article news
     */
    public String getArticle_title() {
        return article_title;
    }

    /**
     * Returns the article section of the article news
     */
    public String getArticle_section() {
        return article_section;
    }

    /**
     * Returns the date of the article news
     */
    public String getDate() {
        return date;
    }

    /**
     * Returns the author of the article
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the website url of the article news
     */
    public String getUrl() {
        return url;
    }

}
