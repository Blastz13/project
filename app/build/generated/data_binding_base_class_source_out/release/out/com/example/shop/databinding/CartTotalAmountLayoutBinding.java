// Generated by view binder compiler. Do not edit!
package com.example.shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class CartTotalAmountLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView deliveryCharge;

  @NonNull
  public final TextView deliveryChargePrice;

  @NonNull
  public final View divider10;

  @NonNull
  public final View divider11;

  @NonNull
  public final View divider9;

  @NonNull
  public final TextView savedAmount;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView total;

  @NonNull
  public final TextView totalItems;

  @NonNull
  public final TextView totalItemsPrice;

  @NonNull
  public final TextView totalPrice;

  private CartTotalAmountLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView deliveryCharge, @NonNull TextView deliveryChargePrice,
      @NonNull View divider10, @NonNull View divider11, @NonNull View divider9,
      @NonNull TextView savedAmount, @NonNull TextView textView6, @NonNull TextView total,
      @NonNull TextView totalItems, @NonNull TextView totalItemsPrice,
      @NonNull TextView totalPrice) {
    this.rootView = rootView;
    this.deliveryCharge = deliveryCharge;
    this.deliveryChargePrice = deliveryChargePrice;
    this.divider10 = divider10;
    this.divider11 = divider11;
    this.divider9 = divider9;
    this.savedAmount = savedAmount;
    this.textView6 = textView6;
    this.total = total;
    this.totalItems = totalItems;
    this.totalItemsPrice = totalItemsPrice;
    this.totalPrice = totalPrice;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CartTotalAmountLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CartTotalAmountLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.cart_total_amount_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CartTotalAmountLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.delivery_charge;
      TextView deliveryCharge = ViewBindings.findChildViewById(rootView, id);
      if (deliveryCharge == null) {
        break missingId;
      }

      id = R.id.delivery_charge_price;
      TextView deliveryChargePrice = ViewBindings.findChildViewById(rootView, id);
      if (deliveryChargePrice == null) {
        break missingId;
      }

      id = R.id.divider10;
      View divider10 = ViewBindings.findChildViewById(rootView, id);
      if (divider10 == null) {
        break missingId;
      }

      id = R.id.divider11;
      View divider11 = ViewBindings.findChildViewById(rootView, id);
      if (divider11 == null) {
        break missingId;
      }

      id = R.id.divider9;
      View divider9 = ViewBindings.findChildViewById(rootView, id);
      if (divider9 == null) {
        break missingId;
      }

      id = R.id.saved_amount;
      TextView savedAmount = ViewBindings.findChildViewById(rootView, id);
      if (savedAmount == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.total;
      TextView total = ViewBindings.findChildViewById(rootView, id);
      if (total == null) {
        break missingId;
      }

      id = R.id.total_items;
      TextView totalItems = ViewBindings.findChildViewById(rootView, id);
      if (totalItems == null) {
        break missingId;
      }

      id = R.id.total_items_price;
      TextView totalItemsPrice = ViewBindings.findChildViewById(rootView, id);
      if (totalItemsPrice == null) {
        break missingId;
      }

      id = R.id.total_price;
      TextView totalPrice = ViewBindings.findChildViewById(rootView, id);
      if (totalPrice == null) {
        break missingId;
      }

      return new CartTotalAmountLayoutBinding((ConstraintLayout) rootView, deliveryCharge,
          deliveryChargePrice, divider10, divider11, divider9, savedAmount, textView6, total,
          totalItems, totalItemsPrice, totalPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
