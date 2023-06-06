// Generated by Dagger (https://dagger.dev).
package ken.projects.infit.viewmodel;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import ken.projects.infit.domain.WorkoutRepository;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WorkoutViewModel_Factory implements Factory<WorkoutViewModel> {
  private final Provider<Application> appProvider;

  private final Provider<WorkoutRepository> repositoryProvider;

  public WorkoutViewModel_Factory(Provider<Application> appProvider,
      Provider<WorkoutRepository> repositoryProvider) {
    this.appProvider = appProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public WorkoutViewModel get() {
    return newInstance(appProvider.get(), repositoryProvider.get());
  }

  public static WorkoutViewModel_Factory create(Provider<Application> appProvider,
      Provider<WorkoutRepository> repositoryProvider) {
    return new WorkoutViewModel_Factory(appProvider, repositoryProvider);
  }

  public static WorkoutViewModel newInstance(Application app, WorkoutRepository repository) {
    return new WorkoutViewModel(app, repository);
  }
}
