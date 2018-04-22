/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akeso_read_write;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author MarkimOttey
 */
@Entity
@Table(name = "PATIENT_RECORDS")
@NamedQueries({
    @NamedQuery(name = "PatientRecords.findAll", query = "SELECT p FROM PatientRecords p")
    , @NamedQuery(name = "PatientRecords.findById", query = "SELECT p FROM PatientRecords p WHERE p.id = :id")
    , @NamedQuery(name = "PatientRecords.findByFirstName", query = "SELECT p FROM PatientRecords p WHERE p.firstName = :firstName")
    , @NamedQuery(name = "PatientRecords.findByLastName", query = "SELECT p FROM PatientRecords p WHERE p.lastName = :lastName")
    , @NamedQuery(name = "PatientRecords.findByDob", query = "SELECT p FROM PatientRecords p WHERE p.dob = :dob")
    , @NamedQuery(name = "PatientRecords.findByAge", query = "SELECT p FROM PatientRecords p WHERE p.age = :age")
    , @NamedQuery(name = "PatientRecords.findBySex", query = "SELECT p FROM PatientRecords p WHERE p.sex = :sex")
    , @NamedQuery(name = "PatientRecords.findByEmergencyContactFirstName", query = "SELECT p FROM PatientRecords p WHERE p.emergencyContactFirstName = :emergencyContactFirstName")
    , @NamedQuery(name = "PatientRecords.findByEmergencyContactLastName", query = "SELECT p FROM PatientRecords p WHERE p.emergencyContactLastName = :emergencyContactLastName")
    , @NamedQuery(name = "PatientRecords.findByStreetName", query = "SELECT p FROM PatientRecords p WHERE p.streetName = :streetName")
    , @NamedQuery(name = "PatientRecords.findByTownName", query = "SELECT p FROM PatientRecords p WHERE p.townName = :townName")
    , @NamedQuery(name = "PatientRecords.findByZipcode", query = "SELECT p FROM PatientRecords p WHERE p.zipcode = :zipcode")})
public class PatientRecords implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "DOB")
    private String dob;
    @Column(name = "AGE")
    private String age;
    @Column(name = "SEX")
    private String sex;
    @Column(name = "EMERGENCY_CONTACT_FIRST_NAME")
    private String emergencyContactFirstName;
    @Column(name = "EMERGENCY_CONTACT_LAST_NAME")
    private String emergencyContactLastName;
    @Column(name = "STREET_NAME")
    private String streetName;
    @Column(name = "TOWN_NAME")
    private String townName;
    @Column(name = "ZIPCODE")
    private String zipcode;

    public PatientRecords() {
    }

    public PatientRecords(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        String oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        String oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        String oldSex = this.sex;
        this.sex = sex;
        changeSupport.firePropertyChange("sex", oldSex, sex);
    }

    public String getEmergencyContactFirstName() {
        return emergencyContactFirstName;
    }

    public void setEmergencyContactFirstName(String emergencyContactFirstName) {
        String oldEmergencyContactFirstName = this.emergencyContactFirstName;
        this.emergencyContactFirstName = emergencyContactFirstName;
        changeSupport.firePropertyChange("emergencyContactFirstName", oldEmergencyContactFirstName, emergencyContactFirstName);
    }

    public String getEmergencyContactLastName() {
        return emergencyContactLastName;
    }

    public void setEmergencyContactLastName(String emergencyContactLastName) {
        String oldEmergencyContactLastName = this.emergencyContactLastName;
        this.emergencyContactLastName = emergencyContactLastName;
        changeSupport.firePropertyChange("emergencyContactLastName", oldEmergencyContactLastName, emergencyContactLastName);
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        String oldStreetName = this.streetName;
        this.streetName = streetName;
        changeSupport.firePropertyChange("streetName", oldStreetName, streetName);
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        String oldTownName = this.townName;
        this.townName = townName;
        changeSupport.firePropertyChange("townName", oldTownName, townName);
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        String oldZipcode = this.zipcode;
        this.zipcode = zipcode;
        changeSupport.firePropertyChange("zipcode", oldZipcode, zipcode);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PatientRecords)) {
            return false;
        }
        PatientRecords other = (PatientRecords) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "akesolibary.PatientRecords[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
