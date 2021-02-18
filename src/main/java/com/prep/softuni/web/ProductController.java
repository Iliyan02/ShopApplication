package com.prep.softuni.web;

import com.prep.softuni.models.binding.ProductAddBindingModel;
import com.prep.softuni.models.entity.Product;
import com.prep.softuni.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;
    private final ModelMapper modelMapper;

    public ProductController(ProductService productService, ModelMapper modelMapper) {
        this.productService = productService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/add")
    public String add(Model model, HttpSession httpSession){
        if (httpSession.getAttribute("user") == null){
            return "redirect:login";
        }

        if (!model.containsAttribute("productAddBindingModel")){
            model.addAttribute("productAddBindingModel", new ProductAddBindingModel());
        }
        return "add-product";
    }

    @PostMapping("/add")
    public String addConfirm(ProductAddBindingModel productAddBindingModel){

        productService.addProduct(modelMapper.map(productAddBindingModel, Product.class));
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(){
        productService.delete();
        return "home";
    }
}
