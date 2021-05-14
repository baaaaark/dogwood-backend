package com.dogwood.treeguide.data;

import com.dogwood.treeguide.models.Tree;
import org.springframework.data.repository.CrudRepository;

public interface TreeRepository extends CrudRepository<Tree, Integer> {
}
