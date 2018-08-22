package iammert.com.dagger_android_injection.ui.detail.fragment;

import android.app.Activity;

import dagger.Binds;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import iammert.com.dagger_android_injection.ui.main.MainActivity;
import iammert.com.dagger_android_injection.ui.main.MainActivityComponent;

/**
 * Created by lzp48947 on 2018/8/22.
 */
@Subcomponent(modules = DetailFragmentModule.class)
public class DetailFragmentComponent {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailFragment>{}

//    @Binds
//    @IntoMap
//    @ActivityKey(DetailFragment.class)
//    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(DetailFragmentComponent.Builder builder);
}
