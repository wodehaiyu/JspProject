package cn.li.myTaglib;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class ForEachTag extends SimpleTagSupport{
	private Object items;
	public void setItems(Object items) {
		this.items = items;
		
	}
	public void setItem(String item) {
		this.item = item;
	}
	private String item;
	private Collection<Object> collection() {
		if(items.getClass().isArray()) {
			List<Object> list = new ArrayList<Object>();
			for(int i=0;i<Array.getLength(items);i++){
				list.add(Array.get(items, i));
			}
			return list;
		}else if(items instanceof List) {
			return (List)items;
		}else if(items instanceof Set) {
			return (Set)items;
		}else if(items instanceof Map) {
			return ((Map)items).entrySet();
		}
		return null;
	}
	@Override
	public void doTag() throws JspException, IOException {
		for (Object ob : collection()) {
			this.getJspContext().setAttribute(item, ob);
			this.getJspBody().invoke(null);

		}
	}
}
