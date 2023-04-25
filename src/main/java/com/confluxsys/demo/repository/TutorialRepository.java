package com.confluxsys.demo.repository;

import com.confluxsys.demo.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, long> {
    List<Tutorial> findTutorialsByTagsId(Long tagId);
}
