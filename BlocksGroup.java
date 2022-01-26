package com.company;

import java.util.List;

public class BlocksGroup implements  CompositeBlock{

    public BlocksGroup(List <CompositeBlock> blocks){
        this.blocks = blocks;
    }

    String color;
    String material;
    List <CompositeBlock> blocks;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List getBlocks() {
        return blocks;
    }
}
