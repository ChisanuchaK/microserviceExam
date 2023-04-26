package com.example.limitsService.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Limits {
    private int maximum;
    private int minimum;
}
