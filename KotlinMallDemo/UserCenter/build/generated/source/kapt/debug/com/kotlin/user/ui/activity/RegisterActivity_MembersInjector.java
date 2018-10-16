// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.user.ui.activity;

import com.kotlin.base.ui.activity.BaseMvpActivity;
import com.kotlin.user.presenter.RegisterPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class RegisterActivity_MembersInjector implements MembersInjector<RegisterActivity> {
  private final Provider<RegisterPresenter> mPresenterProvider;

  public RegisterActivity_MembersInjector(Provider<RegisterPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<RegisterActivity> create(
      Provider<RegisterPresenter> mPresenterProvider) {
    return new RegisterActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(RegisterActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseMvpActivity) instance).mPresenter = mPresenterProvider.get();
  }
}