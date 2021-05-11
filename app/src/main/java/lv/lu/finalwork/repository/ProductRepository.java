package lv.lu.finalwork.repository;

import lv.lu.finalwork.model.Product;
import org.hibernate.criterion.CriteriaQuery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Repository
class ProductRepository implements Repository<Product> {

    private Long idCounter = 0L;
    private Map<Long, Product> repository = new HashMap<>();

    @Override
    public Long save(Product product) {
        idCounter++;
        product.setId(idCounter);
        repository.put(idCounter, product);
        return idCounter;
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(repository.values());
//        return sessionFactory.getCurrentSession()
//                .createQuery("FROM PRODUCTS P", Product.class)
//                .getResultList();
//
//        Session session = sessionFactory.getCurrentSession();
//        CriteriaQuery<Product> criteriaQuery = session.getCriteriaBuilder().createQuery(product.class);
    }

    @Override
    public Product findById(Long id) {
        return repository.get(id);
    }

    @Override
    public void delete(Long id) {
        repository.remove(id);
    }
}

