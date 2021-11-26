package build.tools.Fatmayi_inshaat_web.Dto.ResponseDto;

import build.tools.Fatmayi_inshaat_web.Dto.Dto.ToolsDto;

import java.math.BigDecimal;

public class ToolsResponseDto {

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

    public ToolsResponseDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ToolsResponseDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getBarcode() {
        return barcode;
    }

    public ToolsResponseDto setBarcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public ToolsResponseDto setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getProducer() {
        return producer;
    }

    public ToolsResponseDto setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public ToolsResponseDto setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public String getSize() {
        return size;
    }

    public ToolsResponseDto setSize(String size) {
        this.size = size;
        return this;
    }

    public BigDecimal getBuy() {
        return buy;
    }

    public ToolsResponseDto setBuy(BigDecimal buy) {
        this.buy = buy;
        return this;
    }

    public BigDecimal getSale() {
        return sale;
    }

    public ToolsResponseDto setSale(BigDecimal sale) {
        this.sale = sale;
        return this;
    }

    public static ToolsResponseDto toolsResponseDto(ToolsDto toolsDto){
        return new ToolsResponseDto()
                .setId(toolsDto.getId())
                .setName(toolsDto.getName())
                .setBarcode(toolsDto.getBarcode())
                .setPhoto(toolsDto.getPhoto())
                .setProducer(toolsDto.getProducer())
                .setNumber(toolsDto.getNumber())
                .setSize(toolsDto.getSize())
                .setBuy(toolsDto.getBuy())
                .setSale(toolsDto.getSale());
    }
}
