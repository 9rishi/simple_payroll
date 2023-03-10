package com.rishitha.test;

import com.rishitha.StringUtil;

public class TestStringUtil {
	
	public static void main(String[] args) {
		StringUtil st = new StringUtil();
		System.out.println(st.toUpper("rishi"));
		System.out.println(StringUtil.toLower("Mani"));
		System.err.println(st.toLower("DEVI"));
		
	
	}

}
