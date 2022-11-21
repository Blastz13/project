// Generated by view binder compiler. Do not edit!
package com.example.shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.example.shop.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ProductDescriptionLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TabLayout productDetailTablayout;

  @NonNull
  public final ViewPager productDetailViewpagerTab;

  private ProductDescriptionLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull TabLayout productDetailTablayout, @NonNull ViewPager productDetailViewpagerTab) {
    this.rootView = rootView;
    this.productDetailTablayout = productDetailTablayout;
    this.productDetailViewpagerTab = productDetailViewpagerTab;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ProductDescriptionLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProductDescriptionLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.product_description_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProductDescriptionLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.product_detail_tablayout;
      TabLayout productDetailTablayout = ViewBindings.findChildViewById(rootView, id);
      if (productDetailTablayout == null) {
        break missingId;
      }

      id = R.id.product_detail_viewpager_tab;
      ViewPager productDetailViewpagerTab = ViewBindings.findChildViewById(rootView, id);
      if (productDetailViewpagerTab == null) {
        break missingId;
      }

      return new ProductDescriptionLayoutBinding((ConstraintLayout) rootView,
          productDetailTablayout, productDetailViewpagerTab);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
