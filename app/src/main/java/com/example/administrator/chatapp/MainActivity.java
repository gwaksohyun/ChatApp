package com.example.administrator.chatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {

    Thread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thread =new Thread(){
            public void run() {
                connect();
            }
        };
    }
    //채팅서버에 접속을 시도하자!!
    //접속을 시도하려면, 일반 소켓이 있어야하고, ip,port번호를 알아야 접속이 가능하다
    //안드로이드는 자바 표준의 java.net을 그대로 사용 할 수있다!
    public void connect(){
        try {
            Socket client=new Socket("192.168.13.28",7777);//접속을 시도!
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void btnClick(View view){
        thread.start();
    }
}
