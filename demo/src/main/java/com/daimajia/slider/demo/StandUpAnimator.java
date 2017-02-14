package com.daimajia.slider.demo;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * @author chenzj
 * @Title: StandUpAnimator
 * @Description: 类的描述 -
 * @date 2017/2/14 16:45
 * @email admin@chenzhongjin.cn
 */
public class StandUpAnimator extends BaseViewAnimator {
    public StandUpAnimator() {
    }

    protected void prepare(View target) {
        float x = (float) ((target.getWidth() - target.getPaddingLeft() - target.getPaddingRight()) / 2 + target.getPaddingLeft());
        float y = (float) (target.getHeight() - target.getPaddingBottom());
        this.getAnimatorAgent().playTogether(new Animator[]{ObjectAnimator.ofFloat(target, "pivotX", new float[]{x, x, x, x, x}),
                ObjectAnimator.ofFloat(target, "pivotY", new float[]{y, y, y, y, y}), ObjectAnimator.ofFloat(target, "rotationX",
                new float[]{55.0F, -30.0F, 15.0F, -15.0F, 0.0F})});
    }
}
