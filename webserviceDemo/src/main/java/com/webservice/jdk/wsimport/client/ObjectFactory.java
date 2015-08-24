
package com.webservice.jdk.wsimport.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webservice.jdk.wsimport.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SayHelloToPersionResponseReturn_QNAME = new QName("", "return");
    private final static QName _SayHelloToPersionName_QNAME = new QName("", "name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservice.jdk.wsimport.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayHelloToPersionResponse }
     * 
     */
    public SayHelloToPersionResponse createSayHelloToPersionResponse() {
        return new SayHelloToPersionResponse();
    }

    /**
     * Create an instance of {@link SayHelloToPersion }
     * 
     */
    public SayHelloToPersion createSayHelloToPersion() {
        return new SayHelloToPersion();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = SayHelloToPersionResponse.class)
    public JAXBElement<String> createSayHelloToPersionResponseReturn(String value) {
        return new JAXBElement<String>(_SayHelloToPersionResponseReturn_QNAME, String.class, SayHelloToPersionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = SayHelloToPersion.class)
    public JAXBElement<String> createSayHelloToPersionName(String value) {
        return new JAXBElement<String>(_SayHelloToPersionName_QNAME, String.class, SayHelloToPersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = SayHelloResponse.class)
    public JAXBElement<String> createSayHelloResponseReturn(String value) {
        return new JAXBElement<String>(_SayHelloToPersionResponseReturn_QNAME, String.class, SayHelloResponse.class, value);
    }

}
