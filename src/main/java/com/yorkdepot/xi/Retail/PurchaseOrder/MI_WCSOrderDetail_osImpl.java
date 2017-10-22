package com.yorkdepot.xi.Retail.PurchaseOrder;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "com.yorkdepot.xi.Retail.PurchaseOrder.MI_WCSOrderDetail_os")
public class MI_WCSOrderDetail_osImpl implements MI_WCSOrderDetail_os {
	
	@Override
	public DemoResponse getOrderDetail(final DemoRequest req) throws Exception{
		DemoResponse c = new DemoResponse();
		c.setUserId("Hello, " + req.getUserId() + "!");
		c.setPassword("York password is: " +req.getPassword() );
		return c;
	}

}
