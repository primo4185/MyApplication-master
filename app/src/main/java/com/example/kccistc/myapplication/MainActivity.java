package com.example.kccistc.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;

public class MainActivity extends AppCompatActivity {
    private AutoScrollViewPager autoViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout btn = findViewById(R.id.re_cat2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%20%EB%8C%80%EC%A0%84%EC%9F%81/%EC%BA%90%EB%A6%AD%ED%84%B0#s-1"));
                 startActivity(intent);
            }
        });
        RelativeLayout btn2 = findViewById(R.id.re_cat1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%20%EB%8C%80%EC%A0%84%EC%9F%81/%EC%A0%81%20%EC%BA%90%EB%A6%AD%ED%84%B0#s-1"));
                startActivity(intent);
            }
        });
        RelativeLayout btn3 = findViewById(R.id.re_cat3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%20%EB%8C%80%EC%A0%84%EC%9F%81/%EA%B0%80%EB%A7%88%ED%86%A0%ED%86%A0%20%ED%83%90%ED%97%98%EB%8C%80#s-1"));
                startActivity(intent);
            }
        });
        RelativeLayout btn4 = findViewById(R.id.re_cat4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%20%EB%8C%80%EC%A0%84%EC%9F%81/%EC%BA%90%EB%A6%AD%ED%84%B0#s-1"));
                startActivity(intent);
            }
        });
        RelativeLayout btn5 = findViewById(R.id.re_cat5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%20%EB%8C%80%EC%A0%84%EC%9F%81/%EB%A0%88%EC%A0%84%EB%93%9C%20%EC%8A%A4%ED%86%A0%EB%A6%AC#s-1"));
                startActivity(intent);
            }
        });
        RelativeLayout btn6 = findViewById(R.id.re_cat6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%EB%8C%80%EC%A0%84%EC%9F%81%20POP!#s-1"));
               startActivity(intent);
            }
        });
        RelativeLayout btn7 = findViewById(R.id.re_cat7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%20%EB%8C%80%EC%A0%84%EC%9F%81/%EB%83%A5%EC%BD%A4%EB%B3%B4#s-1"));
                startActivity(intent);
            }
        });
        RelativeLayout btn8 = findViewById(R.id.re_cat8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%20%EB%8C%80%EC%A0%84%EC%9F%81/%EC%8A%A4%ED%8E%98%EC%85%9C%20%EC%8A%A4%ED%85%8C%EC%9D%B4%EC%A7%80#s-1"));
                startActivity(intent);
            }
        });
        RelativeLayout btn9 = findViewById(R.id.re_cat9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/%EB%83%A5%EC%BD%94%20%EB%8C%80%EC%A0%84%EC%9F%81/%EC%8A%A4%ED%8E%98%EC%85%9C%20%EC%8A%A4%ED%85%8C%EC%9D%B4%EC%A7%80#s-1"));
                startActivity(intent);
            }
        });
        RelativeLayout btn10 = findViewById(R.id.re_cat10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent =  new Intent(MainActivity.this, Ani.class);
               startActivity(intent);
            }
        });
        ArrayList<String> data = new ArrayList<>(); //이미지 url를 저장하는 arraylist
        data.add("https://cdn-www.bluestacks.com/bs-images/great-battleship_logo.png");
        data.add("http://appdata.hungryapp.co.kr/data_file/data_img/201805/05/W152545379768790102.png");
        data.add("https://pbs.twimg.com/media/DNiNe4iUEAAeNK8.jpg");
        data.add("https://t1.daumcdn.net/cfile/tistory/99820D425AAD1CF11E");



        autoViewPager = findViewById(R.id.autoScrollViewPager);
        AutoScrollAdapter scrollAdapter = new AutoScrollAdapter(this, data);
        autoViewPager.setAdapter(scrollAdapter); //Auto Viewpager에 Adapter 장착
        autoViewPager.setInterval(4000); // 페이지 넘어갈 시간 간격 설정
        autoViewPager.startAutoScroll(); //Auto Scroll 시작

    }
}
