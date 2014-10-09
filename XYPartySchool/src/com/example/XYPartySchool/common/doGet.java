package com.example.XYPartySchool.common;

import android.os.AsyncTask;
import org.apache.http.client.methods.HttpGet;

/**
 * Created by Administrator on 2014/10/9.
 */
public class doGet {
         AsyncTask asyncTask ;
                private void setAsyGetData(){
                        asyncTask = new AsyncTask() {
                            @Override
                            protected Object doInBackground(Object[] objs) {
                                 String url = Config._LOCAL_HOST+Config._ACTION_LAST_PUBLICATION_INFO;
                                HttpGet request = new HttpGet(url);
                                return null;
                            }
                        }

                }

}
