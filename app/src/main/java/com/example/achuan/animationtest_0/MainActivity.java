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
                /*1-��һ��������*//*
                //���ö������ص��ļ��������ļ��ķ�ʽ��
                mAnimation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                mImageView.startAnimation(mAnimation);//��������*/
                /*2-��϶���*/
                /*//����һ������AnimationListener,��onAnimationEnd����(ǰһ�������������),������������Ķ���
                mAnimation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                mImageView.startAnimation(mAnimation);//������һ������
                //�Զ�������һ����������д��������ǰһ����������ʱ���Ž�����һ���������γ���϶���
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
                /*//������������һ�����������������ļ��͵ڶ����������ӳ�ʱ��,��������ļ�����
                mAnimation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.continue_anim);
                mImageView.startAnimation(mAnimation);*/
                /*//���������ظ�����,����setRepeatCount��setRepeatMode
                AlphaAnimation alphaAnimation=new AlphaAnimation(0.1f,1.0f);
                alphaAnimation.setDuration(1000);//���ö������е�ʱ��
                alphaAnimation.setRepeatCount(10);//���ö����ظ����еĴ���
                //���ö����ظ���ģʽ:����REVERSE ����RESTART
                alphaAnimation.setRepeatMode(Animation.REVERSE);//�����ظ�
                mImageView.startAnimation(alphaAnimation);*/
                //�����ģ�
                /*Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                //����activity�л�����,(�ڶ��������ʱ�Ķ���,��һ����˳�ʱ�Ķ���)
                overridePendingTransition(R.anim.zoom_in,R.anim.zoom_out);*/
                /**����LayoutAnimation���ֶ���**//*
                Intent intent=new Intent(MainActivity.this,ListActivity.class);
                startActivity(intent);*/
                /**������֡����:anim_list����װ����4��ͼƬ**/
                mImageView.setBackgroundResource(R.drawable.anim_list);
                AnimationDrawable animation1 = (AnimationDrawable)mImageView.getBackground();
                animation1.start();
            }
        });

    }
}
