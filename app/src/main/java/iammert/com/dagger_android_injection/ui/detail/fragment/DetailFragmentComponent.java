package iammert.com.dagger_android_injection.ui.detail.fragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by lzp48947 on 2018/8/22.
 */
@Subcomponent(modules = DetailFragmentModule.class)
public interface DetailFragmentComponent extends AndroidInjector<DetailFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailFragment>{}
}
