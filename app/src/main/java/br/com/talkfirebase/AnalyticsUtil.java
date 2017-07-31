package br.com.talkfirebase;

import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

/**
 * Created by poatek on 7/29/17.
 */

public class AnalyticsUtil {

    public AnalyticsUtil() {

    }
    public void eventScreen(FirebaseAnalytics mFirebaseAnalytics, String name) {
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name);
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "screen");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
}
