package com.neo.common;

import java.io.Serializable;
import java.text.SimpleDateFormat;

/**
 * @Author: ChenSong
 * @Date: 2018/8/20 16:31
 * @Description:
 */
public abstract class BaseAbstractClass implements Serializable {
    private static final long serialVersionUID = -8802151238353291489L;
    protected SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
}
