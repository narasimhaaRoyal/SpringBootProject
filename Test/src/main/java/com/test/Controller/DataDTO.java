package com.test.Controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataDTO {

    @NotNull(message = "sould not be null")
    @NotBlank(message = "should not be blank")
    private String name;

}
