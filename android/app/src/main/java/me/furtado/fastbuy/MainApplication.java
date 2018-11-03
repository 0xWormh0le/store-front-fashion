package me.furtado.fastbuy;

import com.facebook.react.shell.MainReactPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.reactcommunity.rnlanguages.RNLanguagesPackage;
import com.facebook.react.ReactPackage;
import com.reactnativenavigation.NavigationApplication;
import com.reactnativenavigation.bridge.NavigationReactPackage;

import java.util.Arrays;
import java.util.List;

import io.invertase.firebase.RNFirebasePackage;
import io.invertase.firebase.analytics.RNFirebaseAnalyticsPackage;
import io.invertase.firebase.fabric.crashlytics.RNFirebaseCrashlyticsPackage;
import io.invertase.firebase.perf.RNFirebasePerformancePackage;

public class MainApplication extends NavigationApplication {

  @Override
  public boolean isDebug() {
    return BuildConfig.DEBUG;
  }

  @Override
  public List<ReactPackage> createAdditionalReactPackages() {
    return getPackages();
  }

  @Override
  public String getJSMainModuleName() {
    return "index";
  }

  protected List<ReactPackage> getPackages() {
    return Arrays.<ReactPackage>asList(
            new MainReactPackage(),
            new NavigationReactPackage(),
            new RNDeviceInfo(),
            new RNFirebasePackage(),
            new RNFirebaseAnalyticsPackage(),
            new RNFirebaseCrashlyticsPackage(),
            new RNFirebasePerformancePackage(),
            new RNLanguagesPackage()
    );
  }

}
