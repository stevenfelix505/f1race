package com.ferdinandsilva.f1;

import android.os.Bundle;

import com.ferdinandsilva.sdlcontroller.SDLControllerView;

import org.libsdl.app.SDLActivity;

public class GameActivity extends SDLActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SDLControllerView v = new SDLControllerView(this, mLayout);
    }
}
