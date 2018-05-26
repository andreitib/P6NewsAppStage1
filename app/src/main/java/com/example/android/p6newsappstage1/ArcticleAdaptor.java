package com.example.android.p6newsappstage1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link ArcticleAdaptor} knows how to create a list item layout for each news
 * in the data source (a list of {@link Article} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class ArcticleAdaptor extends ArrayAdapter<Article> {



    /**
     * Constructs a new {@link ArcticleAdaptor}.
     *
     * @param context of the app
     * @param newsfeed is the list of newsfeed, which is the data source of the adapter
     */
    public ArcticleAdaptor(Context context, List<Article> newsfeed) {
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
                    R.layout.newsfeed_list_item, parent, false);
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
        //Find the TextView with ID date
        TextView dateTextView = listItemView.findViewById(R.id.article_date);
        dateTextView.setText(currentArticle.getDate());
//        Find the TextView with the ID author
        TextView authorTextView = listItemView.findViewById(R.id.author);
        authorTextView.setText(currentArticle.getAuthor());
        return listItemView;
    }

    private String formatDate(String date) {
        String unformattedDate = date;
        String subDate = unformattedDate.substring(0,10);
        String subTime = unformattedDate.substring(11,19);
        return subDate + "  " + subTime;
    }
}
