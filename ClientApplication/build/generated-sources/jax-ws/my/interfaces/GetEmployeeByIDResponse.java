
package my.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEmployeeByIDResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEmployeeByIDResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getEmployeeById" type="{http://interfaces.my/}employee" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEmployeeByIDResponse", propOrder = {
    "getEmployeeById"
})
public class GetEmployeeByIDResponse {

    protected Employee getEmployeeById;

    /**
     * Gets the value of the getEmployeeById property.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getGetEmployeeById() {
        return getEmployeeById;
    }

    /**
     * Sets the value of the getEmployeeById property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setGetEmployeeById(Employee value) {
        this.getEmployeeById = value;
    }

}
