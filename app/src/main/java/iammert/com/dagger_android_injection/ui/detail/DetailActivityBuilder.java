package iammert.com.dagger_android_injection.ui.detail;

import android.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import iammert.com.dagger_android_injection.ui.detail.fragment.DetailFragment;
import iammert.com.dagger_android_injection.ui.detail.fragment.DetailFragmentComponent;

/**
 * Created by lzp48947 on 2018/8/23.
 */
@Module
public abstract class DetailActivityBuilder {
    @Binds
    @IntoMap
    @FragmentKey(DetailFragment.class)
    abstract AndroidInjector.Factory<? extends android.support.v4.app.Fragment> bindDetailFragment(DetailFragmentComponent.Builder builder);
}
