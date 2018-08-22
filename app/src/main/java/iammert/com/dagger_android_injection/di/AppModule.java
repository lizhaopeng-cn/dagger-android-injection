package iammert.com.dagger_android_injection.di;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;
import iammert.com.dagger_android_injection.ui.detail.DetailActivityComponent;
import iammert.com.dagger_android_injection.ui.main.MainActivity;
import iammert.com.dagger_android_injection.ui.main.MainActivityComponent;

/**
 * Created by mertsimsek on 25/05/2017.
 */
@Module(subcomponents =
            {MainActivityComponent.class,
             DetailActivityComponent.class})
public abstract class AppModule {

    @Binds
    abstract Context provideContext(Application application);

}
