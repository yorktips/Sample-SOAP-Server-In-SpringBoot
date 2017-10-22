package com.yorkdepot.xi.Retail.PurchaseOrder;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface MI_WCSOrderDetail_os {

	@WebMethod(operationName = "MT_WCSOrderDetailRequest")
	DemoResponse getOrderDetail(final DemoRequest req) throws Exception;

}
