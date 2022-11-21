// Generated by view binder compiler. Do not edit!
package com.example.shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.shop.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ProfileLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView emailAccount;

  @NonNull
  public final LinearLayout linearLayout7;

  @NonNull
  public final TextView nameAccount;

  @NonNull
  public final CircleImageView profileAccount;

  private ProfileLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull TextView emailAccount,
      @NonNull LinearLayout linearLayout7, @NonNull TextView nameAccount,
      @NonNull CircleImageView profileAccount) {
    this.rootView = rootView;
    this.emailAccount = emailAccount;
    this.linearLayout7 = linearLayout7;
    this.nameAccount = nameAccount;
    this.profileAccount = profileAccount;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ProfileLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProfileLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.profile_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProfileLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.email_account;
      TextView emailAccount = ViewBindings.findChildViewById(rootView, id);
      if (emailAccount == null) {
        break missingId;
      }

      id = R.id.linearLayout7;
      LinearLayout linearLayout7 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout7 == null) {
        break missingId;
      }

      id = R.id.name_account;
      TextView nameAccount = ViewBindings.findChildViewById(rootView, id);
      if (nameAccount == null) {
        break missingId;
      }

      id = R.id.profile_account;
      CircleImageView profileAccount = ViewBindings.findChildViewById(rootView, id);
      if (profileAccount == null) {
        break missingId;
      }

      return new ProfileLayoutBinding((ConstraintLayout) rootView, emailAccount, linearLayout7,
          nameAccount, profileAccount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}