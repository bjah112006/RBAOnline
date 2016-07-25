package com.bbva.krba.krbabusiness.online.service;

public class OnlineServiceProxy implements com.bbva.krba.krbabusiness.online.service.OnlineService {
  private String _endpoint = null;
  private com.bbva.krba.krbabusiness.online.service.OnlineService onlineService = null;
  
  public OnlineServiceProxy() {
    _initOnlineServiceProxy();
  }
  
  public OnlineServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initOnlineServiceProxy();
  }
  
  private void _initOnlineServiceProxy() {
    try {
      onlineService = (new com.bbva.krba.krbabusiness.online.service.WSBB_RBAONLINELocator()).getOnlineServiceImplPort();
      if (onlineService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)onlineService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)onlineService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (onlineService != null)
      ((javax.xml.rpc.Stub)onlineService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.bbva.krba.krbabusiness.online.service.OnlineService getOnlineService() {
    if (onlineService == null)
      _initOnlineServiceProxy();
    return onlineService;
  }
  
  public com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO getConsultaOnline(com.bbva.krba.krbabusiness.online.service.EntradaOnlineDTO arg0) throws java.rmi.RemoteException, com.bbva.spring.gce.ErrorAplicacion{
    if (onlineService == null)
      _initOnlineServiceProxy();
    return onlineService.getConsultaOnline(arg0);
  }
  
  
}