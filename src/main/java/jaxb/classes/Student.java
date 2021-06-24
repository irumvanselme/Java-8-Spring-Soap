
package jaxb.classes;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Student complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Student">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentsPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Student", propOrder = {
    "id",
    "firstName",
    "lastName",
    "gender",
    "dateOfBirth",
    "resident",
    "parentsPhoneNumber"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Student {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected long id;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String firstName;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String lastName;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String gender;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String dateOfBirth;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String resident;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String parentsPhoneNumber;

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

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the resident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getResident() {
        return resident;
    }

    /**
     * Sets the value of the resident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setResident(String value) {
        this.resident = value;
    }

    /**
     * Gets the value of the parentsPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getParentsPhoneNumber() {
        return parentsPhoneNumber;
    }

    /**
     * Sets the value of the parentsPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setParentsPhoneNumber(String value) {
        this.parentsPhoneNumber = value;
    }

}
