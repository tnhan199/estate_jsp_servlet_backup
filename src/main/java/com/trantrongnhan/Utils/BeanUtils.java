package com.trantrongnhan.Utils;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;

public class BeanUtils {
	public static <T> T populate(T bean, Map<String, String[]> properties) {
		System.out.println(properties.getClass());
		properties = (Map<String, String[]>) properties;
		for (Entry<String, String[]> i : properties.entrySet()) {
			if (i.getValue() != null) {
				Field[] fields = bean.getClass().getDeclaredFields();
				if (!i.getKey().equals("buildingTypes")) {
					if (StringUtils.isNotBlank(i.getValue()[0])) {
						for (Field j : fields) {

							if (j.getName().equals(i.getKey())) {
								
								j.setAccessible(true);
								try {
									if (j.getType().equals(Integer.class)) {
									
										j.set(bean, Integer.parseInt(i.getValue()[0]));
									}
									if (j.getType().equals(String.class)) {
										j.set(bean, i.getValue()[0]);
									}
								} catch (IllegalArgumentException | IllegalAccessException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}

								break;
							}
						}
					}
				} else {
					for (Field j : fields) {
						if (j.getName().equals(i.getKey())) {
							j.setAccessible(true);
							try {
								j.set(bean, i.getValue());
							} catch (IllegalArgumentException | IllegalAccessException e) {
								System.out.println(e.getMessage() + "ll");
							}
							break;
						}
					}
				}
			}
		}
		return bean;
	}
	public static <T>String getURLAPI(T object) {
	    StringBuilder url=new StringBuilder("http://localhost:8087/api/admin/building");
	    Field[] fields=object.getClass().getDeclaredFields();
	    int count=0;
	    for(Field i:fields){
	        i.setAccessible(true);
	        try{
	            Object temp=i.get(object);
                if(i.get(object)!=null){
                    count++;
                    if(count==1){
                        url.append("?");
                    }
                    else{
                        url.append("&");
                    }
                    url.append(i.getName());
                    url.append("=");
                    if(!i.getType().equals(String[].class))
                    	url.append(String.valueOf(temp));
                    else{
                    	Object[] temp1=(Object[])i.get(object);
                    	if(temp1.length>0){
                    		url.append(StringUtils.join(temp1,","));
						}
					}

                }
            }catch(Exception e){
	            System.out.print(e.getMessage());
            }

        }
	    System.out.println(url.toString());
	    return url.toString();
    }
}
