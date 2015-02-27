package com.cuit.DogeMusicDataService.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import com.cuit.commons.query.QueryParam;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 描述:基类Controller
 * @version v1.0
 * @author wk
 */
@Controller
public class BaseController {
	private Gson gson=new GsonBuilder().serializeNulls().create();
	/**
	 * log4j
	 */
	protected Logger logger = Logger.getLogger(BaseController.class);
	/**
	 * 描述： 返回成功信息
	 * @param message 提示信息
	 * @return String JSON格式结果
	 * @exception
	 * @throws
	 */
	public String toSuccess(String title,Object obj){
		String jsonStr = toGson(obj);
		String result = "";
		String value = "";
		try {
			if(null != title && null != jsonStr){
				value="{\"Result\":\"1\",\""+title+"\":"+jsonStr+"}";
			}else{
				value="{\"Result\":\"1\"}";
			}
			result = new String(value.getBytes("UTF-8"), "ISO-8859-1");
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			return "{\"Result\":\"-1\",\"Message\":\"UnsupportedEncodingException\"}";
		}
		return result;
	}
	/**
	 * 描述： 返回成功信息
	 * @param message 提示信息
	 * @return String JSON格式结果
	 * @exception
	 * @throws
	 */
	public String toSuccess(String title,String jsonStr){
		String result = "";
		String value = "";
		try {
			if(null != title && null != jsonStr){
				value="{\"Result\":\"1\",\""+title+"\":"+jsonStr+"}";
			}else{
				value="{\"Result\":\"1\"}";
			}
			result = new String(value.getBytes("UTF-8"), "ISO-8859-1");
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			return "{\"Result\":\"-1\",\"Message\":\"UnsupportedEncodingException\"}";
		}
		return result;
	}
	
	/**
	 * 描述：返回成功信息
	 * @return
	 * @author wk
	 * @version v1.0 2013-5-7
	 * @since v1.0
	 */
	public String toSuccess(){
		String value="{\"Result\":\"1\"}";
		String result = "";
		try {
			result = new String(value.getBytes("UTF-8"), "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			return "{\"Result\":\"-1\",\"Message\":\"UnsupportedEncodingException\"}";
		}
		return result;
	}
	
	/**
	 * 描述： 返回失败信息
	 * @param message 提示信息
	 * @return String JSON格式结果
	 * @exception
	 * @throws
	 */
	public String toFailure(String message){
		String result =  "{\"Result\":\"0\",\"Message\":\"" + message + "\"}";
		try {
			result = new String(result.getBytes("UTF-8"), "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		logger.warn("========"+message);
		return result;
	}
	public String toFailure(String code, String message){
		String result =  "{\"Result\":\""+code+"\",\"Message\":\"" + message + "\"}";
		try {
			result = new String(result.getBytes("UTF-8"), "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		logger.warn("========"+message);
		return result;
	}
	
	/**
	 * 描述：转换json格式错误信息
	 * @param error 错误信息
	 * @return  错误信息
	 * @version v1.0 
	 * @date 2012-9-24 上午11:13:00
	 */
	public String toError(String error){
		String result =  "{\"Result\":\"-1\",\"Message\":\"" + error + "\"}";
		try {
			result = new String(result.getBytes("UTF-8"), "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		logger.warn("========"+error);
		return result;
	}
	
	/**
	 * 描述：转换json格式
	 * @param obj
	 * @return
	 * @author wk
	 * @version v1.0 2013-5-27
	 * @since v1.0
	 */
	public String toGson(Object obj){
		return  gson.toJson(obj);
	}
	
	
	/**
	 * 描述：dataGrid控件数据格式
	 * @param total 总数量
	 * @param rows 数据
	 * @return
	 * @author wk
	 * @version v1.0 2013-12-20
	 * @since v1.0
	 */
	public String DataGrid(int total,String rows){
		String json = "{\"total\":" + total + ",\"rows\":"+ rows + "}";
		String result = "";
		try {
			result = new String(json.getBytes("UTF-8"), "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 描述：转换编码格式
	 * 
	 * @param json
	 * @return
	 * @version v1.0
	 * @date 2013-5-14 下午02:23:35
	 */
	public String toResult(String json) {
		String result = "";
		try {
			result = new String(json.getBytes("UTF-8"), "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}
	public <T> QueryParam<T> getQueryParam(HttpServletRequest request,Class<T> cl) {
		String pageSize = request.getParameter("pageSize");
		String pageNum = request.getParameter("pageNum");
		QueryParam<T> param = new QueryParam<T>();
		if(pageSize!=null){
			param.setPageSize(Integer.parseInt(pageSize));
		}else{
			param.setPageSize(1000);
		}
		if(pageNum!=null){
//			int index = (Integer.parseInt(pageNum) - 1) * Integer.parseInt(pageSize);
			param.setPageNum(Integer.parseInt(pageNum));
		}else{
			param.setPageNum(1);
		}
		return param;
	}
}
