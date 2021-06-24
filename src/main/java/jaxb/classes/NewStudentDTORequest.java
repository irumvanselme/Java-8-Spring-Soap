
package jaxb.classes;

import javax.annotation.Generated;
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
 *         &lt;element name="Student" type="{https://rca.ac.rw/anselme/soap-app}Student"/>
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
    "student"
})
@XmlRootElement(name = "NewStudentDTORequest")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class NewStudentDTORequest {

    @XmlElement(name = "Student", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Student student;

    /**
     * Gets the value of the student property.
     * 
     * @return
     *     possible object is
     *     {@link Student }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Student getStudent() {
        return student;
    }

    /**
     * Sets the value of the student property.
     * 
     * @param value
     *     allowed object is
     *     {@link Student }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setStudent(Student value) {
        this.student = value;
    }

}
