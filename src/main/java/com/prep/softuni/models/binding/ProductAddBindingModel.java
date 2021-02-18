package com.prep.softuni.models.binding;

import com.prep.softuni.models.entity.CategoryEnum;
import com.prep.softuni.models.entity.SexEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductAddBindingModel {

    private String name;
    private String description;
    private CategoryEnum category;
    private SexEnum sex;
    private BigDecimal price;
}
