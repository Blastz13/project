// Generated by view binder compiler. Do not edit!
package com.example.shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.shop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RecentOrdersLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView25;

  @NonNull
  public final ImageView imageView26;

  @NonNull
  public final ImageView imageView27;

  @NonNull
  public final ImageView imageView28;

  @NonNull
  public final TextView recentOrders;

  @NonNull
  public final LinearLayout yourRecentOrders;

  private RecentOrdersLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageView25, @NonNull ImageView imageView26,
      @NonNull ImageView imageView27, @NonNull ImageView imageView28,
      @NonNull TextView recentOrders, @NonNull LinearLayout yourRecentOrders) {
    this.rootView = rootView;
    this.imageView25 = imageView25;
    this.imageView26 = imageView26;
    this.imageView27 = imageView27;
    this.imageView28 = imageView28;
    this.recentOrders = recentOrders;
    this.yourRecentOrders = yourRecentOrders;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RecentOrdersLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RecentOrdersLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.recent_orders_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RecentOrdersLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView25;
      ImageView imageView25 = ViewBindings.findChildViewById(rootView, id);
      if (imageView25 == null) {
        break missingId;
      }

      id = R.id.imageView26;
      ImageView imageView26 = ViewBindings.findChildViewById(rootView, id);
      if (imageView26 == null) {
        break missingId;
      }

      id = R.id.imageView27;
      ImageView imageView27 = ViewBindings.findChildViewById(rootView, id);
      if (imageView27 == null) {
        break missingId;
      }

      id = R.id.imageView28;
      ImageView imageView28 = ViewBindings.findChildViewById(rootView, id);
      if (imageView28 == null) {
        break missingId;
      }

      id = R.id.recent_orders;
      TextView recentOrders = ViewBindings.findChildViewById(rootView, id);
      if (recentOrders == null) {
        break missingId;
      }

      id = R.id.your_recent_orders;
      LinearLayout yourRecentOrders = ViewBindings.findChildViewById(rootView, id);
      if (yourRecentOrders == null) {
        break missingId;
      }

      return new RecentOrdersLayoutBinding((ConstraintLayout) rootView, imageView25, imageView26,
          imageView27, imageView28, recentOrders, yourRecentOrders);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
