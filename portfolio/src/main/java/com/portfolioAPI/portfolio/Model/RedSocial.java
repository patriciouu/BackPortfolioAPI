
package com.portfolioAPI.portfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class RedSocial {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long redSocialId;
    private String urlInstagram;
    private String urlLinkedin;
    private String urlFacebook;

    public RedSocial() {
    }

    public RedSocial(Long redSocialId, String urlInstagram, String urlLinkedin, String urlFacebook) {
        this.redSocialId = redSocialId;
        this.urlInstagram = urlInstagram;
        this.urlLinkedin = urlLinkedin;
        this.urlFacebook = urlFacebook;
    }
        
}
