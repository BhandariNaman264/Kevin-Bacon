package ca.utoronto.utm.mcs;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ReqHandlerModule_ProvideDatatbaseFactory implements Factory<Neo4jDAO> {
  @Override
  public Neo4jDAO get() {
    return provideDatatbase();
  }

  public static ReqHandlerModule_ProvideDatatbaseFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Neo4jDAO provideDatatbase() {
    return Preconditions.checkNotNullFromProvides(ReqHandlerModule.provideDatatbase());
  }

  private static final class InstanceHolder {
    private static final ReqHandlerModule_ProvideDatatbaseFactory INSTANCE = new ReqHandlerModule_ProvideDatatbaseFactory();
  }
}
