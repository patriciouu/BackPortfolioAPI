
package com.portfolioAPI.portfolio.Repository;

import com.portfolioAPI.portfolio.Model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository <Skill, Long>{
    
}
