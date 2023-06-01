package ru.mirea.rudenok.practice8;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class App extends Application {
    private final String MAPKIT_API_KEY = "f8cfb46c-a2fa-45b7-898c-b62d389b1d0b";
    @Override
    public void onCreate() {
        super.onCreate();
// Set the api key before calling initialize on MapKitFactory.
        MapKitFactory.setApiKey(MAPKIT_API_KEY);
    }
}
