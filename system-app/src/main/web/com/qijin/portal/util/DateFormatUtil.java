package com.qijin.portal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatUtil {

	/** 
     * 时间戳转日期 
     * @param ms 
     * @return 
     */  
    public static Date transForDate(Integer ms){  
        if(ms==null){  
            ms=0;  
        }  
        long msl=(long)ms*1000;  
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        Date temp=null;  
        if(ms!=null){  
            try {  
                String str=sdf.format(msl);  
                temp=sdf.parse(str);  
            } catch (ParseException e) {  
                e.printStackTrace();  
            }  
        }  
        return temp;  
    } 
    
    /** 
     * 时间戳转日期 
     * @param ms 时间戳，int
     * @param formatStr 时间格式
     * @return 
     */  
    public static Date transForDate3(Integer ms,String formatStr){  
        if(ms==null){  
            ms=0;  
        }  
        long msl=(long)ms*1000;  
        SimpleDateFormat sdf=new SimpleDateFormat(formatStr);  
        Date temp=null;  
        if(ms!=null){  
            try {  
                String str=sdf.format(msl);  
                temp=sdf.parse(str);  
            } catch (ParseException e) {  
                e.printStackTrace();  
            }  
        }  
        return temp;  
    }  
    
    /** 
     * 时间戳转日期 字符串 
     * @param ms 时间戳，int
     * @param formatStr 时间格式
     * @return 
     */  
    public static String transForDateString(Integer ms,String formatStr){  
        if(ms==null){  
            ms=0;  
        }  
        long msl=(long)ms*1000;  
        SimpleDateFormat sdf=new SimpleDateFormat(formatStr);  
        if(ms!=null){  
        	 return sdf.format(msl);  
        }
		return null;  
    } 
    
    /** 
     * 获取固定时间的时间戳 
     * @return 
     */  
    public static int getTimeStamp(int day, int hour, int minute) {  
        Calendar cal = Calendar.getInstance();  
        cal.add(Calendar.DATE, day);  
        cal.set(Calendar.HOUR_OF_DAY, hour);  
        cal.set(Calendar.SECOND, 0);  
        cal.set(Calendar.MINUTE, minute);  
        cal.set(Calendar.MILLISECOND, 0);  
        return (int) (cal.getTimeInMillis() / 1000);  
    }  
    
    /** 
     * 日期转时间戳 
     * @param date 
     * @return 
     */  
    public static Integer transForMilliSecond(Date date){  
        if(date==null) return null;  
        return (int)(date.getTime()/1000);  
    }  
      
    /** 
     * 获取当前时间戳 
     * @return 
     */  
    public static Integer currentTimeStamp(){  
        return (int)(System.currentTimeMillis()/1000);  
    }  
      
    
    /** 
     * 获取当前时间往上的整点时间 
     * @return 
     */  
    public static int getIntegralTime() {  
        Calendar cal = Calendar.getInstance();  
        cal.add(Calendar.HOUR_OF_DAY, 1);  
        cal.set(Calendar.SECOND, 0);  
        cal.set(Calendar.MINUTE, 0);  
        cal.set(Calendar.MILLISECOND, 0);  
        return (int) (cal.getTimeInMillis() / 1000);  
    }  
      
   
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date temp=transForDate(1526000829);
		System.out.println(temp.toString());
	}

}
