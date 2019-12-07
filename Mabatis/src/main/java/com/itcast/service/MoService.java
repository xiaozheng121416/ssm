package com.itcast.service;

import com.itcast.bean.Mone;

import java.util.List;

public interface MoService {
    void getsaveALL(Mone mone);

    List<Mone> getfindALL();
}
