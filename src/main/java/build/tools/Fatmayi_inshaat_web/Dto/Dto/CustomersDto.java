package build.tools.Fatmayi_inshaat_web.Dto.Dto;

import build.tools.Fatmayi_inshaat_web.Entity.CustomerEntity;

public class CustomersDto {

    private Integer id;
    private String name;
    private String phone;
    private String address;
    private String other;

    public Integer getId() {
        return id;
    }

    public CustomersDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CustomersDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public CustomersDto setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public CustomersDto setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getOther() {
        return other;
    }

    public CustomersDto setOther(String other) {
        this.other = other;
        return this;
    }

    public static CustomersDto toCustomersDto(CustomerEntity customerEntity){
        return new CustomersDto()
                .setId(customerEntity.getId())
                .setName(customerEntity.getName())
                .setPhone(customerEntity.getPhone())
                .setAddress(customerEntity.getAddress())
                .setOther(customerEntity.getOther());
    }

    public CustomerEntity toEntity(){
        return new CustomerEntity()
                .setId(this.getId())
                .setName(this.getName())
                .setPhone(this.getPhone())
                .setAddress(this.getAddress())
                .setOther(this.getOther());
    }

    @Override
    public String toString() {
        return "CustomersDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
