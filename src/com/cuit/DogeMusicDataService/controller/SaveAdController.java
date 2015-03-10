package com.cuit.DogeMusicDataService.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.google.gson.Gson;

@Component("saveAdController")
public class SaveAdController extends BaseController{
	@Value("${resourceServer.uploadPath}")
	private String adsUploadFile;
	@RequestMapping(value = "saveAdContentController.htm", method = RequestMethod.POST)
	public @ResponseBody
	String saveAdContentController(HttpServletRequest request, HttpServletResponse response)
				{
		try{
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		List<MultipartFile> mfList=multipartRequest.getFiles("AdsImage");//获取名称为AdContent的文件对象 
		String path="";
		for(MultipartFile mf:mfList)
		{
			path=addFile(mf);
		}
		if("".equals(path))
		{
			return toFailure("0", "上传失败,返回广告图片地址为空！");
		}
		else{
			return toSuccess("Message",toGson(path));
			}
		}
		catch(Exception e)
		{
			return toFailure("-1","程序异常,异常信息为："+e.getMessage());
		}
	}
	
	public String addFile(MultipartFile file) throws IOException, InterruptedException {
	      String fileName = file.getOriginalFilename();// 文件原名
	      String newFileName =fileName;//存储到本地后文件的名字
	      SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");//设置文件目录的名字
	      String parentPath=sdf.format(new Date());//设置父文件夹名称
	      File dirFile = new File(adsUploadFile+"/"+parentPath);
//	      File dirFile = new File(loadProperties());// 加载配置文件中的根目录
	      // 文件夹不存在则创建文件夹
	      if (!dirFile.exists() || !(dirFile.isDirectory()))
	        {dirFile.mkdirs();}
	      File targetfile = new File(dirFile+"/"+newFileName);
	      FileCopyUtils.copy(file.getBytes(), targetfile);//拷贝文件到服务器本地
	      return "/"+parentPath+"/"+newFileName;//返回文件的存放路径
	   }
}
