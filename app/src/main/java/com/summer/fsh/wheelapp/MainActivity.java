package com.summer.fsh.wheelapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends Activity {

    public static final int MESSAGE_9 = 9;
    public static final int MESSAGE_1 = 1;
    public static final int MESSAGE_2 = 2;
    public static final int MESSAGE_3 = 3;
    public static final int MESSAGE_4 = 4;
    public static final int MESSAGE_5 = 5;
    public static final int MESSAGE_6 = 6;
    public static final int MESSAGE_7 = 7;
    public static final int MESSAGE_8 = 8;

    public static final int MESSAGE_11 = 11;
    public static final int MESSAGE_22 = 22;
    public static final int MESSAGE_33 = 33;
    public static final int MESSAGE_44 = 44;
    public static final int MESSAGE_55 = 55;
    public static final int MESSAGE_66 = 66;
    public static final int MESSAGE_77 = 77;
    public static final int MESSAGE_88 = 88;

    public static final int MESSAGE_STOP = 10;

    boolean IsLongPressed = false;
    int flag = 1;
    int number = 8;
    EditText et;
    TextView tv;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    TextView tv7;
    TextView tv8;
    TextView tv9;
    ImageView iv;
    int width;
    int height;
    Bitmap wheel;
    Bitmap wheel1;
    Bitmap wheel2;
    Bitmap wheel3;
    Bitmap wheel4;
    Bitmap wheel5;
    Bitmap wheel6;
    Bitmap wheel7;
    Bitmap wheel8;
    Handler handler;
    String string1 = "锐哥";
    String string2 = "傻博";
    String string3 = "海牛宝宝";
    String string4 = "小师妹";
    String string5 = "大昌";
    String string6 = "小明";
    String string7 = "傻盼";
    String string8 = "AA咯";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.tv);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);
        tv5 = (TextView)findViewById(R.id.tv5);
        tv6 = (TextView)findViewById(R.id.tv6);
        tv7 = (TextView)findViewById(R.id.tv7);
        tv8 = (TextView)findViewById(R.id.tv8);
        tv9 = (TextView)findViewById(R.id.tv9);

        tv.setText("海牛宝宝爱学习");
        tv1.setText(string1);
        tv2.setText(string2);
        tv3.setText(string3);
        tv4.setText(string4);
        tv5.setText(string5);
        tv6.setText(string6);
        tv7.setText(string7);
        tv8.setText(string8);
        tv9.setText("Run");

        iv = (ImageView)findViewById(R.id.iv);

        WindowManager wm=(WindowManager)getSystemService(Context.WINDOW_SERVICE);
        width=getWindowManager().getDefaultDisplay().getWidth();       //手机屏幕的宽度
        height=getWindowManager().getDefaultDisplay().getHeight()+90;      //手机屏幕的高度

        wheel = BitmapFactory.decodeResource(getResources(), R.drawable.wheel);
        wheel1 = BitmapFactory.decodeResource(getResources(), R.drawable.wheel1);
        wheel2 = BitmapFactory.decodeResource(getResources(), R.drawable.wheel2);
        wheel3 = BitmapFactory.decodeResource(getResources(), R.drawable.wheel3);
        wheel4 = BitmapFactory.decodeResource(getResources(), R.drawable.wheel4);
        wheel5 = BitmapFactory.decodeResource(getResources(), R.drawable.wheel5);
        wheel6 = BitmapFactory.decodeResource(getResources(), R.drawable.wheel6);
        wheel7 = BitmapFactory.decodeResource(getResources(), R.drawable.wheel7);
        wheel8 = BitmapFactory.decodeResource(getResources(), R.drawable.wheel8);

    }

    protected void dialog(){
        AlertDialog.Builder builder = new Builder(MainActivity.this);
        builder.setTitle("请输入")
                .setView(et = new EditText(this))
                .setPositiveButton("确定", new OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        // TODO Auto-generated method stub
                        switch (flag) {
                            case 1:
                                string1 = et.getText().toString();
                                iv.setImageBitmap(wheel1);
                                tv1.setText(string1);
                                break;
                            case 2:
                                string2 = et.getText().toString();
                                iv.setImageBitmap(wheel2);
                                tv2.setText(string2);
                                break;
                            case 3:
                                string3 = et.getText().toString();
                                iv.setImageBitmap(wheel3);
                                tv3.setText(string3);
                                break;
                            case 4:
                                string4 = et.getText().toString();
                                iv.setImageBitmap(wheel4);
                                tv4.setText(string4);
                                break;
                            case 5:
                                string5 = et.getText().toString();
                                iv.setImageBitmap(wheel5);
                                tv5.setText(string5);
                                break;
                            case 6:
                                string6 = et.getText().toString();
                                iv.setImageBitmap(wheel6);
                                tv6.setText(string6);
                                break;
                            case 7:
                                string7 = et.getText().toString();
                                iv.setImageBitmap(wheel7);
                                tv7.setText(string7);
                                break;
                            case 8:
                                string8 = et.getText().toString();
                                iv.setImageBitmap(wheel8);
                                tv8.setText(string8);
                                break;
                            default:
                                break;
                        }
                    }
                })
                .setNegativeButton("取消", null).show();
    }

    Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case MESSAGE_1:
                    iv.setImageBitmap(wheel1);
                    tv1.setText(string1);
                    break;
                case MESSAGE_2:
                    iv.setImageBitmap(wheel2);
                    tv2.setText(string2);
                    break;
                case MESSAGE_3:
                    iv.setImageBitmap(wheel3);
                    tv3.setText(string3);
                    break;
                case MESSAGE_4:
                    iv.setImageBitmap(wheel4);
                    tv4.setText(string4);
                    break;
                case MESSAGE_5:
                    iv.setImageBitmap(wheel5);
                    tv5.setText(string5);
                    break;
                case MESSAGE_6:
                    iv.setImageBitmap(wheel6);
                    tv6.setText(string6);
                    break;
                case MESSAGE_7:
                    iv.setImageBitmap(wheel7);
                    tv7.setText(string7);
                    break;
                case MESSAGE_8:
                    iv.setImageBitmap(wheel8);
                    tv8.setText(string8);
                    break;

                case MESSAGE_11:
                    flag = 1;
                    dialog();
                    break;
                case MESSAGE_22:
                    flag = 2;
                    dialog();
                    break;
                case MESSAGE_33:
                    flag = 3;
                    dialog();
                    break;
                case MESSAGE_44:
                    flag = 4;
                    dialog();
                    break;
                case MESSAGE_55:
                    flag = 5;
                    dialog();
                    break;
                case MESSAGE_66:
                    flag = 6;
                    dialog();
                    break;
                case MESSAGE_77:
                    flag = 7;
                    dialog();
                    break;
                case MESSAGE_88:
                    flag = 8;
                    dialog();
                    break;

                case MESSAGE_STOP:
                    Bundle bundle = new Bundle();
                    bundle = msg.getData();
                    int i = bundle.getInt("msg");
                    tv9.setText("RUN");
                    switch (i%8) {
                        case 0:
                            tv.setText("哎,"+string8);
                            break;
                        case 1:
                            tv.setText("恭喜,"+string1+"同学，请吃饭咯！");
                            break;
                        case 2:
                            tv.setText("恭喜,"+string2+"同学，请吃饭咯！");
                            break;
                        case 3:
                            tv.setText("恭喜,"+string3+"同学，请吃饭咯！");
                            break;
                        case 4:
                            tv.setText("恭喜,"+string4+"同学，请吃饭咯！");
                            break;
                        case 5:
                            tv.setText("恭喜,"+string5+"同学，请吃饭咯！");
                            break;
                        case 6:
                            tv.setText("恭喜,"+string6+"同学，请吃饭咯！");
                            break;
                        case 7:
                            tv.setText("恭喜,"+string7+"同学，请吃饭咯！");
                            break;

                        default:
                            break;
                    }

                    break;

            }
        }
    };

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // TODO Auto-generated method stub
        Message msg = new Message();

        if(event.getAction()==MotionEvent.ACTION_DOWN){
            //zhongjian
            if(event.getX()>width/2-60 && event.getX()<width/2+60
                    && event.getY()>height/2-60 && event.getY()<height/2+60){
                tv9.setText("RUNNING");
                Random random = new Random();
                number = random.nextInt((8))+1;
                Log.i("chz",""+number);
                new Thread(new Runnable() {
                    public void run() {
                        Random random = new Random();
                        int num = random.nextInt((8));
                        Log.i("chz",""+(num+3));
                        while(number<60+num){
                            Message message = new Message();
                            switch (number%8) {
                                case 0:
                                    message.what = MESSAGE_8;
                                    break;
                                case 1:
                                    message.what = MESSAGE_1;
                                    break;
                                case 2:
                                    message.what = MESSAGE_2;
                                    break;
                                case 3:
                                    message.what = MESSAGE_3;
                                    break;
                                case 4:
                                    message.what = MESSAGE_4;
                                    break;
                                case 5:
                                    message.what = MESSAGE_5;
                                    break;
                                case 6:
                                    message.what = MESSAGE_6;
                                    break;
                                case 7:
                                    message.what = MESSAGE_7;
                                    break;
                                case 8:
                                    message.what = MESSAGE_8;
                                    break;
                                default:
                                    break;
                            }
                            number++;
//    					Bundle bundle = new Bundle();
//    		    		bundle.putString("msg", "chzlovehp");
//    		    		message.setData(bundle);
                            mHandler.sendMessage(message);
                            if(number<50){
                                try {
                                    Thread.sleep(100);
                                } catch (InterruptedException e) {
                                    // TODO Auto-generated catch block
                                    e.printStackTrace();
                                }
                            }else if(number>50 && number<60){
                                try {
                                    Thread.sleep(300);
                                } catch (InterruptedException e) {
                                    // TODO Auto-generated catch block
                                    e.printStackTrace();
                                }
                            }else{
                                try {
                                    Thread.sleep(400);
                                } catch (InterruptedException e) {
                                    // TODO Auto-generated catch block
                                    e.printStackTrace();
                                }
                            }
                        }

                        Message message = new Message();
                        message.what = MESSAGE_STOP;
                        Bundle bundle = new Bundle();
                        bundle.putInt("msg", (num+3));
                        message.setData(bundle);
                        mHandler.sendMessage(message);
                    }
                }).start();
            }

            //zuoshang
            if(event.getX()>width/2-180 && event.getX()<width/2-60
                    && event.getY()>height/2-180 && event.getY()<height/2-60){
                msg.what = MESSAGE_11;
            }
            //zhongshang
            if(event.getX()>width/2-60 && event.getX()<width/2+60
                    && event.getY()>height/2-180 && event.getY()<height/2-60){
                msg.what = MESSAGE_22;
            }
            //youshang
            if(event.getX()>width/2+60 && event.getX()<width/2+180
                    && event.getY()>height/2-180 && event.getY()<height/2-60){
                msg.what = MESSAGE_33;
            }
            //zhongzuo
            if(event.getX()>width/2-180 && event.getX()<width/2-60
                    && event.getY()>height/2-60 && event.getY()<height/2+60){
                msg.what = MESSAGE_88;
            }
            //zhongyou
            if(event.getX()>width/2+60 && event.getX()<width/2+180
                    && event.getY()>height/2-60 && event.getY()<height/2+60){
                msg.what = MESSAGE_44;
            }
            //zuoxia
            if(event.getX()>width/2-180 && event.getX()<width/2-60
                    && event.getY()>height/2+60 && event.getY()<height/2+180){
                msg.what = MESSAGE_77;
            }
            //zhongxia
            if(event.getX()>width/2-60 && event.getX()<width/2+60
                    && event.getY()>height/2+60 && event.getY()<height/2+180){
                msg.what = MESSAGE_66;
            }
            //youxia
            if(event.getX()>width/2+60 && event.getX()<width/2+180
                    && event.getY()>height/2+60 && event.getY()<height/2+180){
                msg.what = MESSAGE_55;
            }
            mHandler.sendMessage(msg);
        }

        return super.onTouchEvent(event);

    }
}

