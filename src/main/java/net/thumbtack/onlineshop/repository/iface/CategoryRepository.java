package net.thumbtack.onlineshop.repository.iface;

import net.thumbtack.onlineshop.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
