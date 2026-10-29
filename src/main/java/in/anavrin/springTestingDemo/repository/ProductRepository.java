package in.anavrin.springTestingDemo.repository;

import in.anavrin.springTestingDemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

    boolean existsByName(String name);
}
