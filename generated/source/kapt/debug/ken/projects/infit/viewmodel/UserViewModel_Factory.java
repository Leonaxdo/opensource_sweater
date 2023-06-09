// Generated by Dagger (https://dagger.dev).
package ken.projects.infit.viewmodel;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import ken.projects.infit.domain.UserRepository;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserViewModel_Factory implements Factory<UserViewModel> {
  private final Provider<Application> appProvider;

  private final Provider<UserRepository> repositoryProvider;

  public UserViewModel_Factory(Provider<Application> appProvider,
      Provider<UserRepository> repositoryProvider) {
    this.appProvider = appProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public UserViewModel get() {
    return newInstance(appProvider.get(), repositoryProvider.get());
  }

  public static UserViewModel_Factory create(Provider<Application> appProvider,
      Provider<UserRepository> repositoryProvider) {
    return new UserViewModel_Factory(appProvider, repositoryProvider);
  }

  public static UserViewModel newInstance(Application app, UserRepository repository) {
    return new UserViewModel(app, repository);
  }
}
