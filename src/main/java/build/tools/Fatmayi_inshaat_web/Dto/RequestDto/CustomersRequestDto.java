package build.tools.Fatmayi_inshaat_web.Dto.RequestDto;

import build.tools.Fatmayi_inshaat_web.Dto.Dto.CustomersDto;

public class CustomersRequestDto {

    private Integer id;
    private String name;
    private String phone;
    private String address;
    private String other;

    public Integer getId() {
        return id;
    }

    public CustomersRequestDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CustomersRequestDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public CustomersRequestDto setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public CustomersRequestDto setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getOther() {
        return other;
    }

    public CustomersRequestDto setOther(String other) {
        this.other = other;
        return this;
    }

    public CustomersDto toDto(){
        return new CustomersDto()
                .setId(this.getId())
                .setName(this.getName())
                .setPhone(this.getPhone())
                .setAddress(this.getAddress())
                .setOther(this.getOther());
    }

    @Override
    public String toString() {
        return "CustomersRequestDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
