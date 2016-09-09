package com.test.sterling.ue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.sterlingcommerce.baseutil.SCXmlUtil;
import com.yantra.yfc.log.YFCLogCategory;
import com.yantra.yfc.log.YFCLogUtil;
import com.yantra.yfs.japi.YFSEnvironment;
import com.yantra.yfs.japi.YFSExtnPaymentCollectionInputStruct;
import com.yantra.yfs.japi.YFSExtnPaymentCollectionOutputStruct;
import com.yantra.yfs.japi.YFSUserExitException;
import com.yantra.yfs.japi.ue.YFSCollectionCreditCardUE;

public class CollectionCreditCard implements YFSCollectionCreditCardUE{

	
	private static final YFCLogCategory log = YFCLogCategory
			.instance(CollectionCreditCard.class.getName());
	
	@Override
	public YFSExtnPaymentCollectionOutputStruct collectionCreditCard(
			YFSEnvironment env, YFSExtnPaymentCollectionInputStruct inStruct)
			throws YFSUserExitException {
		// TODO Auto-generated method stub
		
		
		log.debug(" inStruct value is :: " + inStruct);

		
		DateFormat df1 = new SimpleDateFormat("yyyyMMddHHmmss");
		DateFormat df2 = new SimpleDateFormat("yyyyMMdd'T'HH:mm:ss");
		
		YFSExtnPaymentCollectionOutputStruct outStruct = new YFSExtnPaymentCollectionOutputStruct();
		
		Calendar c = Calendar.getInstance(); 
		Date d = c.getTime();
		
		String chargeType = inStruct.chargeType;  
		
		
//		if (YFCLogUtil.isDebugEnabled()) {
			log.debug("srb CharegeType =" + chargeType 
					+ " currentAuthAmount ="+ inStruct.currentAuthorizationAmount
					+ " requestAmount ="+ inStruct.requestAmount);
//		}
		
		System.out.println("srb CharegeType =" + chargeType 
				+ " currentAuthAmount ="+ inStruct.currentAuthorizationAmount
				+ " requestAmount ="+ inStruct.requestAmount);
		
		String sAuthTimeFormatted = df2.format(d);
		outStruct.authTime = sAuthTimeFormatted;
		
		
		outStruct.authCode ="SUCCESS";
		outStruct.authorizationId = df1.format(d);
		outStruct.requestID = "1234";
		outStruct.authorizationAmount = inStruct.requestAmount;
		outStruct.authorizationExpirationDate = getExpriationDate();
		outStruct.authReturnMessage = "All the things like AuthIDs";
		outStruct.retryFlag = "";
	//outStruct.collectionDate.
		
	log.debug(" outStruct value is :: " + outStruct.authAVS);

		
		return outStruct;
	}
	
	private String getExpriationDate()
	{
		
		Calendar cal = Calendar.getInstance();
		DateFormat df1 = new SimpleDateFormat("yyyyMMddHHmmss"); // "yyyy-MM-dd'T'HH:mm:ss"
		String currDate = df1.format(cal.getTime());
		log.debug(" Current Date :: " + currDate);
		cal.add(Calendar.DATE, 5);
		String updtExpDate = df1.format(cal.getTime());
		log.debug(" updated exp date :: " + updtExpDate);
		log.debug("<==== getExpirationDate method : End ====>");
		return updtExpDate;
	}
	

}
