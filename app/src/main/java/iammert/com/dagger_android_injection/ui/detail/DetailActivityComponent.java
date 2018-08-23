package iammert.com.dagger_android_injection.ui.detail;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import iammert.com.dagger_android_injection.ui.detail.fragment.DetailFragmentComponent;

/**
 * Created by lzp48947 on 2018/8/22.
 */
@Subcomponent(modules = {
//        AndroidInjectionModule.class,
        DetailActivityModule.class
//        ,
//        DetailActivityBuilder.class
})
public interface DetailActivityComponent extends AndroidInjector<DetailActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailActivity>{}
}
