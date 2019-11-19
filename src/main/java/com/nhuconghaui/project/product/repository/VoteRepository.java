package com.nhuconghaui.project.product.repository;

import com.nhuconghaui.project.product.model.Vote;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VoteRepository extends PagingAndSortingRepository<Vote,LinkageError> {
}
