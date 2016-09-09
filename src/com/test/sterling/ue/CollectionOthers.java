package com.test.sterling.ue;

import com.yantra.yfs.japi.YFSEnvironment;
import com.yantra.yfs.japi.YFSExtnPaymentCollectionInputStruct;
import com.yantra.yfs.japi.YFSExtnPaymentCollectionOutputStruct;
import com.yantra.yfs.japi.YFSUserExitException;
import com.yantra.yfs.japi.ue.YFSCollectionOthersUE;

public class CollectionOthers implements YFSCollectionOthersUE{

	@Override
	public YFSExtnPaymentCollectionOutputStruct collectionOthers(
			YFSEnvironment arg0, YFSExtnPaymentCollectionInputStruct arg1)
			throws YFSUserExitException {
		// TODO Auto-generated method stub
		
		YFSExtnPaymentCollectionOutputStruct outStrut = new YFSExtnPaymentCollectionOutputStruct();
		
		
		return outStrut;
	}

}
