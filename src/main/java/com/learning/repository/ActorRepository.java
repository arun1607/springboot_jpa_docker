package com.learning.repository;

import com.learning.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by amits on 13/07/16.
 */
@Repository
@Transactional
public interface ActorRepository extends JpaRepository<Actor, Long> {
}
