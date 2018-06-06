package com.wzy.adapter.headfirst;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * designPattern_wzy
 *
 * @author wangzhenyu
 * @since 2018-06-06 11:32
 */
public class EnumrationIterator implements Iterator {

    Enumeration enumration;

    public EnumrationIterator(Enumeration enumration){
        this.enumration = enumration;
    }

    public boolean hasNext(){
        return enumration.hasMoreElements();
    }

    public Object next(){
        return enumration.nextElement();
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
