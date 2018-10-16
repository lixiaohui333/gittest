// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.goods.presenter;

import android.content.Context;
import com.kotlin.base.presenter.BasePresenter;
import com.kotlin.goods.service.CartService;
import com.trello.rxlifecycle.LifecycleProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class CartListPresenter_MembersInjector implements MembersInjector<CartListPresenter> {
  private final Provider<LifecycleProvider<?>> lifecycleProvider;

  private final Provider<Context> contextProvider;

  private final Provider<CartService> cartServiceProvider;

  public CartListPresenter_MembersInjector(
      Provider<LifecycleProvider<?>> lifecycleProvider,
      Provider<Context> contextProvider,
      Provider<CartService> cartServiceProvider) {
    assert lifecycleProvider != null;
    this.lifecycleProvider = lifecycleProvider;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert cartServiceProvider != null;
    this.cartServiceProvider = cartServiceProvider;
  }

  public static MembersInjector<CartListPresenter> create(
      Provider<LifecycleProvider<?>> lifecycleProvider,
      Provider<Context> contextProvider,
      Provider<CartService> cartServiceProvider) {
    return new CartListPresenter_MembersInjector(
        lifecycleProvider, contextProvider, cartServiceProvider);
  }

  @Override
  public void injectMembers(CartListPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BasePresenter) instance).lifecycleProvider = lifecycleProvider.get();
    ((BasePresenter) instance).context = contextProvider.get();
    instance.cartService = cartServiceProvider.get();
  }
}