package com.company;

import java.util.LinkedList;
import java.util.List;

public class Wall implements Structure{
    private List <CompositeBlock> blocks;

    @Override
    public CompositeBlock findBlockByColor(String color) {

        for (CompositeBlock block : blocks) {
            if (color.equalsIgnoreCase(block.getColor())) {
                return block;
            }
        }
        return null;
    }

    @Override
    public List findBlocksByMaterial(String material) {
        List blocksOfTheSameMaterial = new LinkedList();
        for (CompositeBlock block : blocks) {
            if (material.equalsIgnoreCase(block.getMaterial())) {
                blocksOfTheSameMaterial.add(block);
            }
        }
        return blocksOfTheSameMaterial;
    }

    @Override
    public int count() {
        int counter = 0;
        for (CompositeBlock block : blocks) {
            List numberOfBlocks = block.getBlocks();
            int localCounter = numberOfBlocks.size();
            counter += localCounter;
        }
        return counter;
    }
}
