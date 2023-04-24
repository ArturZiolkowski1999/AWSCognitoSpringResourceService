package com.example.cognitobackend.security.jwt;

import com.nimbusds.jwt.JWTClaimsSet;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class JwtAuthenticator extends AbstractAuthenticationToken {

    public JwtAuthenticator(Collection<? extends GrantedAuthority> authorities, Object principal, JWTClaimsSet claims) {
        super(authorities);
        this.principal = principal;
        this.claims = claims;
        super.setAuthenticated(true);
    }

    private Object principal;
    private JWTClaimsSet claims;

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }
}
