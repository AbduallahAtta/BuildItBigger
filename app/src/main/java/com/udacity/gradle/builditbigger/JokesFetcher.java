package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;
import android.util.Log;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

import java.io.IOException;

/**
 * Created by AbdullahAtta on 5/8/2018.
 */

public class JokesFetcher extends AsyncTask<LoadJokeListener, Void, String> {
    private static MyApi apiService = null;
    private LoadJokeListener loadJokeListener;
    private static final String TAG = JokesFetcher.class.getSimpleName();
    @Override
    protected String doInBackground(LoadJokeListener... params) {
        if (apiService == null) {
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl("http://10.0.3.2:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> request) throws IOException {
                            request.setDisableGZipContent(true);
                        }
                    });
            apiService = builder.build();

        }
        loadJokeListener = params[0];
        String theJoke = "HAHA";
        try {
            theJoke = apiService.getAJoke().execute().getData();
        } catch (IOException e) {
            Log.d(TAG,e.getMessage());
        }

        return theJoke;
    }

    @Override
    protected void onPostExecute(String joke) {
        loadJokeListener.onJokeLoadFinishListener(joke);
    }
}
