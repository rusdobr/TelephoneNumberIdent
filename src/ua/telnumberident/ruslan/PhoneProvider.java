/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.telnumberident.ruslan;

import java.util.Objects;

/**
 *
 * @author ruslan
 */
public final class PhoneProvider {
    
    private final String value;
    
    PhoneProvider(String value) {
        this.value = value;
    }
    
    String value() {
        return this.value;
    }
    
    @Override
    public String toString() {
        return this.value();
    }
    
    /**
     *
     * @param object2
     * @return
     */
    @Override
    public boolean equals(Object object2) {
        return object2 instanceof PhoneProvider && this.value.equals(((PhoneProvider)object2).value());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.value);
        return hash;
    }
}
