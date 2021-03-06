package ir.maktab39.base.service;

import java.io.Serializable;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public interface BaseService <E, PK extends Serializable>{

    void save(E e);

    E findById(PK id);

    void deleteById(PK id);

    void update(E e);

    List<E> findAll();

    List<E> findAll(Predicate<E> predicate);

    List findAll(Function<E, ?> function);

}
