/**
 * ErrorAplicacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bbva.spring.gce;

public class ErrorAplicacion  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private com.bbva.krba.krbabusiness.online.service.CodigoError codigoError;

    private com.bbva.krba.krbabusiness.online.service.Severidad severidad;

    private java.lang.String descripcionUsuario;

    private java.lang.String descripcionTecnica;

    private com.bbva.spring.gce.Propiedad[] metainfo;

    public ErrorAplicacion() {
    }

    public ErrorAplicacion(
           com.bbva.krba.krbabusiness.online.service.CodigoError codigoError,
           com.bbva.krba.krbabusiness.online.service.Severidad severidad,
           java.lang.String descripcionUsuario,
           java.lang.String descripcionTecnica,
           com.bbva.spring.gce.Propiedad[] metainfo) {
        this.codigoError = codigoError;
        this.severidad = severidad;
        this.descripcionUsuario = descripcionUsuario;
        this.descripcionTecnica = descripcionTecnica;
        this.metainfo = metainfo;
    }


    /**
     * Gets the codigoError value for this ErrorAplicacion.
     * 
     * @return codigoError
     */
    public com.bbva.krba.krbabusiness.online.service.CodigoError getCodigoError() {
        return codigoError;
    }


    /**
     * Sets the codigoError value for this ErrorAplicacion.
     * 
     * @param codigoError
     */
    public void setCodigoError(com.bbva.krba.krbabusiness.online.service.CodigoError codigoError) {
        this.codigoError = codigoError;
    }


    /**
     * Gets the severidad value for this ErrorAplicacion.
     * 
     * @return severidad
     */
    public com.bbva.krba.krbabusiness.online.service.Severidad getSeveridad() {
        return severidad;
    }


    /**
     * Sets the severidad value for this ErrorAplicacion.
     * 
     * @param severidad
     */
    public void setSeveridad(com.bbva.krba.krbabusiness.online.service.Severidad severidad) {
        this.severidad = severidad;
    }


    /**
     * Gets the descripcionUsuario value for this ErrorAplicacion.
     * 
     * @return descripcionUsuario
     */
    public java.lang.String getDescripcionUsuario() {
        return descripcionUsuario;
    }


    /**
     * Sets the descripcionUsuario value for this ErrorAplicacion.
     * 
     * @param descripcionUsuario
     */
    public void setDescripcionUsuario(java.lang.String descripcionUsuario) {
        this.descripcionUsuario = descripcionUsuario;
    }


    /**
     * Gets the descripcionTecnica value for this ErrorAplicacion.
     * 
     * @return descripcionTecnica
     */
    public java.lang.String getDescripcionTecnica() {
        return descripcionTecnica;
    }


    /**
     * Sets the descripcionTecnica value for this ErrorAplicacion.
     * 
     * @param descripcionTecnica
     */
    public void setDescripcionTecnica(java.lang.String descripcionTecnica) {
        this.descripcionTecnica = descripcionTecnica;
    }


    /**
     * Gets the metainfo value for this ErrorAplicacion.
     * 
     * @return metainfo
     */
    public com.bbva.spring.gce.Propiedad[] getMetainfo() {
        return metainfo;
    }


    /**
     * Sets the metainfo value for this ErrorAplicacion.
     * 
     * @param metainfo
     */
    public void setMetainfo(com.bbva.spring.gce.Propiedad[] metainfo) {
        this.metainfo = metainfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErrorAplicacion)) return false;
        ErrorAplicacion other = (ErrorAplicacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoError==null && other.getCodigoError()==null) || 
             (this.codigoError!=null &&
              this.codigoError.equals(other.getCodigoError()))) &&
            ((this.severidad==null && other.getSeveridad()==null) || 
             (this.severidad!=null &&
              this.severidad.equals(other.getSeveridad()))) &&
            ((this.descripcionUsuario==null && other.getDescripcionUsuario()==null) || 
             (this.descripcionUsuario!=null &&
              this.descripcionUsuario.equals(other.getDescripcionUsuario()))) &&
            ((this.descripcionTecnica==null && other.getDescripcionTecnica()==null) || 
             (this.descripcionTecnica!=null &&
              this.descripcionTecnica.equals(other.getDescripcionTecnica()))) &&
            ((this.metainfo==null && other.getMetainfo()==null) || 
             (this.metainfo!=null &&
              java.util.Arrays.equals(this.metainfo, other.getMetainfo())));
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
        if (getCodigoError() != null) {
            _hashCode += getCodigoError().hashCode();
        }
        if (getSeveridad() != null) {
            _hashCode += getSeveridad().hashCode();
        }
        if (getDescripcionUsuario() != null) {
            _hashCode += getDescripcionUsuario().hashCode();
        }
        if (getDescripcionTecnica() != null) {
            _hashCode += getDescripcionTecnica().hashCode();
        }
        if (getMetainfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetainfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetainfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErrorAplicacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bbva.com/spring/gce", "errorAplicacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.online.krbabusiness.krba.bbva.com/", "codigoError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "severidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.online.krbabusiness.krba.bbva.com/", "severidad"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionTecnica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionTecnica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metainfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metainfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bbva.com/spring/gce", "Propiedad"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "propiedad"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
