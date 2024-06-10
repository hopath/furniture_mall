package com.hopath.furns.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

/**
 * @author 张志伟
 * @version 1.0
 */
public class DataUtils {

    public static <T> T copyParamToBean(Map value, T bean){
        try {
            BeanUtils.populate(bean, value);
        }catch (Exception e){
            e.printStackTrace();
        }

        return bean;
    }
}
