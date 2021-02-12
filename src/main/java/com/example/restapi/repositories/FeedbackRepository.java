package com.example.restapi.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.restapi.models.Feedback;

@Repository
public interface FeedbackRepository extends PagingAndSortingRepository<Feedback, Long> {
}
