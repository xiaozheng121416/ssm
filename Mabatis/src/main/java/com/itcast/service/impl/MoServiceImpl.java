package com.itcast.service.impl;

import com.itcast.bean.Mone;
import com.itcast.dao.MoneMapper;
import com.itcast.service.MoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoServiceImpl implements MoService {
    @Autowired
    private MoneMapper moneMapper;

    @Override
    public void getsaveALL(Mone mone) {
        //第二种方法 是在Spring核心文件夹进行配置映射文件
        moneMapper.moneySave(mone);
        //TODO:第二种方法 需配置mabatisConfig.xml文件
        //InputStream resourceAsStream = Resources.getResourceAsStream("mabatisConfig.xml");
        //SqlSession sqlSession = new SqlSessionFactoryBuilder().build(resourceAsStream).openSession();
        //MoneMapper mapper = sqlSession.getMapper(MoneMapper.class);
        //List<mone> moneList = mapper.getUser();
        //for (mone mone : moneList) {
        //   System.out.println(mone);
        //}
    }

    @Override
    public List<Mone> getfindALL() {
        //第一种方法
        List<Mone> moneList = moneMapper.getUser();
        //TODO:第二种方法 需配置mabatisConfig.xml文件
        //InputStream resourceAsStream = Resources.getResourceAsStream("mabatisConfig.xml");
        //SqlSession sqlSession = new SqlSessionFactoryBuilder().build(resourceAsStream).openSession();
        //MoneMapper mapper = sqlSession.getMapper(MoneMapper.class);
        //
        //mapper.moneySave(mone);
        //sqlSession.commit();
        return moneList;
    }
}
