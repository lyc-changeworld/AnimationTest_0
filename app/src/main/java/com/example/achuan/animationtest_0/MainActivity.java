package com.example.achuan.animationtest_0;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;
    private Button mButton;
    private Animation mAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView= (ImageView) findViewById(R.id.anim_iv);
        mButton= (Button) findViewById(R.id.start_btn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*1-单一动画加载*//*
                //设置动画加载的文件（配置文件的方式）
                mAnimation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                mImageView.startAnimation(mAnimation);//启动动画*/
                /*2-组合动画*/
                /*//案例一：设置AnimationListener,当onAnimationEnd触发(前一个动画播放完毕),开发播放下面的动画
                mAnimation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                mImageView.startAnimation(mAnimation);//启动第一个动画
                //对动画设置一个监听，复写方法，在前一个动画结束时接着进行另一个动画，形成组合动画
                final Animation animation1=AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate);
                mAnimation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }
                    @Override
                    public void onAnimationEnd(Animation animation) {
                          mImageView.startAnimation(animation1);
                    }
                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });*/
                /*//案例二：设置一个连续动画的配置文件和第二个动画的延迟时间,加载这个文件就行
                mAnimation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.continue_anim);
                mImageView.startAnimation(mAnimation);*/
                /*//案例三：重复动画,利用setRepeatCount、setRepeatMode
                AlphaAnimation alphaAnimation=new AlphaAnimation(0.1f,1.0f);
                alphaAnimation.setDuration(1000);//设置动画进行的时间
                alphaAnimation.setRepeatCount(10);//设置动画重复进行的次数
                //设置动画重复的模式:倒序REVERSE 正序RESTART
                alphaAnimation.setRepeatMode(Animation.REVERSE);//倒序重复
                mImageView.startAnimation(alphaAnimation);*/
                //案例四：
                /*Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                //配置activity切换动画,(第二个活动进入时的动画,第一个活动退出时的动画)
                overridePendingTransition(R.anim.zoom_in,R.anim.zoom_out);*/
                /**３－LayoutAnimation布局动画**//*
                Intent intent=new Intent(MainActivity.this,ListActivity.class);
                startActivity(intent);*/
                /**４－逐帧动画:anim_list里面装载了4张图片**/
                mImageView.setBackgroundResource(R.drawable.anim_list);
                AnimationDrawable animation1 = (AnimationDrawable)mImageView.getBackground();
                animation1.start();
            }
        });

    }
}
