package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (partRepository.count() == 0 && productRepository.count() == 0) {

            // === Sample Parts ===

            // 1. Outsourced Part
            OutsourcedPart networkCard = new OutsourcedPart();
            networkCard.setCompanyName("TechNova Solutions");
            networkCard.setName("Wireless Network Card");
            networkCard.setInv(15);
            networkCard.setPrice(34.99);
            networkCard.setId(100L);
            networkCard.setMaxInv(20);
            networkCard.setMinInv(5);
            outsourcedPartRepository.save(networkCard);

            // 2. Inhouse Part
            InhousePart ram = new InhousePart();
            ram.setName("RAM 16GB");
            ram.setInv(30);
            ram.setPrice(49.99);
            ram.setId(101L);
            ram.setMaxInv(35);
            ram.setMinInv(10);
            inhousePartRepository.save(ram);

            // 3. Inhouse Part
            InhousePart ssd = new InhousePart();
            ssd.setName("1TB SSD");
            ssd.setInv(20);
            ssd.setPrice(89.99);
            ssd.setId(102L);
            ssd.setMaxInv(35);
            ssd.setMinInv(10);
            inhousePartRepository.save(ssd);

            // 4. Inhouse Part
            InhousePart psu = new InhousePart();
            psu.setName("Power Supply 650W");
            psu.setInv(15);
            psu.setPrice(69.99);
            psu.setId(103L);
            psu.setMaxInv(35);
            psu.setMinInv(10);
            inhousePartRepository.save(psu);

            // 5. Outsourced Part
            OutsourcedPart cooler = new OutsourcedPart();
            cooler.setCompanyName("CoolerTech Inc.");
            cooler.setName("CPU Cooler");
            cooler.setInv(25);
            cooler.setPrice(39.99);
            cooler.setId(104L);
            cooler.setMaxInv(35);
            cooler.setMinInv(10);
            outsourcedPartRepository.save(cooler);


            // === Sample Products ===

            Product desktopPC = new Product("Desktop PC", 799.99, 10);
            Product gamingLaptop = new Product("Gaming Laptop", 1199.99, 7);
            Product workstation = new Product("Workstation Tower", 999.99, 5);
            Product miniPC = new Product("Mini PC", 499.99, 12);
            Product allInOne = new Product("All-in-One PC", 649.99, 8);

            productRepository.save(desktopPC);
            productRepository.save(gamingLaptop);
            productRepository.save(workstation);
            productRepository.save(miniPC);
            productRepository.save(allInOne);

        }




        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
