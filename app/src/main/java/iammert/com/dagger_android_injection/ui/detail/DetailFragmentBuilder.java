package iammert.com.dagger_android_injection.ui.detail;

/**
 * Created by lzp48947 on 2018/8/27.
 */

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import iammert.com.dagger_android_injection.ui.detail.fragment.DetailFragment;
import iammert.com.dagger_android_injection.ui.detail.fragment.DetailFragmentComponent;

@Module
public abstract class DetailFragmentBuilder {
    @Binds
    @IntoMap
    @FragmentKey(DetailFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindDetailFrament(DetailFragmentComponent.Builder builder);
}
