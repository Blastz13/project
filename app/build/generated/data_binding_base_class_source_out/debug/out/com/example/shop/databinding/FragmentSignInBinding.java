// Generated by view binder compiler. Do not edit!
package com.example.shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.shop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSignInBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final View divider;

  @NonNull
  public final View divider2;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView orSignUpBtn;

  @NonNull
  public final Button signInBtn;

  @NonNull
  public final ImageButton signInClose;

  @NonNull
  public final EditText signInEmail;

  @NonNull
  public final TextView signInForgotPassword;

  @NonNull
  public final EditText signInPassword;

  @NonNull
  public final ProgressBar signInProgressbar;

  @NonNull
  public final TextView textView2;

  private FragmentSignInBinding(@NonNull FrameLayout rootView, @NonNull View divider,
      @NonNull View divider2, @NonNull ImageView imageView, @NonNull TextView orSignUpBtn,
      @NonNull Button signInBtn, @NonNull ImageButton signInClose, @NonNull EditText signInEmail,
      @NonNull TextView signInForgotPassword, @NonNull EditText signInPassword,
      @NonNull ProgressBar signInProgressbar, @NonNull TextView textView2) {
    this.rootView = rootView;
    this.divider = divider;
    this.divider2 = divider2;
    this.imageView = imageView;
    this.orSignUpBtn = orSignUpBtn;
    this.signInBtn = signInBtn;
    this.signInClose = signInClose;
    this.signInEmail = signInEmail;
    this.signInForgotPassword = signInForgotPassword;
    this.signInPassword = signInPassword;
    this.signInProgressbar = signInProgressbar;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.divider;
      View divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.divider2;
      View divider2 = ViewBindings.findChildViewById(rootView, id);
      if (divider2 == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.or_sign_up_btn;
      TextView orSignUpBtn = ViewBindings.findChildViewById(rootView, id);
      if (orSignUpBtn == null) {
        break missingId;
      }

      id = R.id.sign_in_btn;
      Button signInBtn = ViewBindings.findChildViewById(rootView, id);
      if (signInBtn == null) {
        break missingId;
      }

      id = R.id.sign_in_close;
      ImageButton signInClose = ViewBindings.findChildViewById(rootView, id);
      if (signInClose == null) {
        break missingId;
      }

      id = R.id.sign_in_email;
      EditText signInEmail = ViewBindings.findChildViewById(rootView, id);
      if (signInEmail == null) {
        break missingId;
      }

      id = R.id.sign_in_forgot_password;
      TextView signInForgotPassword = ViewBindings.findChildViewById(rootView, id);
      if (signInForgotPassword == null) {
        break missingId;
      }

      id = R.id.sign_in_password;
      EditText signInPassword = ViewBindings.findChildViewById(rootView, id);
      if (signInPassword == null) {
        break missingId;
      }

      id = R.id.sign_in_progressbar;
      ProgressBar signInProgressbar = ViewBindings.findChildViewById(rootView, id);
      if (signInProgressbar == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new FragmentSignInBinding((FrameLayout) rootView, divider, divider2, imageView,
          orSignUpBtn, signInBtn, signInClose, signInEmail, signInForgotPassword, signInPassword,
          signInProgressbar, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}