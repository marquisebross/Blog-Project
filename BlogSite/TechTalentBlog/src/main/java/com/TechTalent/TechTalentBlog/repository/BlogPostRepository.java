package com.TechTalent.TechTalentBlog.repository;

import com.TechTalent.TechTalentBlog.model.BlogPost;
import org.springframework.data.repository.CrudRepository;

public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {
}
