package org.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ToString
@Component
@NoArgsConstructor
@AllArgsConstructor
public class ArithmeticOperators {

    @Value("#{22+11}")
    private Integer add;

    public Integer getAdd() {
        return add;
    }
}