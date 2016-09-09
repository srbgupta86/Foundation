package com.test;

import org.w3c.dom.Document;

import com.sterlingcommerce.baseutil.SCXmlUtil;
import com.test.sterling.ue.CollectionCreditCard;
import com.yantra.yfc.log.YFCLogCategory;
import com.yantra.yfs.japi.YFSEnvironment;

public class Test {

	private static final YFCLogCategory log = YFCLogCategory
			.instance(Test.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Document testMethod (YFSEnvironment env, Document inXML)
	{
		
		log.info("srb test class: "+ SCXmlUtil.getString(inXML));
		return inXML;
	}

	
}
