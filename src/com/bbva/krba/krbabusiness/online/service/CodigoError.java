/**
 * CodigoError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bbva.krba.krbabusiness.online.service;

public class CodigoError  implements java.io.Serializable {
    private java.lang.String codigoAplicacion;

    private java.lang.String codigoModulo;

    private int secuencia;

    public CodigoError() {
    }

    public CodigoError(
           java.lang.String codigoAplicacion,
           java.lang.String codigoModulo,
           int secuencia) {
           this.codigoAplicacion = codigoAplicacion;
           this.codigoModulo = codigoModulo;
           this.secuencia = secuencia;
    }


    /**
     * Gets the codigoAplicacion value for this CodigoError.
     * 
     * @return codigoAplicacion
     */
    public java.lang.String getCodigoAplicacion() {
        return codigoAplicacion;
    }


    /**
     * Sets the codigoAplicacion value for this CodigoError.
     * 
     * @param codigoAplicacion
     */
    public void setCodigoAplicacion(java.lang.String codigoAplicacion) {
        this.codigoAplicacion = codigoAplicacion;
    }


    /**
     * Gets the codigoModulo value for this CodigoError.
     * 
     * @return codigoModulo
     */
    public java.lang.String getCodigoModulo() {
        return codigoModulo;
    }


    /**
     * Sets the codigoModulo value for this CodigoError.
     * 
     * @param codigoModulo
     */
    public void setCodigoModulo(java.lang.String codigoModulo) {
        this.codigoModulo = codigoModulo;
    }


    /**
     * Gets the secuencia value for this CodigoError.
     * 
     * @return secuencia
     */
    public int getSecuencia() {
        return secuencia;
    }


    /**
     * Sets the secuencia value for this CodigoError.
     * 
     * @param secuencia
     */
    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodigoError)) return false;
        CodigoError other = (CodigoError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoAplicacion==null && other.getCodigoAplicacion()==null) || 
             (this.codigoAplicacion!=null &&
              this.codigoAplicacion.equals(other.getCodigoAplicacion()))) &&
            ((this.codigoModulo==null && other.getCodigoModulo()==null) || 
             (this.codigoModulo!=null &&
              this.codigoModulo.equals(other.getCodigoModulo()))) &&
            this.secuencia == other.getSecuencia();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodigoAplicacion() != null) {
            _hashCode += getCodigoAplicacion().hashCode();
        }
        if (getCodigoModulo() != null) {
            _hashCode += getCodigoModulo().hashCode();
        }
        _hashCode += getSecuencia();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodigoError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.online.krbabusiness.krba.bbva.com/", "codigoError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAplicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoAplicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoModulo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoModulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secuencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secuencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
