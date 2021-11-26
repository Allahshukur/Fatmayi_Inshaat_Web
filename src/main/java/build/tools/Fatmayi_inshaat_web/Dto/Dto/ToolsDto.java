package build.tools.Fatmayi_inshaat_web.Dto.Dto;

import build.tools.Fatmayi_inshaat_web.Entity.ToolsEntity;

import java.math.BigDecimal;

public class ToolsDto {

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

    public ToolsDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ToolsDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getBarcode() {
        return barcode;
    }

    public ToolsDto setBarcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public ToolsDto setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getProducer() {
        return producer;
    }

    public ToolsDto setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public ToolsDto setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public String getSize() {
        return size;
    }

    public ToolsDto setSize(String size) {
        this.size = size;
        return this;
    }

    public BigDecimal getBuy() {
        return buy;
    }

    public ToolsDto setBuy(BigDecimal buy) {
        this.buy = buy;
        return this;
    }

    public BigDecimal getSale() {
        return sale;
    }

    public ToolsDto setSale(BigDecimal sale) {
        this.sale = sale;
        return this;
    }

    public static ToolsDto toToolsDto(ToolsEntity toolsEntity){
        return new ToolsDto()
                .setId(toolsEntity.getId())
                .setName(toolsEntity.getName())
                .setBarcode(toolsEntity.getBarcode())
                .setPhoto(toolsEntity.getPhoto())
                .setProducer(toolsEntity.getProducer())
                .setNumber(toolsEntity.getNumber())
                .setSize(toolsEntity.getSize())
                .setBuy(toolsEntity.getBuy())
                .setSale(toolsEntity.getSale());
    }

    public ToolsEntity toEntity(){
        return new ToolsEntity()
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

}
