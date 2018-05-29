package com.example.android.p6newsappstage1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * An {@link ArcticleAdapter} knows how to create a list item layout for each news
 * in the data source (a list of {@link Article} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class ArcticleAdapter extends ArrayAdapter<Article> {
    /**
     * Constructs a new {@link ArcticleAdapter}.
     *
     * @param context of the app
     * @param newsfeed is the list of newsfeed, which is the data source of the adapter
     */
    public ArcticleAdapter(Context context, List<Article> newsfeed) {
        super(context, 0, newsfeed);
    }
    /**
     * Returns a list item view that displays information about every news at the given position
     * in the list of newsfeeds.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.arcticles_list_item, parent, false);
        }

        // Find the newss at the given position in the list of newsfeeds
        Article currentArticle = getItem(position);

        //Find the TextView with ID article_title
        TextView articleTitleTextView = listItemView.findViewById(R.id.article_tile);
        assert currentArticle != null;
        articleTitleTextView.setText(currentArticle.getArticle_title());
        //Find the TextView with ID article_section
        TextView articleSectionChip = listItemView.findViewById(R.id.article_section);
        articleSectionChip.setText(currentArticle.getArticle_section());
        // Find the TextView with view ID date
        TextView dateView = null;
        dateView = listItemView.findViewById(R.id.article_date);
        // Format the date string (
        String formattedDate = formatDate(currentArticle.getDate()).concat(",");
        // Display the date of the current earthquake in that TextView
        dateView.setText(formattedDate);
        TextView timeView = null;
        // Find the TextView with view ID time
        timeView = listItemView.findViewById(R.id.article_time);
        // Format the time string
        String formattedTime = formatTime(currentArticle.getDate());
        // Display the time of the current earthquake in that TextView
        timeView.setText(formattedTime);
        //Find the TextView with the ID author
        TextView authorTextView = listItemView.findViewById(R.id.author);
        authorTextView.setText(currentArticle.getAuthor());
        return listItemView;
    }

    /**
     * Return the formatted date string from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}
