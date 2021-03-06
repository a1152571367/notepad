package com.example.roylurui.memo;

/**
 * Created by sf roylurui on 2019/11/20.
 */
//一个备忘录
public class OneMemo {
    //颜色标识符
    private int tag;
    private String textDate;
    private String textTime;
    //是否提醒
    private boolean alarm;
    private String mainText;

    public OneMemo(int tag, String textDate, String textTime,boolean alarm, String mainText) {
        this.tag=tag;
        this.textDate=textDate;
        this.textTime=textTime;
        this.alarm=alarm;
        this.mainText=mainText;
    }

    //getter
    public int getTag(){
        return tag;
    }
    public String getTextDate(){
        return textDate;
    }
    public String getTextTime(){
        return textTime;
    }
    public boolean getAlarm(){ return alarm; }
    public String getMainText(){
        return mainText;
    }

    //setter
    public void setTag(int tag){
        this.tag=tag;
    }
    public void setTextDate(String textDate){
        this.textDate=textDate;
    }
    public void setTextTime(String textTime){
        this.textTime=textTime;
    }
    public void setAlarm(boolean alarm){
        this.alarm=alarm;
    }
    public void setMainText(String mainText){
        this.mainText=mainText;
    }
}
