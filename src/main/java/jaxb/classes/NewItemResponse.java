
package jaxb.classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{https://rca.ac.rw/anselme/soap-app}ItemDetails"/>
 *         &lt;element name="Supplier" type="{https://rca.ac.rw/anselme/soap-app}SupplierDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "item",
    "supplier"
})
@XmlRootElement(name = "NewItemResponse", namespace = "https://rca.ac.rw/anselme/soap-app")
public class NewItemResponse {

    @XmlElement(name = "Item", namespace = "https://rca.ac.rw/anselme/soap-app", required = true)
    protected ItemDetails item;
    @XmlElement(name = "Supplier", namespace = "https://rca.ac.rw/anselme/soap-app", required = true)
    protected SupplierDetails supplier;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDetails }
     *     
     */
    public ItemDetails getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDetails }
     *     
     */
    public void setItem(ItemDetails value) {
        this.item = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierDetails }
     *     
     */
    public SupplierDetails getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierDetails }
     *     
     */
    public void setSupplier(SupplierDetails value) {
        this.supplier = value;
    }

}
