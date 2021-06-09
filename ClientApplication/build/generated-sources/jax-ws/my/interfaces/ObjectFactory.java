
package my.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the my.interfaces package. 
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

    private final static QName _AddEmployee_QNAME = new QName("http://interfaces.my/", "addEmployee");
    private final static QName _AddEmployeeResponse_QNAME = new QName("http://interfaces.my/", "addEmployeeResponse");
    private final static QName _GetAllCountries_QNAME = new QName("http://interfaces.my/", "getAllCountries");
    private final static QName _GetAllCountriesResponse_QNAME = new QName("http://interfaces.my/", "getAllCountriesResponse");
    private final static QName _GetAllEmployees_QNAME = new QName("http://interfaces.my/", "getAllEmployees");
    private final static QName _GetAllEmployeesResponse_QNAME = new QName("http://interfaces.my/", "getAllEmployeesResponse");
    private final static QName _GetEmployeeByID_QNAME = new QName("http://interfaces.my/", "getEmployeeByID");
    private final static QName _GetEmployeeByIDResponse_QNAME = new QName("http://interfaces.my/", "getEmployeeByIDResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: my.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddEmployee }
     * 
     */
    public AddEmployee createAddEmployee() {
        return new AddEmployee();
    }

    /**
     * Create an instance of {@link AddEmployeeResponse }
     * 
     */
    public AddEmployeeResponse createAddEmployeeResponse() {
        return new AddEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetAllCountries }
     * 
     */
    public GetAllCountries createGetAllCountries() {
        return new GetAllCountries();
    }

    /**
     * Create an instance of {@link GetAllCountriesResponse }
     * 
     */
    public GetAllCountriesResponse createGetAllCountriesResponse() {
        return new GetAllCountriesResponse();
    }

    /**
     * Create an instance of {@link GetAllEmployees }
     * 
     */
    public GetAllEmployees createGetAllEmployees() {
        return new GetAllEmployees();
    }

    /**
     * Create an instance of {@link GetAllEmployeesResponse }
     * 
     */
    public GetAllEmployeesResponse createGetAllEmployeesResponse() {
        return new GetAllEmployeesResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeByID }
     * 
     */
    public GetEmployeeByID createGetEmployeeByID() {
        return new GetEmployeeByID();
    }

    /**
     * Create an instance of {@link GetEmployeeByIDResponse }
     * 
     */
    public GetEmployeeByIDResponse createGetEmployeeByIDResponse() {
        return new GetEmployeeByIDResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddEmployee }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "addEmployee")
    public JAXBElement<AddEmployee> createAddEmployee(AddEmployee value) {
        return new JAXBElement<AddEmployee>(_AddEmployee_QNAME, AddEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployeeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddEmployeeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "addEmployeeResponse")
    public JAXBElement<AddEmployeeResponse> createAddEmployeeResponse(AddEmployeeResponse value) {
        return new JAXBElement<AddEmployeeResponse>(_AddEmployeeResponse_QNAME, AddEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCountries }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCountries }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getAllCountries")
    public JAXBElement<GetAllCountries> createGetAllCountries(GetAllCountries value) {
        return new JAXBElement<GetAllCountries>(_GetAllCountries_QNAME, GetAllCountries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCountriesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCountriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getAllCountriesResponse")
    public JAXBElement<GetAllCountriesResponse> createGetAllCountriesResponse(GetAllCountriesResponse value) {
        return new JAXBElement<GetAllCountriesResponse>(_GetAllCountriesResponse_QNAME, GetAllCountriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployees }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllEmployees }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getAllEmployees")
    public JAXBElement<GetAllEmployees> createGetAllEmployees(GetAllEmployees value) {
        return new JAXBElement<GetAllEmployees>(_GetAllEmployees_QNAME, GetAllEmployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployeesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllEmployeesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getAllEmployeesResponse")
    public JAXBElement<GetAllEmployeesResponse> createGetAllEmployeesResponse(GetAllEmployeesResponse value) {
        return new JAXBElement<GetAllEmployeesResponse>(_GetAllEmployeesResponse_QNAME, GetAllEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeByID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEmployeeByID }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getEmployeeByID")
    public JAXBElement<GetEmployeeByID> createGetEmployeeByID(GetEmployeeByID value) {
        return new JAXBElement<GetEmployeeByID>(_GetEmployeeByID_QNAME, GetEmployeeByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeByIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetEmployeeByIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://interfaces.my/", name = "getEmployeeByIDResponse")
    public JAXBElement<GetEmployeeByIDResponse> createGetEmployeeByIDResponse(GetEmployeeByIDResponse value) {
        return new JAXBElement<GetEmployeeByIDResponse>(_GetEmployeeByIDResponse_QNAME, GetEmployeeByIDResponse.class, null, value);
    }

}
