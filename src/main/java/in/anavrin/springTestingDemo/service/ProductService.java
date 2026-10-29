package in.anavrin.springTestingDemo.service;

import in.anavrin.springTestingDemo.entity.Product;
import in.anavrin.springTestingDemo.repository.ProductRepository;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(Long id) {

        return productRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Product not found: " + id)
        );
    }

    public Product createProduct(Product product) {

        boolean alreadyExists;
        if (productRepository.existsByName(product.getName())) alreadyExists = true;
        else alreadyExists = false;

        if (alreadyExists){
            throw new IllegalArgumentException("Product Already exists");

        }

        return productRepository.save(product);
    }
}
