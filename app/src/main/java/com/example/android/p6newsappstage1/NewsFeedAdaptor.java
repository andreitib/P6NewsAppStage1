package com.example.android.p6newsappstage1;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * An {@link NewsFeedAdaptor} knows how to create a list item layout for each news
 * in the data source (a list of {@link NewsFeed} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsFeedAdaptor extends ArrayAdapter<NewsFeed> {



    /**
     * Constructs a new {@link NewsFeedAdaptor}.
     *
     * @param context of the app
     * @param newsfeed is the list of newsfeed, which is the data source of the adapter
     */
    public NewsFeedAdaptor(Context context, List<NewsFeed> newsfeed) {
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
        NewsFeed currentNewsFeed = getItem(position);


        // Find the TextView with view ID title
        TextView titleView = listItemView.findViewById(R.id.title);
        // Display the title of the current news in that TextView
        titleView.setText(currentNewsFeed.getTitle());

        // Find the TextView with view ID section_name
        TextView sectionNameView = listItemView.findViewById(R.id.section_name);
        // Display the section name of the current news in that TextView
        sectionNameView.setText(currentNewsFeed.getSectionName());

        // Find the TextView with view ID author_name
        TextView authorNameView = listItemView.findViewById(R.id.author_name);
        // Display the author name of the current news in that TextView
        if (currentNewsFeed.getAuthorName() != "") {
            authorNameView.setText(currentNewsFeed.getAuthorName());

            //Set author name view as visible
            authorNameView.setVisibility(View.VISIBLE);
        } else {
            //Set author name view as gone
            authorNameView.setVisibility(View.GONE);
        }



        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }



    /**

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}
