package ca.utoronto.utm.mcs;

import dagger.internal.DaggerGenerated;
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
public final class DaggerReqHandlerComponent implements ReqHandlerComponent {
  private DaggerReqHandlerComponent() {

  }

  public static Builder builder() {
    return new Builder();
  }

  public static ReqHandlerComponent create() {
    return new Builder().build();
  }

  @Override
  public ReqHandler buildHandler() {
    return new ReqHandler(ReqHandlerModule_ProvideDatatbaseFactory.provideDatatbase());
  }

  public static final class Builder {
    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder reqHandlerModule(ReqHandlerModule reqHandlerModule) {
      Preconditions.checkNotNull(reqHandlerModule);
      return this;
    }

    public ReqHandlerComponent build() {
      return new DaggerReqHandlerComponent();
    }
  }
}
