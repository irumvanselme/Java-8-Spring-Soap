
package jaxb.classes;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "id"
})
@XmlRootElement(name = "DeleteStudentRequest")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class DeleteStudentRequest {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected long id;

    /**
     * Gets the value of the id property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setId(long value) {
        this.id = value;
    }

}
