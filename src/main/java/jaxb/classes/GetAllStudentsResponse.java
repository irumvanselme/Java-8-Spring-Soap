
package jaxb.classes;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Student" type="{https://rca.ac.rw/anselme/soap-app}Student" maxOccurs="unbounded"/>
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
@XmlRootElement(name = "GetAllStudentsResponse")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class GetAllStudentsResponse {

    @XmlElement(name = "Student", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Student> student;

    /**
     * Gets the value of the student property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the student property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Student }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-24T06:23:16+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Student> getStudent() {
        if (student == null) {
            student = new ArrayList<Student>();
        }
        return this.student;
    }

}
