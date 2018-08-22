package iammert.com.dagger_android_injection.ui.main;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by lzp48947 on 2018/8/22.
 */
@Subcomponent(modules = {
//        AndroidInjectionModule.class,
        MainActivityModule.class})
public interface MainActivityComponent extends AndroidInjector<MainActivity>{
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{}
}
