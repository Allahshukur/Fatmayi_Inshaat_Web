package build.tools.Fatmayi_inshaat_web.Dto.ResponseDto;

import build.tools.Fatmayi_inshaat_web.Dto.Dto.CustomersDto;

public class CustomersResponseDto {

    private Integer id;
    private String name;
    private String phone;
    private String address;
    private String other;

    public Integer getId() {
        return id;
    }

    public CustomersResponseDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CustomersResponseDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public CustomersResponseDto setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public CustomersResponseDto setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getOther() {
        return other;
    }

    public CustomersResponseDto setOther(String other) {
        this.other = other;
        return this;
    }

    @Override
    public String toString() {
        return "CustomersResponseDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", other='" + other + '\'' +
                '}';
    }

    public static CustomersResponseDto toDto(CustomersDto customersDto){
        return new CustomersResponseDto()
                .setId(customersDto.getId())
                .setName(customersDto.getName())
                .setPhone(customersDto.getPhone())
                .setAddress(customersDto.getAddress())
                .setOther(customersDto.getOther());
    }
}
