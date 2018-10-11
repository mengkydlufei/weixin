package com.hua.utils;

import com.hua.pojo.ReceiveXmlEntity;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.Iterator;


/**
 * Created by 1 on 2018/10/11.
 */
public class ReceiveXmlProcess {

/*    public ReceiveXmlEntity getMsgEntity(String xml){
        ReceiveXmlEntity msg=null;
    try{
        if(xml==null||xml.length()<0){
            return null;
        }else{
            Document document= DocumentHelper.parseText(xml);
            Element root=document.getRootElement();
            Iterator iterator=root.elementIterator();
            msg=new ReceiveXmlEntity();
            while (iterator.hasNext()){
                Element element= (Element) iterator.next();
            }

        }
    }catch (Exception e){
        System.out.println("xml异常");
        e.printStackTrace();
    }*/
}
