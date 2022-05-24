
package com.portfolioAPI.portfolio.Repository;

import com.portfolioAPI.portfolio.Model.RedSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedSocialRepository extends JpaRepository <RedSocial, Long>{
    
}
