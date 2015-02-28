/*
 * 文件名：UploadController.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： UploadController.java
 * 修改人：qinfei
 * 修改时间：2015年2月27日
 * 修改内容：新增
 */
package com.cuit.DogeMusicDataService.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.better517na.logcompontent.business.LogBusiness;
import com.google.gson.Gson;

/**
 * TODO 添加类的一句话简单描述.
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * <pre>
 * </pre>
 * 
 * @author     qinfei
 */
@Component("uploadController")
public class UploadController extends BaseController{
    @Resource(name="logBusiness")
    private LogBusiness logBusiness;
    
    private Gson gson=new Gson();
    
    @RequestMapping(value="",method=RequestMethod.POST)
    public @ResponseBody String uploadMusicTest1(@RequestBody String param)
    {
        return "";
    }
    @RequestMapping(value="/appFindAdBySpaceCodesGet.htm",method=RequestMethod.GET)
    public @ResponseBody String uploadMusicTest2(HttpServletRequest request,HttpServletResponse response)
    {
        return "";
    }
    @RequestMapping(value="",method = RequestMethod.POST)
    public @ResponseBody String uploadMusicTest3(HttpServletRequest request,HttpServletResponse response)
    {
        return "";
    }

}
