/**
 * SalidaOnlineDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bbva.krba.krbabusiness.online.service;

public class SalidaOnlineDTO  implements java.io.Serializable {
    private java.lang.String codigoCliente;

    private java.lang.String diligencia;

    private com.bbva.krba.krbabusiness.online.service.DocumentosOnlineDTO[] documentos;

    private java.lang.String riesgo;

    private java.lang.String uidPeticion;

    public SalidaOnlineDTO() {
    }

    public SalidaOnlineDTO(
           java.lang.String codigoCliente,
           java.lang.String diligencia,
           com.bbva.krba.krbabusiness.online.service.DocumentosOnlineDTO[] documentos,
           java.lang.String riesgo,
           java.lang.String uidPeticion) {
           this.codigoCliente = codigoCliente;
           this.diligencia = diligencia;
           this.documentos = documentos;
           this.riesgo = riesgo;
           this.uidPeticion = uidPeticion;
    }


    /**
     * Gets the codigoCliente value for this SalidaOnlineDTO.
     * 
     * @return codigoCliente
     */
    public java.lang.String getCodigoCliente() {
        return codigoCliente;
    }


    /**
     * Sets the codigoCliente value for this SalidaOnlineDTO.
     * 
     * @param codigoCliente
     */
    public void setCodigoCliente(java.lang.String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }


    /**
     * Gets the diligencia value for this SalidaOnlineDTO.
     * 
     * @return diligencia
     */
    public java.lang.String getDiligencia() {
        return diligencia;
    }


    /**
     * Sets the diligencia value for this SalidaOnlineDTO.
     * 
     * @param diligencia
     */
    public void setDiligencia(java.lang.String diligencia) {
        this.diligencia = diligencia;
    }


    /**
     * Gets the documentos value for this SalidaOnlineDTO.
     * 
     * @return documentos
     */
    public com.bbva.krba.krbabusiness.online.service.DocumentosOnlineDTO[] getDocumentos() {
        return documentos;
    }


    /**
     * Sets the documentos value for this SalidaOnlineDTO.
     * 
     * @param documentos
     */
    public void setDocumentos(com.bbva.krba.krbabusiness.online.service.DocumentosOnlineDTO[] documentos) {
        this.documentos = documentos;
    }

    public com.bbva.krba.krbabusiness.online.service.DocumentosOnlineDTO getDocumentos(int i) {
        return this.documentos[i];
    }

    public void setDocumentos(int i, com.bbva.krba.krbabusiness.online.service.DocumentosOnlineDTO _value) {
        this.documentos[i] = _value;
    }


    /**
     * Gets the riesgo value for this SalidaOnlineDTO.
     * 
     * @return riesgo
     */
    public java.lang.String getRiesgo() {
        return riesgo;
    }


    /**
     * Sets the riesgo value for this SalidaOnlineDTO.
     * 
     * @param riesgo
     */
    public void setRiesgo(java.lang.String riesgo) {
        this.riesgo = riesgo;
    }


    /**
     * Gets the uidPeticion value for this SalidaOnlineDTO.
     * 
     * @return uidPeticion
     */
    public java.lang.String getUidPeticion() {
        return uidPeticion;
    }


    /**
     * Sets the uidPeticion value for this SalidaOnlineDTO.
     * 
     * @param uidPeticion
     */
    public void setUidPeticion(java.lang.String uidPeticion) {
        this.uidPeticion = uidPeticion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalidaOnlineDTO)) return false;
        SalidaOnlineDTO other = (SalidaOnlineDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoCliente==null && other.getCodigoCliente()==null) || 
             (this.codigoCliente!=null &&
              this.codigoCliente.equals(other.getCodigoCliente()))) &&
            ((this.diligencia==null && other.getDiligencia()==null) || 
             (this.diligencia!=null &&
              this.diligencia.equals(other.getDiligencia()))) &&
            ((this.documentos==null && other.getDocumentos()==null) || 
             (this.documentos!=null &&
              java.util.Arrays.equals(this.documentos, other.getDocumentos()))) &&
            ((this.riesgo==null && other.getRiesgo()==null) || 
             (this.riesgo!=null &&
              this.riesgo.equals(other.getRiesgo()))) &&
            ((this.uidPeticion==null && other.getUidPeticion()==null) || 
             (this.uidPeticion!=null &&
              this.uidPeticion.equals(other.getUidPeticion())));
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
        if (getCodigoCliente() != null) {
            _hashCode += getCodigoCliente().hashCode();
        }
        if (getDiligencia() != null) {
            _hashCode += getDiligencia().hashCode();
        }
        if (getDocumentos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRiesgo() != null) {
            _hashCode += getRiesgo().hashCode();
        }
        if (getUidPeticion() != null) {
            _hashCode += getUidPeticion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalidaOnlineDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.online.krbabusiness.krba.bbva.com/", "salidaOnlineDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diligencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diligencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.online.krbabusiness.krba.bbva.com/", "documentosOnlineDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riesgo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "riesgo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uidPeticion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uidPeticion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
