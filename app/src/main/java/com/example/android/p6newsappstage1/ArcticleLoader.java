package com.example.android.p6newsappstage1;

import android.content.AsyncTaskLoader;
import android.content.Context;
import java.util.List;

/**
 * Loads a list of news by using an AsyncTask to perform the
 * network request to the given URL.
 */
public class ArcticleLoader extends AsyncTaskLoader<List<com.example.android.p6newsappstage1.Article>> {

    /** Tag for log messages */
    private static final String LOG_TAG = ArcticleLoader.class.getName();

    /** Query URL */
    private String mUrl;

    /**
     * Constructs a new {@link ArcticleLoader}.
     *
     * @param context of the activity
     * @param url to load data from
     */
    public ArcticleLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<com.example.android.p6newsappstage1.Article> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of newsFeeds.
        List<com.example.android.p6newsappstage1.Article> Article = QueryUtils.fetchArcticlesAppData(mUrl);
        return Article;
    }
}
