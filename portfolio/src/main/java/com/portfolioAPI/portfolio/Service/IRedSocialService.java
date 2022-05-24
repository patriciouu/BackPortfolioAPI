
package com.portfolioAPI.portfolio.Service;

import com.portfolioAPI.portfolio.Model.RedSocial;
import java.util.List;


public interface IRedSocialService {
    
    public List<RedSocial> getRedes();
    
    public void saveRed(RedSocial red);
    
    public void deleteRed(Long id);
    
    public RedSocial getRed (Long id);
    
    
}
