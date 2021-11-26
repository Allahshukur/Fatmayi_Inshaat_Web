package build.tools.Fatmayi_inshaat_web.Dto.RequestDto;

import build.tools.Fatmayi_inshaat_web.Dto.Dto.ToolsDto;

import java.math.BigDecimal;

public class ToolsRequestDto {

    private Long id;
    private String name;
    private String barcode;
    private String photo;
    private String producer;
    private Integer number;
    private String size;
    private BigDecimal buy;
    private BigDecimal sale;

    public Long getId() {
        return id;
    }

    public ToolsRequestDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ToolsRequestDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getBarcode() {
        return barcode;
    }

    public ToolsRequestDto setBarcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public ToolsRequestDto setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getProducer() {
        return producer;
    }

    public ToolsRequestDto setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public ToolsRequestDto setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public String getSize() {
        return size;
    }

    public ToolsRequestDto setSize(String size) {
        this.size = size;
        return this;
    }

    public BigDecimal getBuy() {
        return buy;
    }

    public ToolsRequestDto setBuy(BigDecimal buy) {
        this.buy = buy;
        return this;
    }

    public BigDecimal getSale() {
        return sale;
    }

    public ToolsRequestDto setSale(BigDecimal sale) {
        this.sale = sale;
        return this;
    }

    public ToolsDto toDto(){
        return new ToolsDto()
                .setId(this.getId())
                .setName(this.getName())
                .setBarcode(this.getBarcode())
                .setPhoto(this.getPhoto())
                .setProducer(this.getProducer())
                .setNumber(this.getNumber())
                .setSize(this.getSize())
                .setBuy(this.getBuy())
                .setSale(this.getSale());
    }

    @Override
    public String toString() {
        return "ToolsRequestDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", barcode='" + barcode + '\'' +
                ", photo='" + photo + '\'' +
                ", producer='" + producer + '\'' +
                ", number=" + number +
                ", size='" + size + '\'' +
                ", buy=" + buy +
                ", sale=" + sale +
                '}';
    }
}
