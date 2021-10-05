package com.mj.mylibrary;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;


public class myLibrary {
  public Button btn;
  @SuppressLint("WrongConstant")
  private void manageBlinkEffect() {
    ObjectAnimator anim = ObjectAnimator.ofInt(btn, "backgroundColor", Color.WHITE, Color.RED,
            Color.WHITE);

  anim.setDuration(1500);
  anim.setEvaluator(new ArgbEvaluator());
  anim.setRepeatMode(Animation.REVERSE);
  anim.setRepeatCount(Animation.INFINITE);
  anim.start();
}
}
