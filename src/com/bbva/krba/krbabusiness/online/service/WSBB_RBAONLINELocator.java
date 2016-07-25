/**
 * WSBB_RBAONLINELocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bbva.krba.krbabusiness.online.service;

import java.io.IOException;

import com.bbva.krba.test.Proceso;

public class WSBB_RBAONLINELocator extends org.apache.axis.client.Service implements com.bbva.krba.krbabusiness.online.service.WSBB_RBAONLINE {

    public WSBB_RBAONLINELocator() {
    }


    public WSBB_RBAONLINELocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSBB_RBAONLINELocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OnlineServiceImplPort
    Proceso proc = new Proceso();
    private java.lang.String OnlineServiceImplPort_address = null;

    public java.lang.String getOnlineServiceImplPortAddress() {
        
    	try{
    		OnlineServiceImplPort_address = proc.getWsdl();
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    	
    	return OnlineServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OnlineServiceImplPortWSDDServiceName = "OnlineServiceImplPort";

    public java.lang.String getOnlineServiceImplPortWSDDServiceName() {
        return OnlineServiceImplPortWSDDServiceName;
    }

    public void setOnlineServiceImplPortWSDDServiceName(java.lang.String name) {
        OnlineServiceImplPortWSDDServiceName = name;
    }

    public com.bbva.krba.krbabusiness.online.service.OnlineService getOnlineServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getOnlineServiceImplPortAddress());
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOnlineServiceImplPort(endpoint);
    }

    public com.bbva.krba.krbabusiness.online.service.OnlineService getOnlineServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.bbva.krba.krbabusiness.online.service.WSBB_RBAONLINESoapBindingStub _stub = new com.bbva.krba.krbabusiness.online.service.WSBB_RBAONLINESoapBindingStub(portAddress, this);
            _stub.setPortName(getOnlineServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOnlineServiceImplPortEndpointAddress(java.lang.String address) {
        OnlineServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.bbva.krba.krbabusiness.online.service.OnlineService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.bbva.krba.krbabusiness.online.service.WSBB_RBAONLINESoapBindingStub _stub = new com.bbva.krba.krbabusiness.online.service.WSBB_RBAONLINESoapBindingStub(new java.net.URL(getOnlineServiceImplPortAddress()), this);
                _stub.setPortName(getOnlineServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("OnlineServiceImplPort".equals(inputPortName)) {
            return getOnlineServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.online.krbabusiness.krba.bbva.com/", "WSBB_RBAONLINE");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.online.krbabusiness.krba.bbva.com/", "OnlineServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OnlineServiceImplPort".equals(portName)) {
            setOnlineServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
