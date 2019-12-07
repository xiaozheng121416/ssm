package com.itcast.contrerllor;



import com.itcast.bean.Mone;
import com.itcast.service.MoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/money")
public class MomeyController {
    @Autowired
    public MoService moService;


    //获取金额显示数据
    @RequestMapping("/usermoney")
    public ModelAndView getUserMoney() throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        List<Mone> moneList = moService.getfindALL();
        modelAndView.addObject("moneList",moneList);
        modelAndView.setViewName("moneList");
        return modelAndView;
    }
    //存入金额
    @RequestMapping(value = "/insert",produces ="text/html;charset=utf-8")
    @ResponseBody
    public String save(Mone mone) throws IOException {
        System.out.println("第一步");
        moService.getsaveALL(mone);
        return "保存成功";
    }
}
