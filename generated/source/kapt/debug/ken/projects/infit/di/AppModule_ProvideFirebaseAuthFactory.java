// Generated by Dagger (https://dagger.dev).
package ken.projects.infit.di;

import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideFirebaseAuthFactory implements Factory<FirebaseAuth> {
  @Override
  public FirebaseAuth get() {
    return provideFirebaseAuth();
  }

  public static AppModule_ProvideFirebaseAuthFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FirebaseAuth provideFirebaseAuth() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideFirebaseAuth());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideFirebaseAuthFactory INSTANCE = new AppModule_ProvideFirebaseAuthFactory();
  }
}
