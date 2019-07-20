package net.thumbtack.onlineshop.dto.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class ProductDto {

    @NotBlank
    @Size(max = 50)
    private String name;

    @NotNull
    private Integer price;

    @NotNull
    private int count;

    List<Long> categories;
}