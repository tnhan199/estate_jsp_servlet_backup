package com.trantrongnhan.Utils;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class FormUtils{
	public static <T> T toDTO(T bean,HttpServletRequest req) {
		try {
			BeanUtils.populate(bean,req.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (InvocationTargetException e) {
			System.out.println(e.getMessage());
		}
		return bean;
	}
}
