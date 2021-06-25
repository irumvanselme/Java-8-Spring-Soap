
package jaxb.classes.items;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxb.classes.items package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxb.classes.items
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NewItemRequest }
     * 
     */
    public NewItemRequest createNewItemRequest() {
        return new NewItemRequest();
    }

    /**
     * Create an instance of {@link ItemDetails }
     * 
     */
    public ItemDetails createItemDetails() {
        return new ItemDetails();
    }

    /**
     * Create an instance of {@link UpdateItemRequest }
     * 
     */
    public UpdateItemRequest createUpdateItemRequest() {
        return new UpdateItemRequest();
    }

    /**
     * Create an instance of {@link GetItemDetailsRequest }
     * 
     */
    public GetItemDetailsRequest createGetItemDetailsRequest() {
        return new GetItemDetailsRequest();
    }

    /**
     * Create an instance of {@link DeleteItemRequest }
     * 
     */
    public DeleteItemRequest createDeleteItemRequest() {
        return new DeleteItemRequest();
    }

    /**
     * Create an instance of {@link DeleteItemResponse }
     * 
     */
    public DeleteItemResponse createDeleteItemResponse() {
        return new DeleteItemResponse();
    }

    /**
     * Create an instance of {@link UpdateItemResponse }
     * 
     */
    public UpdateItemResponse createUpdateItemResponse() {
        return new UpdateItemResponse();
    }

    /**
     * Create an instance of {@link GetAllItemsResponse }
     * 
     */
    public GetAllItemsResponse createGetAllItemsResponse() {
        return new GetAllItemsResponse();
    }

    /**
     * Create an instance of {@link NewItemResponse }
     * 
     */
    public NewItemResponse createNewItemResponse() {
        return new NewItemResponse();
    }

    /**
     * Create an instance of {@link GetItemDetailsResponse }
     * 
     */
    public GetItemDetailsResponse createGetItemDetailsResponse() {
        return new GetItemDetailsResponse();
    }

    /**
     * Create an instance of {@link GetAllItemsRequest }
     * 
     */
    public GetAllItemsRequest createGetAllItemsRequest() {
        return new GetAllItemsRequest();
    }

}
