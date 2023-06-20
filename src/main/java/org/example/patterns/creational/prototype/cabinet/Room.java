package org.example.patterns.creational.prototype.cabinet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Room implements Serializable {
    private String name = "Room name";
    private int number = 0;
    private Cabinet cabinet = new Cabinet();
}
