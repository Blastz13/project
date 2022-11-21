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

public final class MyOrderItemLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView delivaredOrderDate;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final ImageView imageView9;

  @NonNull
  public final ImageView indicatorStatusOrder;

  @NonNull
  public final ImageView orderProductImage;

  @NonNull
  public final TextView orderProductTitle;

  @NonNull
  public final LinearLayout rateNowContainer;

  @NonNull
  public final View ratingDivider;

  @NonNull
  public final TextView textView13;

  private MyOrderItemLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView delivaredOrderDate, @NonNull ImageView imageView10,
      @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8,
      @NonNull ImageView imageView9, @NonNull ImageView indicatorStatusOrder,
      @NonNull ImageView orderProductImage, @NonNull TextView orderProductTitle,
      @NonNull LinearLayout rateNowContainer, @NonNull View ratingDivider,
      @NonNull TextView textView13) {
    this.rootView = rootView;
    this.delivaredOrderDate = delivaredOrderDate;
    this.imageView10 = imageView10;
    this.imageView6 = imageView6;
    this.imageView7 = imageView7;
    this.imageView8 = imageView8;
    this.imageView9 = imageView9;
    this.indicatorStatusOrder = indicatorStatusOrder;
    this.orderProductImage = orderProductImage;
    this.orderProductTitle = orderProductTitle;
    this.rateNowContainer = rateNowContainer;
    this.ratingDivider = ratingDivider;
    this.textView13 = textView13;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MyOrderItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MyOrderItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.my_order_item_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MyOrderItemLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.delivared_order_date;
      TextView delivaredOrderDate = ViewBindings.findChildViewById(rootView, id);
      if (delivaredOrderDate == null) {
        break missingId;
      }

      id = R.id.imageView10;
      ImageView imageView10 = ViewBindings.findChildViewById(rootView, id);
      if (imageView10 == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      id = R.id.imageView7;
      ImageView imageView7 = ViewBindings.findChildViewById(rootView, id);
      if (imageView7 == null) {
        break missingId;
      }

      id = R.id.imageView8;
      ImageView imageView8 = ViewBindings.findChildViewById(rootView, id);
      if (imageView8 == null) {
        break missingId;
      }

      id = R.id.imageView9;
      ImageView imageView9 = ViewBindings.findChildViewById(rootView, id);
      if (imageView9 == null) {
        break missingId;
      }

      id = R.id.indicator_status_order;
      ImageView indicatorStatusOrder = ViewBindings.findChildViewById(rootView, id);
      if (indicatorStatusOrder == null) {
        break missingId;
      }

      id = R.id.order_product_image;
      ImageView orderProductImage = ViewBindings.findChildViewById(rootView, id);
      if (orderProductImage == null) {
        break missingId;
      }

      id = R.id.order_product_title;
      TextView orderProductTitle = ViewBindings.findChildViewById(rootView, id);
      if (orderProductTitle == null) {
        break missingId;
      }

      id = R.id.rate_now_container;
      LinearLayout rateNowContainer = ViewBindings.findChildViewById(rootView, id);
      if (rateNowContainer == null) {
        break missingId;
      }

      id = R.id.rating_divider;
      View ratingDivider = ViewBindings.findChildViewById(rootView, id);
      if (ratingDivider == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = ViewBindings.findChildViewById(rootView, id);
      if (textView13 == null) {
        break missingId;
      }

      return new MyOrderItemLayoutBinding((ConstraintLayout) rootView, delivaredOrderDate,
          imageView10, imageView6, imageView7, imageView8, imageView9, indicatorStatusOrder,
          orderProductImage, orderProductTitle, rateNowContainer, ratingDivider, textView13);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
