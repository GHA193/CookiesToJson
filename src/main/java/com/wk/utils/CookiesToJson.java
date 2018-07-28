package com.wk.utils;

import com.alibaba.fastjson.JSON;
import com.wk.utils.po.EditThisCookies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 18-7-28.
 */
public class CookiesToJson {

    public static String getJsonFromCookies(String domain, String cookies){
        List<EditThisCookies> editThisCookiesList = new ArrayList<EditThisCookies>();
        cookies = cookies.replaceAll("Cookie: ", "").replace(" ","");
        String cookiePair[] = cookies.split(";");
        long id = 1;
        for (String string:
                cookiePair){
            String key = string.substring(0,string.indexOf('='));
            String value = string.substring(string.indexOf('=')+1,string.length());
            EditThisCookies editThisCookie = new EditThisCookies();
            editThisCookie.setName(key);
            editThisCookie.setValue(value);
            editThisCookie.setId(id);
            id ++;
            editThisCookie.setDomain(domain);
            editThisCookiesList.add(editThisCookie);
        }

        return JSON.toJSONString(editThisCookiesList);
    }
}
