
package com.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.service package. 
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

    private final static QName _AllCompte_QNAME = new QName("http://service.com/", "AllCompte");
    private final static QName _RecupCompte_QNAME = new QName("http://service.com/", "RecupCompte");
    private final static QName _ConvertionCfatoEuro_QNAME = new QName("http://service.com/", "ConvertionCfatoEuro");
    private final static QName _BanqueEntity_QNAME = new QName("http://service.com/", "banqueEntity");
    private final static QName _ConvertionCfatoEuroResponse_QNAME = new QName("http://service.com/", "ConvertionCfatoEuroResponse");
    private final static QName _AllCompteResponse_QNAME = new QName("http://service.com/", "AllCompteResponse");
    private final static QName _RecupCompteResponse_QNAME = new QName("http://service.com/", "RecupCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BanqueEntity }
     * 
     */
    public BanqueEntity createBanqueEntity() {
        return new BanqueEntity();
    }

    /**
     * Create an instance of {@link ConvertionCfatoEuro }
     * 
     */
    public ConvertionCfatoEuro createConvertionCfatoEuro() {
        return new ConvertionCfatoEuro();
    }

    /**
     * Create an instance of {@link ConvertionCfatoEuroResponse }
     * 
     */
    public ConvertionCfatoEuroResponse createConvertionCfatoEuroResponse() {
        return new ConvertionCfatoEuroResponse();
    }

    /**
     * Create an instance of {@link AllCompteResponse }
     * 
     */
    public AllCompteResponse createAllCompteResponse() {
        return new AllCompteResponse();
    }

    /**
     * Create an instance of {@link RecupCompteResponse }
     * 
     */
    public RecupCompteResponse createRecupCompteResponse() {
        return new RecupCompteResponse();
    }

    /**
     * Create an instance of {@link AllCompte }
     * 
     */
    public AllCompte createAllCompte() {
        return new AllCompte();
    }

    /**
     * Create an instance of {@link RecupCompte }
     * 
     */
    public RecupCompte createRecupCompte() {
        return new RecupCompte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "AllCompte")
    public JAXBElement<AllCompte> createAllCompte(AllCompte value) {
        return new JAXBElement<AllCompte>(_AllCompte_QNAME, AllCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "RecupCompte")
    public JAXBElement<RecupCompte> createRecupCompte(RecupCompte value) {
        return new JAXBElement<RecupCompte>(_RecupCompte_QNAME, RecupCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertionCfatoEuro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "ConvertionCfatoEuro")
    public JAXBElement<ConvertionCfatoEuro> createConvertionCfatoEuro(ConvertionCfatoEuro value) {
        return new JAXBElement<ConvertionCfatoEuro>(_ConvertionCfatoEuro_QNAME, ConvertionCfatoEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BanqueEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "banqueEntity")
    public JAXBElement<BanqueEntity> createBanqueEntity(BanqueEntity value) {
        return new JAXBElement<BanqueEntity>(_BanqueEntity_QNAME, BanqueEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertionCfatoEuroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "ConvertionCfatoEuroResponse")
    public JAXBElement<ConvertionCfatoEuroResponse> createConvertionCfatoEuroResponse(ConvertionCfatoEuroResponse value) {
        return new JAXBElement<ConvertionCfatoEuroResponse>(_ConvertionCfatoEuroResponse_QNAME, ConvertionCfatoEuroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "AllCompteResponse")
    public JAXBElement<AllCompteResponse> createAllCompteResponse(AllCompteResponse value) {
        return new JAXBElement<AllCompteResponse>(_AllCompteResponse_QNAME, AllCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "RecupCompteResponse")
    public JAXBElement<RecupCompteResponse> createRecupCompteResponse(RecupCompteResponse value) {
        return new JAXBElement<RecupCompteResponse>(_RecupCompteResponse_QNAME, RecupCompteResponse.class, null, value);
    }

}
