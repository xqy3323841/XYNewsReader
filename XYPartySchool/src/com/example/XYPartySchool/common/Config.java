package com.example.XYPartySchool.common;

import android.os.Environment;

public class Config {
	
	//host
    // Production
    public static final String _LOCAL_HOST = "http://124.165.228.5:8999/newsreader/";
    // Development
    //public static final String _LOCAL_HOST = "http://192.168.0.136:8999/newsreader/";

    //图片服务器
    public static final String _IMAGE_SERVER = "http://sjdx.xiaoyi.gov.cn/";

	//获取所有版信息
	public static final String _ACTION_ALL_PUBLICATIONS = "MainServlet?action=all_info";/*?categoryId=7f619bb037cb4b19b11e15e6ac6dbfc449b1d658*/
	
	//获取最新一版的信息
	public static final String _ACTION_LAST_PUBLICATION_INFO = "MainServlet?action=publication_lastinfo";
	
	//得到新闻详情
	public static final String _ACTION_NEWS_DETAIL = "MainServlet?action=news_detail";/*?newsId=b0e33ef9108c433788d5700cd6fe7b1b0fb7ab8b*/
	
	//获取所有类型名称及其id
	public static final String _ACTION_PUBLICATION_DETAIL = "MainServlet?action=publication_detail";

    //获取封面图
    public static String _ACTION_COVER = "cover.jsp";
	//网络错误
	public static final String _TOAST_ERROR = "网络错误";

    //本地封面存储文件夹
    public static String _PATH_CACHE_COVER;



}
