package build.tools.Fatmayi_inshaat_web.Entity;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String phone;
    private String address;
    private String other;

    public Integer getId() {
        return id;
    }

    public CustomerEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CustomerEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public CustomerEntity setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public CustomerEntity setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getOther() {
        return other;
    }

    public CustomerEntity setOther(String other) {
        this.other = other;
        return this;
    }
}
