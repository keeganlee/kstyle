/*
 * Copyright (C) 2015. Keegan小钢（http://keeganlee.me）
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.keegan.kstyle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
    }

    public void onFadeIn(View view) {
        AlphaAnimation animation = (AlphaAnimation) AnimationUtils.loadAnimation(this, R.anim.fade_in);
        view.startAnimation(animation);
    }

    public void onFadeOut(View view) {
        AlphaAnimation animation = (AlphaAnimation) AnimationUtils.loadAnimation(this, R.anim.fade_out);
        view.startAnimation(animation);
    }

    public void onZoomIn(View view) {
        ScaleAnimation animation = (ScaleAnimation) AnimationUtils.loadAnimation(this, R.anim.zoom_in);
        view.startAnimation(animation);
    }

    public void onZoomOut(View view) {
        ScaleAnimation animation = (ScaleAnimation) AnimationUtils.loadAnimation(this, R.anim.zoom_out);
        view.startAnimation(animation);
    }

    public void onMoveLeft2Right(View view) {
        TranslateAnimation animation = (TranslateAnimation) AnimationUtils.loadAnimation(this, R.anim.move_left_to_right);
        view.startAnimation(animation);
    }

    public void onMoveInFromBottom(View view) {
        TranslateAnimation animation = (TranslateAnimation) AnimationUtils.loadAnimation(this, R.anim.move_in_from_bottom);
        view.startAnimation(animation);
    }

    public void onRotate(View view) {
        RotateAnimation animation = (RotateAnimation) AnimationUtils.loadAnimation(this, R.anim.rotate_one);
        view.startAnimation(animation);
    }

    public void onMoveAndScale(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.move_and_scale));
    }
}
