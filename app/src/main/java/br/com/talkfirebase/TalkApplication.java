package br.com.talkfirebase;

import android.app.Application;

import com.google.firebase.crash.FirebaseCrash;

/**
 * Created by filipenunes on 8/6/17.
 */

public class TalkApplication extends Application {

    public void TalkApplication() {
        FirebaseCrash.log("Activity created");
    }
}
