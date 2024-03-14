package com.example.DemoCrawl.controllers;

import com.example.DemoCrawl.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/product")
public class ProductController {
    private ArrayList<Product> products = new ArrayList<>();
    @GetMapping("")
    public String home(Model model){
        model.addAttribute("products", products);
        return "Home";
    }
    @GetMapping("/get/{id}")
    public String detail(@PathVariable String id, Model model) {
        Product item = null;
        for (Product product : products) {
            if (product.getId().equals(id)) {
                item = product;
                break;
            }
        }
        if (item != null) {
            model.addAttribute("product", item);
            return "Detail";
        } else {
            return "error";
        }
    }
    @PostMapping("/create")
    @ResponseBody
    public Product createProduct(@RequestBody Product data){
        System.out.println(data);
        Map<String, String> responseMap;
        responseMap = new HashMap<>();
        products.add(data);
        return data;
    }
}
