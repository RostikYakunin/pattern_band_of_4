package org.example.patterns.creational.prototype.cabinet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cabinet implements Serializable {
    String name = "Cabinet name";
    int number = 0;
}
