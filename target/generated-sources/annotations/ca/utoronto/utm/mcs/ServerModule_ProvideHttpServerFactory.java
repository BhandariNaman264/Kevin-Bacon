package ca.utoronto.utm.mcs;

import com.sun.net.httpserver.HttpServer;
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
public final class ServerModule_ProvideHttpServerFactory implements Factory<HttpServer> {
  @Override
  public HttpServer get() {
    return provideHttpServer();
  }

  public static ServerModule_ProvideHttpServerFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HttpServer provideHttpServer() {
    return Preconditions.checkNotNullFromProvides(ServerModule.provideHttpServer());
  }

  private static final class InstanceHolder {
    private static final ServerModule_ProvideHttpServerFactory INSTANCE = new ServerModule_ProvideHttpServerFactory();
  }
}
