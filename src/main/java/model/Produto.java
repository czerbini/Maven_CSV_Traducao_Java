package model;

import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class Produto {
    @CsvBindByName(column = "ProductId", required = true)
    private int id;
    @CsvBindByName(column = "ProductName", required = true)
    private String name;
    @CsvBindByName(column = "Description", required = true)
    private String description;
    @CsvBindByName(column = "Price", required = true)
    private BigDecimal price;
    @CsvBindByName(column = "Category", required = true)
    private String category;
}
