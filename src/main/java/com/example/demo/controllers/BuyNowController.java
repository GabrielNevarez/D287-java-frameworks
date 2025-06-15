package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.PartService;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@Controller
public class BuyNowController {

    private final ProductService productService;
    private final PartService partService;

    @Autowired
    public BuyNowController(ProductService productService, PartService partService) {
        this.productService = productService;
        this.partService = partService;
    }

    @GetMapping("/orderConfirmationPage")
    public String purchaseStatus(@RequestParam("productId") int productId, Model theModel) {
        Product product = productService.findById(productId);
        if (product != null && product.getInv() > 0) {
            product.setInv(product.getInv() - 1);
            productService.save(product);
            theModel.addAttribute("message", "Tracking Number: " + UUID.randomUUID().toString());
        } else {
            theModel.addAttribute("message", "Purchase Failed – Product Not Available.");
        }

        theModel.addAttribute("product", product);
        theModel.addAttribute("parts", partService.findAll());
        return "orderConfirmationPage";
    }
}
