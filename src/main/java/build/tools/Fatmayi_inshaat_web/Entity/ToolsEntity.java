package build.tools.Fatmayi_inshaat_web.Entity;

import build.tools.Fatmayi_inshaat_web.Dto.Dto.ToolsDto;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tools")
public class ToolsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String barcode;
    private String photo;
    private String producer;
    private Integer number;
    private String size;
    private BigDecimal buy;
    private BigDecimal sale;

    public ToolsEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ToolsEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public ToolsEntity setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getBarcode() {
        return barcode;
    }

    public ToolsEntity setBarcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    public String getProducer() {
        return producer;
    }

    public ToolsEntity setProducer(String produser) {
        this.producer = produser;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public ToolsEntity setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public String getSize() {
        return size;
    }

    public ToolsEntity setSize(String size) {
        this.size = size;
        return this;
    }

    public BigDecimal getBuy() {
        return buy;
    }

    public ToolsEntity setBuy(BigDecimal buy) {
        this.buy = buy;
        return this;
    }

    public BigDecimal getSale() {
        return sale;
    }

    public ToolsEntity setSale(BigDecimal sale) {
        this.sale = sale;
        return this;
    }

}
