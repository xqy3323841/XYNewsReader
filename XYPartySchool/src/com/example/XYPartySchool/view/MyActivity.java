package com.example.XYPartySchool.view;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;
import com.example.XYPartySchool.R;
import com.example.XYPartySchool.common.Config;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class MyActivity extends Activity {
    private ListView listView;
      String resultStr;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        getList();
       // String result = requestDataByGetAsyncTask(Config._LOCAL_HOST+Config._ACTION_LAST_PUBLICATION_INFO);
       // Log.d("result1",result);

    }

    public void getList(){

        listView = (ListView) findViewById(R.id.listView);
        ListAdapter adapter = new ListAdapter(this);
        adapter.addSectionHeaderItem("2002-3-1");
        ArrayList<ListElement> elements = new ArrayList<ListElement>();
        for (int i = 0; i < 2; i++) {
            ContentListElement element = new ContentListElement();
            element.setTitle((i+1) + "集");
            elements.add(element);
        }
        adapter.addList(elements);
        adapter.addSectionHeaderItem("2002-2-2");

        elements = new ArrayList<ListElement>();
        for (int i = 0; i < 3; i++) {
            ContentListElement element = new ContentListElement();
            element.setTitle( (i+1) + "集");
            elements.add(element);
        }
        adapter.addList(elements);

        listView.setAdapter(adapter);
    }
    public void requestDataByGetAsyncTask(String url){


        String urladdress = url;

        final HttpPost requeset = new HttpPost(urladdress);

        int timeout = 30*1000;

        HttpParams httpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(httpParams, timeout);
        HttpConnectionParams.setSoTimeout(httpParams,timeout);

        final DefaultHttpClient client = new DefaultHttpClient();
        client.setParams(httpParams);

        AsyncTask<Integer,Integer,Integer> task = new AsyncTask<Integer, Integer, Integer>() {
            @Override
            protected Integer doInBackground(Integer... integers) {
                try {
                    HttpResponse response =  client.execute(requeset);
                    resultStr = EntityUtils.toString(response.getEntity(), "UTF-8");

                } catch (IOException e) {
                    Toast.makeText(MyActivity.this, "网路访问出错，请稍后重试", Toast.LENGTH_SHORT).show();
                }
                return 0;  //To change body of implemented methods use File | Settings | File Templates.
            }

            @Override
            protected void onPostExecute(Integer integer) {
                Toast.makeText(MyActivity.this, "请求成功", Toast.LENGTH_SHORT).show();
                Log.d("result",resultStr);
                try {
                   JSONObject jsonob = new JSONObject(resultStr);
                } catch (JSONException e) {
                    e.printStackTrace();
                }




            }

        };
        task.execute(0);

    }

}
