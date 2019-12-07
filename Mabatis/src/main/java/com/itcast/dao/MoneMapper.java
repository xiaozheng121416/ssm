package com.itcast.dao;

import com.itcast.bean.Mone;

import java.util.List;

public interface MoneMapper {
     List<Mone> getUser();

     void  moneySave(Mone mone);
}
