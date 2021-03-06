package org.globaltester.control.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.globaltester.control.RemoteControlHandler;

/**
 * SOAP proxy for {@link RemoteControlHandler} objects.
 * @author mboonk
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
public class RemoteControlHandlerProxy extends AbstractProxy<RemoteControlHandler> implements RemoteControlHandler{

	public RemoteControlHandlerProxy(RemoteControlHandler handler) {
		super(handler);
	}

	@Override
	@WebMethod
	public String getIdentifier() {
		return handler.getIdentifier();
	}

	@Override
	@WebMethod
	public String getType() {
		return handler.getType();
	}

	@Override
	public <T> T getAdapter(Class<T> that) {
		if (that.isAssignableFrom(this.getClass())) {
			return that.cast(this);
		}
		return null;
	}

}
