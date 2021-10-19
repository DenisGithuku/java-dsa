package com.denisgithuku.adts.trees;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> children;
    
    //initialize tree
    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        drinks.addChild(hot);
        drinks.addChild(cold);
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        hot.addChild(tea);
        hot.addChild(coffee);
        TreeNode black = new TreeNode("Black");
        TreeNode green = new TreeNode("Green");
        tea.addChild(black);
        tea.addChild(green);
        TreeNode americano = new TreeNode("Americano");
        TreeNode cappuccino = new TreeNode("Cappuccino");
        TreeNode latte = new TreeNode("Tea");
        coffee.addChild(americano);
        coffee.addChild(latte);
        coffee.addChild(cappuccino);
        TreeNode alcoholic = new TreeNode("Alcoholic");
        TreeNode non_alcoholic = new TreeNode("Non_alcoholic");
        cold.addChild(alcoholic);
        cold.addChild(non_alcoholic);
        TreeNode wine = new TreeNode("wine");
        TreeNode beer = new TreeNode("Beer");
        alcoholic.addChild(wine);
        alcoholic.addChild(beer);
        TreeNode fanta = new TreeNode("Fanta");
        TreeNode pepsi = new TreeNode("Pepsi");
        non_alcoholic.addChild(fanta);
        non_alcoholic.addChild(pepsi);
        System.out.println(drinks.printTree(0));
        
    }
    
    public void addChild(TreeNode node) {
        this.children.add(node);
    }
    
    public String printTree(int level) {
        String result;
        result = " |__".repeat(level) + data + "\n";
        for (TreeNode node : this.children) {
            result += node.printTree(level + 1);
        }
        return result;
    }
}
