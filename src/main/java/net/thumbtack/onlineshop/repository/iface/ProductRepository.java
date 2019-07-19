package net.thumbtack.onlineshop.repository.iface;

import net.thumbtack.onlineshop.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository  extends CrudRepository<Product, Long> {
}
