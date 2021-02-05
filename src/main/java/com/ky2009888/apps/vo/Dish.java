package com.ky2009888.apps.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Lenovo
 */
@Data
public class Dish implements Serializable {
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;
    public enum Type {MEAT, FISH, OTHER}
}
